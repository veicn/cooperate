package com.maoding.FileServer.Local;

import com.maoding.Bean.*;
import com.maoding.Const.ApiResponseConst;
import com.maoding.Const.FileServerConst;
import com.maoding.FileServer.BasicFileServerInterface;
import com.maoding.Utils.BeanUtils;
import com.maoding.Utils.ExceptionUtils;
import com.maoding.Utils.FileUtils;
import com.maoding.Utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 深圳市卯丁技术有限公司
 * 作    者 : 张成亮
 * 日    期 : 2017/11/1 14:41
 * 描    述 :
 */
@Service("localServer")
public class LocalServer implements BasicFileServerInterface {
    /** 日志对象 */
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private static final Integer MAX_TRY_TIMES = 5;
    private static final Integer TRY_DELAY = 50;

    public static final String BASE_DIR_NAME = "scope";
    public static final String PATH_NAME = "key";
    public static final Integer DEFAULT_CHUNK_PER_SIZE = 8192;

    private static final String FILE_SERVER_PATH = "C:\\work\\file_server";
    private static final String FILE_UPLOAD_URL = "http://localhost:8087/FileServer/upload";
    private static final String FILE_DOWNLOAD_URL = "http://localhost:8087/FileServer/download";
    private static final String KEY_SIZE = "size";
    private static final String KEY_UPLOAD_ID = "uploadId";

    private static final Map<Integer,Integer> modeMapConst = new HashMap(){
        {
            put(FileServerConst.FILE_SERVER_MODE_DEFAULT, FileServerConst.FILE_SERVER_MODE_RPC);
            put(FileServerConst.FILE_SERVER_MODE_DEFAULT_COM, FileServerConst.FILE_SERVER_MODE_RPC);
            put(FileServerConst.FILE_SERVER_MODE_HTTP_GET, FileServerConst.FILE_SERVER_MODE_HTTP_POST);
            put(FileServerConst.FILE_SERVER_MODE_HTTP_POST, FileServerConst.FILE_SERVER_MODE_HTTP_POST);
            put(FileServerConst.FILE_SERVER_MODE_LOCAL, FileServerConst.FILE_SERVER_MODE_LOCAL);
        }
    };

    private static long t0 = 0; //上传计时器
    private static long pos0 = 0; //上传速度计算参数
    private static long t1 = 0; //下载计时器
    private static long pos1 = 0; //下载速度计算参数

    /**
     * 获取通过http方式上传文件数据库时的需要设置的部分参数
     *
     * @param src
     * @param callbackSetting
     */
    @Override
    public BasicFileRequestDTO getUploadRequest(BasicFileDTO src, Integer mode, BasicCallbackDTO callbackSetting) {
        //补全参数
        if (StringUtils.isEmpty(src.getScope())) src.setScope("");
        if (StringUtils.isEmpty(src.getKey())) src.setKey(UUID.randomUUID().toString() + ".txt");

        //建立申请上传参数对象
        BasicFileRequestDTO requestDTO = new BasicFileRequestDTO();
        requestDTO.setUrl(FILE_UPLOAD_URL);
        requestDTO.putParam(BASE_DIR_NAME,src.getScope());
        requestDTO.putParam(PATH_NAME,src.getKey());
        if (modeMapConst.containsKey(mode)){
            requestDTO.setMode(modeMapConst.get(mode));
        } else {
            requestDTO.setMode(FileServerConst.FILE_SERVER_MODE_RPC);
        }
        requestDTO.putParam(KEY_UPLOAD_ID,UUID.randomUUID().toString());
        return requestDTO;
    }

    /**
     * 获取通过http方式下载文件数据库时的需要设置的部分参数
     *
     * @param src
     * @param callbackSetting
     */
    @Override
    public BasicFileRequestDTO getDownloadRequest(BasicFileDTO src, Integer mode, BasicCallbackDTO callbackSetting) {
        //检查参数
        assert src != null;
        assert src.getKey() != null;
        
        //补全参数
        if (StringUtils.isEmpty(src.getScope())) src.setScope("");

        //建立申请下载参数对象
        BasicFileRequestDTO requestDTO = new BasicFileRequestDTO();
        requestDTO.setUrl(FILE_DOWNLOAD_URL);
        requestDTO.putParam(BASE_DIR_NAME,src.getScope());
        requestDTO.putParam(PATH_NAME,src.getKey());
        if (modeMapConst.containsKey(mode)){
            requestDTO.setMode(modeMapConst.get(mode));
        } else {
            requestDTO.setMode(FileServerConst.FILE_SERVER_MODE_RPC);
        }
        File f = new File(FILE_SERVER_PATH + "/" + src.getKey());
        requestDTO.putParam(KEY_SIZE,((Long)f.length()).toString());
        return requestDTO;
    }

    /**
     * 上传文件分片内容
     *
     * @param request
     */
    @Override
    public BasicUploadResultDTO upload(BasicUploadRequestDTO request) {
        //检查参数
        assert request != null;
        assert request.getMultipart() != null;
        assert request.getMultipart().getData() != null;
        assert (request.getChunkId() != null) && (request.getChunkId() >= 0);

        //补全参数
        BasicFileMultipartDTO fileDTO = request.getMultipart();
        if (StringUtils.isEmpty(fileDTO.getScope())) fileDTO.setScope("");
        if (StringUtils.isEmpty(fileDTO.getKey())) fileDTO.setKey(UUID.randomUUID().toString() + ".txt");
        if ((fileDTO.getPos() == null) || (fileDTO.getPos() < 0)) fileDTO.setPos((long)request.getChunkId() * request.getChunkPerSize());
        if ((fileDTO.getSize() == null) || (fileDTO.getSize() <= 0)) fileDTO.setSize(fileDTO.getData().length);
        if ((request.getChunkPerSize() == null) && (request.getChunkPerSize() <= 0)) request.setChunkPerSize(DEFAULT_CHUNK_PER_SIZE);
        if ((request.getChunkSize() == null) || (request.getChunkSize() <= 0)) request.setChunkSize(fileDTO.getSize());

        //写入文件
        BasicUploadResultDTO result = BeanUtils.createFrom(request,BasicUploadResultDTO.class);
        RandomAccessFile rf = null;

        byte[] data = fileDTO.getData();
        assert data != null;
        int off = 0;
        int len = request.getChunkSize();
        assert (len <= request.getChunkPerSize()) && (len <= data.length);
        long pos = (long) request.getChunkId() * request.getChunkPerSize();

        if (request.getChunkId() == 0) {
            t0 = System.currentTimeMillis();
            pos0 = pos + len;
            log.info("=====>接收到第一个包:" + new SimpleDateFormat("HH:mm:ss.sss").format(new Date(t0)));
        }

        if (!((new File(FILE_SERVER_PATH + "/" + fileDTO.getScope())).isDirectory())) (new File(FILE_SERVER_PATH + "/" +fileDTO.getScope())).mkdirs();
        for (Integer i=0; i<MAX_TRY_TIMES; i++) {
            try {
                rf = new RandomAccessFile(FILE_SERVER_PATH + "/" + fileDTO.getScope() + "/" + fileDTO.getKey(), "rw");
                break;
            } catch (IOException e) {
                FileUtils.close(rf);
                ExceptionUtils.logWarn(log,e,false,"打开文件" + FILE_SERVER_PATH + "/" + fileDTO.getScope() + "/" + fileDTO.getKey() + "出错");
                try {
                    Thread.sleep(TRY_DELAY);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                rf = null;
            }
        }

        try {
            if (rf == null) throw new IOException();
            if (rf.length() < pos) rf.setLength(pos + len);
            rf.seek(pos);
            rf.write(data,off,len);
        } catch (IOException e) {
            FileUtils.close(rf);
            String msg = "写入文件" + FILE_SERVER_PATH + "/" + fileDTO.getScope() + "/" + fileDTO.getKey() + "时出错";
            ExceptionUtils.logWarn(log,e,false,msg);
            result.setStatus(ApiResponseConst.FAILED);
            result.setMsg(msg);
            return result;
        }

        FileUtils.close(rf);
        result.setStatus(ApiResponseConst.SUCCESS);

        if (request.getChunkId() > 0) {
            long t = (System.currentTimeMillis() - t0);
            assert (t > 0);
            long rev = pos + len;
            long cal = rev - pos0;
            log.info("已写入第" + request.getChunkId() + "块:用时" + t + "ms,共接收到"
                    + StringUtils.calBytes(rev)  + "，速度" + StringUtils.calSpeed(cal,t));
        }
        return result;
    }

    /**
     * 下载文件分片内容
     *
     * @param request
     */
    @Override
    public BasicDownloadResultDTO download(BasicDownloadRequestDTO request) {
        //检查参数
        assert request != null;
        assert request.getKey() != null;
        assert (request.getChunkId() != null) && (request.getChunkId() >= 0);


        //补全参数
        if (StringUtils.isEmpty(request.getScope())) request.setScope("");
        if ((request.getChunkSize() == null) || (request.getChunkSize() <= 0)) request.setChunkSize(DEFAULT_CHUNK_PER_SIZE);

        if (request.getChunkId() == 0) {
            t1 = System.currentTimeMillis();
            log.info("=====>接收到下载请求:" + new SimpleDateFormat("HH:mm:ss.sss").format(new Date(t1)));
        }

        //下载文件
        BasicDownloadResultDTO result = BeanUtils.createFrom(request,BasicDownloadResultDTO.class);
        RandomAccessFile rf = null;
        //打开文件
        for (Integer i=0; i<MAX_TRY_TIMES; i++) {
            try {
                rf = new RandomAccessFile(FILE_SERVER_PATH + "/" + request.getScope() + "/" + request.getKey(), "r");
                break;
            } catch (IOException e) {
                ExceptionUtils.logWarn(log, e, false, "打开文件" + FILE_SERVER_PATH + "/" + request.getScope() + "/" + request.getKey() + "出错");
                try {
                    Thread.sleep(TRY_DELAY);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                rf = null;
            }
        }

        try {
            if (rf == null) throw new IOException("打开文件" + FILE_SERVER_PATH + "/" + request.getScope() + "/" + request.getKey() + "出错");
            //定位
            long pos = (long)request.getChunkId() * request.getChunkSize();
            long length = rf.length();
            assert pos < length;
            rf.seek(pos);
            //读取文件内容
            byte[] bytes = new byte[request.getChunkSize()];
            int size = rf.read(bytes);
            assert size > 0;
            if (size < bytes.length) bytes = Arrays.copyOfRange(bytes,0,size);

            //设置返回参数
            long posLast = pos + size;
            Integer chunkCount = (posLast < length) ? ((((int)(length - posLast)) / request.getChunkSize()) + 1) : 0;
            BasicFileMultipartDTO multipart = BeanUtils.createFrom(request,BasicFileMultipartDTO.class);
            multipart.setPos(pos);
            multipart.setSize(size);
            multipart.setData(bytes);

            result.setChunkCount(chunkCount);
            result.setChunkSize(size);
            result.setData(multipart);
            result.setStatus(ApiResponseConst.SUCCESS);
        } catch (IOException e) {
            ExceptionUtils.logError(log,e);
            result.setError();
        } finally {
            FileUtils.close(rf);
        }

        if (result.getData() != null) {
            long t = (System.currentTimeMillis() - t1);
            assert (t > 0);
            long c = result.getData().getPos() + result.getData().getSize();
            log.info("第" + request.getChunkId() + "块已准备好:用时" + t + "ms,共准备了"
                    + StringUtils.calBytes(c) + "，速度" + StringUtils.calSpeed(c,t));
        }
        return result;
    }

    /**
     * 在文件服务器上复制文件，复制到同一空间，返回复制后的文件标识
     *
     * @param src
     */
    @Override
    public String duplicateFile(BasicFileDTO src) {
        return null;
    }

    /**
     * 判断在文件服务器上是否存在指定文件
     *
     * @param src
     */
    @Override
    public Boolean isExist(BasicFileDTO src) {
        return null;
    }

    /**
     * 获取文件服务器上某一空间上的所有文件
     *
     * @param scope
     */
    @Override
    public List<String> listFile(String scope) {
        return null;
    }

    /**
     * 获取文件服务器上的所有空间
     */
    @Override
    public List<String> listScope() {
        return null;
    }

    /**
     * 在文件服务器上删除指定文件
     *
     * @param src
     */
    @Override
    public void deleteFile(BasicFileDTO src) {

    }
}
