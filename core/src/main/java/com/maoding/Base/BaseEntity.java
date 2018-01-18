package com.maoding.Base;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * 深圳市卯丁技术有限公司
 * 作    者 : 张成亮
 * 日    期 : 2017/9/12 19:12
 * 描    述 :
 */
public class BaseEntity implements Serializable,Cloneable {
    /** 实体ID */
    @GeneratedValue(generator = "UUID")
    @Id
    private String id;

    /** 删除标志 */
    @Column
    @NotNull
    @Deprecated
    private Integer deleted;

    /** 创建时间 */
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 最后修改时间 */
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyTime;

    /** 最后修改者ID */
    @Column
    private String lastModifyUserId;

    /** 最后修改者角色ID */
    @Column
    private String lastModifyRoleId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getLastModifyUserId() {
        return lastModifyUserId;
    }

    public void setLastModifyUserId(String lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId;
    }

    public String getLastModifyRoleId() {
        return lastModifyRoleId;
    }

    public void setLastModifyRoleId(String lastModifyRoleId) {
        this.lastModifyRoleId = lastModifyRoleId;
    }

    public BaseEntity(){
        reset();
    }

    /** 重新初始化 */
    public BaseEntity reset() {
        resetId();
        resetTime();
        return this;
    }

    /** 准备更新 */
    public BaseEntity update() {
        resetDeleted();
        resetLastModifyTime();
        return this;
    }

    /** 清理被初始化的字段 */
    public BaseEntity clear() {
        setId(null);
        setDeleted(null);
        setCreateTime(null);
        setLastModifyTime(null);
        return this;
    }

    /** 重新初始化时间 */
    public void resetTime(){
        resetDeleted();
        resetCreateTime();
        resetLastModifyTime();
    }

    /** 重置主键Id为新的UUID */
    public void resetId() {
        id = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
    }

    /** 重置删除标志 */
    public void resetDeleted(){deleted = 0;}

    /** 重置创建时间为当前时间 */
    public void resetCreateTime() {
        createTime = new Date();
    }

    /** 重置最后更改时间为当前时间 */
    public void resetLastModifyTime() {
        lastModifyTime = new Date();
    }
}

