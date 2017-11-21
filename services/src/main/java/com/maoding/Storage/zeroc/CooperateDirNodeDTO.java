// **********************************************************************
//
// Copyright (c) 2003-2017 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.7.0
//
// <auto-generated>
//
// Generated from file `Storage.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.Storage.zeroc;

public class CooperateDirNodeDTO extends com.zeroc.Ice.Value
{
    public CooperateDirNodeDTO()
    {
        this.id = "";
        this.name = "";
        this.pNodeId = "";
        this.detailId = "";
        this.fullName = "";
        this.userId = "";
        this.dutyId = "";
        this.userName = "";
        this.aliasName = "";
        this.orgId = "";
        this.orgName = "";
        this.projectId = "";
        this.projectName = "";
        this.taskId = "";
        this.taskName = "";
        this.typeName = "";
    }

    public CooperateDirNodeDTO(String id, String name, String pNodeId, String detailId, String fullName, String userId, String dutyId, String userName, String aliasName, String orgId, String orgName, String projectId, String projectName, String taskId, String taskName, int typeId, String typeName, java.util.Date createTime, int fileCount, java.util.List<CooperateFileDTO> fileList)
    {
        this.id = id;
        this.name = name;
        this.pNodeId = pNodeId;
        this.detailId = detailId;
        this.fullName = fullName;
        this.userId = userId;
        this.dutyId = dutyId;
        this.userName = userName;
        this.aliasName = aliasName;
        this.orgId = orgId;
        this.orgName = orgName;
        this.projectId = projectId;
        this.projectName = projectName;
        this.taskId = taskId;
        this.taskName = taskName;
        this.typeId = typeId;
        this.typeName = typeName;
        this.createTime = createTime;
        this.fileCount = fileCount;
        this.fileList = fileList;
    }

    public String id;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String pNodeId;

    public String getPNodeId()
    {
        return pNodeId;
    }

    public void setPNodeId(String pNodeId)
    {
        this.pNodeId = pNodeId;
    }

    public String detailId;

    public String getDetailId()
    {
        return detailId;
    }

    public void setDetailId(String detailId)
    {
        this.detailId = detailId;
    }

    public String fullName;

    public String getFullName()
    {
        return fullName;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public String userId;

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String dutyId;

    public String getDutyId()
    {
        return dutyId;
    }

    public void setDutyId(String dutyId)
    {
        this.dutyId = dutyId;
    }

    public String userName;

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String aliasName;

    public String getAliasName()
    {
        return aliasName;
    }

    public void setAliasName(String aliasName)
    {
        this.aliasName = aliasName;
    }

    public String orgId;

    public String getOrgId()
    {
        return orgId;
    }

    public void setOrgId(String orgId)
    {
        this.orgId = orgId;
    }

    public String orgName;

    public String getOrgName()
    {
        return orgName;
    }

    public void setOrgName(String orgName)
    {
        this.orgName = orgName;
    }

    public String projectId;

    public String getProjectId()
    {
        return projectId;
    }

    public void setProjectId(String projectId)
    {
        this.projectId = projectId;
    }

    public String projectName;

    public String getProjectName()
    {
        return projectName;
    }

    public void setProjectName(String projectName)
    {
        this.projectName = projectName;
    }

    public String taskId;

    public String getTaskId()
    {
        return taskId;
    }

    public void setTaskId(String taskId)
    {
        this.taskId = taskId;
    }

    public String taskName;

    public String getTaskName()
    {
        return taskName;
    }

    public void setTaskName(String taskName)
    {
        this.taskName = taskName;
    }

    public int typeId;

    public int getTypeId()
    {
        return typeId;
    }

    public void setTypeId(int typeId)
    {
        this.typeId = typeId;
    }

    public String typeName;

    public String getTypeName()
    {
        return typeName;
    }

    public void setTypeName(String typeName)
    {
        this.typeName = typeName;
    }

    public java.util.Date createTime;

    public java.util.Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(java.util.Date createTime)
    {
        this.createTime = createTime;
    }

    public int fileCount;

    public int getFileCount()
    {
        return fileCount;
    }

    public void setFileCount(int fileCount)
    {
        this.fileCount = fileCount;
    }

    public java.util.List<CooperateFileDTO> fileList;

    public java.util.List<CooperateFileDTO> getFileList()
    {
        return fileList;
    }

    public void setFileList(java.util.List<CooperateFileDTO> fileList)
    {
        this.fileList = fileList;
    }

    public CooperateDirNodeDTO clone()
    {
        return (CooperateDirNodeDTO)super.clone();
    }

    public static String ice_staticId()
    {
        return "::zeroc::CooperateDirNodeDTO";
    }

    @Override
    public String ice_id()
    {
        return ice_staticId();
    }

    public static final long serialVersionUID = -624606271L;

    @Override
    protected void _iceWriteImpl(com.zeroc.Ice.OutputStream ostr_)
    {
        ostr_.startSlice(ice_staticId(), -1, true);
        ostr_.writeString(id);
        ostr_.writeString(name);
        ostr_.writeString(pNodeId);
        ostr_.writeString(detailId);
        ostr_.writeString(fullName);
        ostr_.writeString(userId);
        ostr_.writeString(dutyId);
        ostr_.writeString(userName);
        ostr_.writeString(aliasName);
        ostr_.writeString(orgId);
        ostr_.writeString(orgName);
        ostr_.writeString(projectId);
        ostr_.writeString(projectName);
        ostr_.writeString(taskId);
        ostr_.writeString(taskName);
        ostr_.writeInt(typeId);
        ostr_.writeString(typeName);
        ostr_.writeSerializable(createTime);
        ostr_.writeInt(fileCount);
        CooperateFileListHelper.write(ostr_, fileList);
        ostr_.endSlice();
    }

    @Override
    protected void _iceReadImpl(com.zeroc.Ice.InputStream istr_)
    {
        istr_.startSlice();
        id = istr_.readString();
        name = istr_.readString();
        pNodeId = istr_.readString();
        detailId = istr_.readString();
        fullName = istr_.readString();
        userId = istr_.readString();
        dutyId = istr_.readString();
        userName = istr_.readString();
        aliasName = istr_.readString();
        orgId = istr_.readString();
        orgName = istr_.readString();
        projectId = istr_.readString();
        projectName = istr_.readString();
        taskId = istr_.readString();
        taskName = istr_.readString();
        typeId = istr_.readInt();
        typeName = istr_.readString();
        createTime = istr_.readSerializable(java.util.Date.class);
        fileCount = istr_.readInt();
        fileList = CooperateFileListHelper.read(istr_);
        istr_.endSlice();
    }
}
