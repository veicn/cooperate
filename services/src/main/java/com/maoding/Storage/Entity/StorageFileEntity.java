package com.maoding.Storage.Entity;

import com.maoding.Base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 深圳市卯丁技术有限公司
 * 作    者 : 张成亮
 * 日    期 : 2017/11/16 22:12
 * 描    述 :
 */
@Table(name = "maoding_storage_file")
public class StorageFileEntity extends BaseEntity {
    /** 以只读方式打开的文件的实际存储位置名称 */
    @Column
    private String fileScope;
    /** 以只读方式打开的文件的实际保存名称 */
    @Column
    private String fileKey;
    /** 文件类型 */
    @Column
    private Short fileTypeId;
    /** 校验和 */
    @Column
    private String fileChecksum;
    /** 最后上传的地址 */
    @Column
    private String lastModifyAddress;
    /** 用户自定义版本 */
    @Column
    private String fileVersion;
    /** 同步模式，0-手动同步，1-自动更新 */
    @Column
    private Short syncModeId;
    /** 以读写方式打开的文件的实际存储位置名称 */
    @Column
    private String uploadScope;
    /** 以读写方式打开的文件的实际保存名称 */
    @Column
    private String uploadKey;
    /** 文件所属的项目id */
    @Column
    private String projectId;
    /** 文件所属的签发任务id */
    @Column
    private String issueId;
    /** 文件所属的生产任务id */
    @Column
    private String taskId;
    /** 文件所属的组织id */
    @Column
    private String organizationId;

    public String getFileScope() {
        return fileScope;
    }

    public void setFileScope(String fileScope) {
        this.fileScope = fileScope;
    }

    public String getFileKey() {
        return fileKey;
    }

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }

    public Short getFileTypeId() {
        return fileTypeId;
    }

    public void setFileTypeId(Short fileTypeId) {
        this.fileTypeId = fileTypeId;
    }

    public String getFileChecksum() {
        return fileChecksum;
    }

    public void setFileChecksum(String fileChecksum) {
        this.fileChecksum = fileChecksum;
    }

    public String getLastModifyAddress() {
        return lastModifyAddress;
    }

    public void setLastModifyAddress(String lastModifyAddress) {
        this.lastModifyAddress = lastModifyAddress;
    }

    public String getFileVersion() {
        return fileVersion;
    }

    public void setFileVersion(String fileVersion) {
        this.fileVersion = fileVersion;
    }

    public Short getSyncModeId() {
        return syncModeId;
    }

    public void setSyncModeId(Short syncModeId) {
        this.syncModeId = syncModeId;
    }


    public String getUploadScope() {
        return uploadScope;
    }

    public void setUploadScope(String uploadScope) {
        this.uploadScope = uploadScope;
    }

    public String getUploadKey() {
        return uploadKey;
    }

    public void setUploadKey(String uploadKey) {
        this.uploadKey = uploadKey;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }
}
