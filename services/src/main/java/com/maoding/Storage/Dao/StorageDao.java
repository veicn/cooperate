package com.maoding.Storage.Dao;

import com.maoding.Base.BaseDao;
import com.maoding.FileServer.zeroc.FileDTO;
import com.maoding.Storage.Dto.DesignTaskDTO;
import com.maoding.Storage.Dto.FileUnionDTO;
import com.maoding.Storage.Dto.QueryByPidAndNameDTO;
import com.maoding.Storage.Dto.QueryNodeDTO;
import com.maoding.Storage.Entity.StorageEntity;
import com.maoding.Storage.zeroc.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 深圳市卯丁技术有限公司
 * 作    者 : 张成亮
 * 日    期 : 2017/11/20 11:37
 * 描    述 :
 */
@Repository
public interface StorageDao extends BaseDao<StorageEntity> {
    /** 正在实现的接口 */
    /** 获取本文件信息 */
    FileNodeDTO getFileNodeInfo(QueryNodeDTO query);

    List<String> listMajor();
    SimpleNodeDTO getCommitRoot(QueryNodeDTO query);
    DesignTaskDTO getDesignTaskInfo(QueryNodeDTO query);

    List<SimpleNodeDTO> listAllNode(QueryNodeDTO query);
    SimpleNodeDTO getNodeInfo(QueryNodeDTO query);
    Boolean hasChild(QueryNodeDTO query);
    Boolean hasRootChild(QueryNodeDTO query);
    FileDTO getRealFile(QueryNodeDTO query);

    FileUnionDTO selectFileEntityUnion(QueryNodeDTO query);

    /** 准备实现的接口 */
    List<SimpleNodeDTO> listCompanyRootNode(QueryNodeDTO query);
    List<SimpleNodeDTO> listCompanySubNode(QueryNodeDTO query);

    /** 已经实现的接口 */
    List<SimpleNodeDTO> listRootNode(QueryNodeDTO query);
    List<SimpleNodeDTO> listSubNode(QueryNodeDTO query);
    List<String> listAllSubNodeIdByPath(String path);
    List<SimpleNodeDTO> listStorageRootNode(QueryNodeDTO query);
    List<SimpleNodeDTO> listStorageSubNode(QueryNodeDTO query);
    SimpleNodeDTO getStorageNode(QueryNodeDTO query);
    SimpleNodeDTO getStorageNodeByRedundancyPath(QueryNodeDTO query);
    SimpleNodeDTO getTaskNodeByRedundancyPath(QueryNodeDTO query);
    SimpleNodeDTO getProjectNodeByRedundancyPath(QueryNodeDTO query);
    List<SimpleNodeDTO> listProjectRootNode(QueryNodeDTO query);
    SimpleNodeDTO getProjectNode(QueryNodeDTO query);
    SimpleNodeDTO getTaskNode(QueryNodeDTO query);
    List<SimpleNodeDTO> listTaskSubNode(QueryNodeDTO query);
    Integer countProjectRootNode(QueryNodeDTO query);
    Integer countTaskSubNode(QueryNodeDTO query);
    Integer countStorageRootNode(QueryNodeDTO query);
    Integer countStorageSubNode(QueryNodeDTO query);

    /** 查找文件服务器上的文件使用记录 */
    List<CooperateFileDTO> listFileByScopeAndKey(CooperationQueryDTO query);
    /** 获取本目录信息 */
    CooperateDirNodeDTO getDirNodeInfo(CooperationQueryDTO query);
    CooperateDirNodeDTO getDirNodeInfoByNodeId(String nodeId);

    FileNodeDTO getFileNodeInfoByNodeId(String nodeId);
    /** 查找协同子目录 */
    List<CooperateDirNodeDTO> listSubDir(CooperationQueryDTO query);
    /** 查找目录内协同文件 */
    List<CooperateFileDTO> listMainFile(List<String> dirIdList);
    /** 查找协同文件的参考文件 */
    List<FileNodeDTO> listRelatedFile(String nodeId);
    /** 查找协同文件版本 */
    List<FileVersionDTO> listVersion(String nodeId);
    /** 使用pid和name查找树节点记录 */
    StorageEntity selectByPIdAndName(QueryByPidAndNameDTO query);
    /** 使用全路径名查找节点简单信息 */
    SimpleNodeDTO getSimpleNodeByPath(String path);
    /** 根据全路径名获取第一个子节点类型 */
    Short getFirstChildTypeIdByPath(String path);
    /** 根据全路径名获取第一个子节点 */
    StorageEntity getFirstChildNodeByPath(String path);
    /** 根据全路径名获取树id */
    StorageEntity selectByPath(String path);
    /** 根据全路径名获取目录详细信息 */
    CooperateDirNodeDTO getDirNodeInfoByPath(String path);
    /** 根据全路径名获取文件详细信息 */
    FileNodeDTO getFileNodeInfoByPath(String path);
    /** 根据节点编号获取一层子节点简单信息 */
    List<SimpleNodeDTO> listSubNodeByNodeId(String nodeId);
    /** 更改子节点全路径名 */
    int updateParentPath(@Param("oldPath") String oldPath,@Param("newPath") String newPath);
    /** 根据全路径名获取最靠近的节点 */
    StorageEntity selectByRedundancyPath(String path);

    /** 有可能被删除的接口 */
    @Deprecated
    SimpleNodeDTO getTaskNodeByRedundancyPath2(QueryNodeDTO query);
    @Deprecated
    SimpleNodeDTO getTaskNode2(QueryNodeDTO query);
    @Deprecated
    List<SimpleNodeDTO> listTaskSubNode2(QueryNodeDTO query);
    @Deprecated
    Integer countTaskSubNode2(QueryNodeDTO query);
}
