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
// Generated from file `StorageData.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.Storage.zeroc;

public class SimpleNodeDTO implements java.lang.Cloneable,
                                      java.io.Serializable
{
    public String id;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String pid;

    public String getPid()
    {
        return pid;
    }

    public void setPid(String pid)
    {
        this.pid = pid;
    }

    public short typeId;

    public short getTypeId()
    {
        return typeId;
    }

    public void setTypeId(short typeId)
    {
        this.typeId = typeId;
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

    public long createTimeStamp;

    public long getCreateTimeStamp()
    {
        return createTimeStamp;
    }

    public void setCreateTimeStamp(long createTimeStamp)
    {
        this.createTimeStamp = createTimeStamp;
    }

    public String createTimeText;

    public String getCreateTimeText()
    {
        return createTimeText;
    }

    public void setCreateTimeText(String createTimeText)
    {
        this.createTimeText = createTimeText;
    }

    public long lastModifyTimeStamp;

    public long getLastModifyTimeStamp()
    {
        return lastModifyTimeStamp;
    }

    public void setLastModifyTimeStamp(long lastModifyTimeStamp)
    {
        this.lastModifyTimeStamp = lastModifyTimeStamp;
    }

    public String lastModifyTimeText;

    public String getLastModifyTimeText()
    {
        return lastModifyTimeText;
    }

    public void setLastModifyTimeText(String lastModifyTimeText)
    {
        this.lastModifyTimeText = lastModifyTimeText;
    }

    public long fileLength;

    public long getFileLength()
    {
        return fileLength;
    }

    public void setFileLength(long fileLength)
    {
        this.fileLength = fileLength;
    }

    public boolean isDirectory;

    public boolean getIsDirectory()
    {
        return isDirectory;
    }

    public void setIsDirectory(boolean isDirectory)
    {
        this.isDirectory = isDirectory;
    }

    public boolean isIsDirectory()
    {
        return isDirectory;
    }

    public boolean isProject;

    public boolean getIsProject()
    {
        return isProject;
    }

    public void setIsProject(boolean isProject)
    {
        this.isProject = isProject;
    }

    public boolean isIsProject()
    {
        return isProject;
    }

    public boolean isTask;

    public boolean getIsTask()
    {
        return isTask;
    }

    public void setIsTask(boolean isTask)
    {
        this.isTask = isTask;
    }

    public boolean isIsTask()
    {
        return isTask;
    }

    public boolean isDesign;

    public boolean getIsDesign()
    {
        return isDesign;
    }

    public void setIsDesign(boolean isDesign)
    {
        this.isDesign = isDesign;
    }

    public boolean isIsDesign()
    {
        return isDesign;
    }

    public boolean isCommit;

    public boolean getIsCommit()
    {
        return isCommit;
    }

    public void setIsCommit(boolean isCommit)
    {
        this.isCommit = isCommit;
    }

    public boolean isIsCommit()
    {
        return isCommit;
    }

    public boolean isHistory;

    public boolean getIsHistory()
    {
        return isHistory;
    }

    public void setIsHistory(boolean isHistory)
    {
        this.isHistory = isHistory;
    }

    public boolean isIsHistory()
    {
        return isHistory;
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

    public String rangeId;

    public String getRangeId()
    {
        return rangeId;
    }

    public void setRangeId(String rangeId)
    {
        this.rangeId = rangeId;
    }

    public String issueId;

    public String getIssueId()
    {
        return issueId;
    }

    public void setIssueId(String issueId)
    {
        this.issueId = issueId;
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

    public String companyId;

    public String getCompanyId()
    {
        return companyId;
    }

    public void setCompanyId(String companyId)
    {
        this.companyId = companyId;
    }

    public String ownerUserId;

    public String getOwnerUserId()
    {
        return ownerUserId;
    }

    public void setOwnerUserId(String ownerUserId)
    {
        this.ownerUserId = ownerUserId;
    }

    public String lastModifyRoleId;

    public String getLastModifyRoleId()
    {
        return lastModifyRoleId;
    }

    public void setLastModifyRoleId(String lastModifyRoleId)
    {
        this.lastModifyRoleId = lastModifyRoleId;
    }

    public boolean isReadOnly;

    public boolean getIsReadOnly()
    {
        return isReadOnly;
    }

    public void setIsReadOnly(boolean isReadOnly)
    {
        this.isReadOnly = isReadOnly;
    }

    public boolean isIsReadOnly()
    {
        return isReadOnly;
    }

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public String path;

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public String getPath()
    {
        return path;
    }

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public void setPath(String path)
    {
        this.path = path;
    }

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public String projectName;

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public String getProjectName()
    {
        return projectName;
    }

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public void setProjectName(String projectName)
    {
        this.projectName = projectName;
    }

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public String issueName;

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public String getIssueName()
    {
        return issueName;
    }

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public void setIssueName(String issueName)
    {
        this.issueName = issueName;
    }

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public String taskName;

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public String getTaskName()
    {
        return taskName;
    }

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public void setTaskName(String taskName)
    {
        this.taskName = taskName;
    }

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public String companyName;

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public String getCompanyName()
    {
        return companyName;
    }

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public String classicName;

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public String getClassicName()
    {
        return classicName;
    }

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public void setClassicName(String classicName)
    {
        this.classicName = classicName;
    }

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public String storagePath;

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public String getStoragePath()
    {
        return storagePath;
    }

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public void setStoragePath(String storagePath)
    {
        this.storagePath = storagePath;
    }

    /**
     * @deprecated 改为lastModifyRoleId
     **/
    @Deprecated
    public String ownerRoleId;

    /**
     * @deprecated 改为lastModifyRoleId
     **/
    @Deprecated
    public String getOwnerRoleId()
    {
        return ownerRoleId;
    }

    /**
     * @deprecated 改为lastModifyRoleId
     **/
    @Deprecated
    public void setOwnerRoleId(String ownerRoleId)
    {
        this.ownerRoleId = ownerRoleId;
    }

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public String ownerName;

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public String getOwnerName()
    {
        return ownerName;
    }

    /**
     * @deprecated 移入FullNodeDTO
     **/
    @Deprecated
    public void setOwnerName(String ownerName)
    {
        this.ownerName = ownerName;
    }

    /**
     * @deprecated 更换为rangeId
     **/
    @Deprecated
    public String classicId;

    /**
     * @deprecated 更换为rangeId
     **/
    @Deprecated
    public String getClassicId()
    {
        return classicId;
    }

    /**
     * @deprecated 更换为rangeId
     **/
    @Deprecated
    public void setClassicId(String classicId)
    {
        this.classicId = classicId;
    }

    public SimpleNodeDTO()
    {
        this.id = "";
        this.pid = "";
        this.name = "";
        this.createTimeText = "";
        this.lastModifyTimeText = "";
        this.projectId = "";
        this.rangeId = "";
        this.issueId = "";
        this.taskId = "";
        this.companyId = "";
        this.ownerUserId = "";
        this.lastModifyRoleId = "";
        this.path = "";
        this.projectName = "";
        this.issueName = "";
        this.taskName = "";
        this.companyName = "";
        this.classicName = "";
        this.storagePath = "";
        this.ownerRoleId = "";
        this.ownerName = "";
        this.classicId = "";
    }

    public SimpleNodeDTO(String id, String pid, short typeId, String name, long createTimeStamp, String createTimeText, long lastModifyTimeStamp, String lastModifyTimeText, long fileLength, boolean isDirectory, boolean isProject, boolean isTask, boolean isDesign, boolean isCommit, boolean isHistory, String projectId, String rangeId, String issueId, String taskId, String companyId, String ownerUserId, String lastModifyRoleId, boolean isReadOnly, String path, String projectName, String issueName, String taskName, String companyName, String classicName, String storagePath, String ownerRoleId, String ownerName, String classicId)
    {
        this.id = id;
        this.pid = pid;
        this.typeId = typeId;
        this.name = name;
        this.createTimeStamp = createTimeStamp;
        this.createTimeText = createTimeText;
        this.lastModifyTimeStamp = lastModifyTimeStamp;
        this.lastModifyTimeText = lastModifyTimeText;
        this.fileLength = fileLength;
        this.isDirectory = isDirectory;
        this.isProject = isProject;
        this.isTask = isTask;
        this.isDesign = isDesign;
        this.isCommit = isCommit;
        this.isHistory = isHistory;
        this.projectId = projectId;
        this.rangeId = rangeId;
        this.issueId = issueId;
        this.taskId = taskId;
        this.companyId = companyId;
        this.ownerUserId = ownerUserId;
        this.lastModifyRoleId = lastModifyRoleId;
        this.isReadOnly = isReadOnly;
        this.path = path;
        this.projectName = projectName;
        this.issueName = issueName;
        this.taskName = taskName;
        this.companyName = companyName;
        this.classicName = classicName;
        this.storagePath = storagePath;
        this.ownerRoleId = ownerRoleId;
        this.ownerName = ownerName;
        this.classicId = classicId;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        SimpleNodeDTO r = null;
        if(rhs instanceof SimpleNodeDTO)
        {
            r = (SimpleNodeDTO)rhs;
        }

        if(r != null)
        {
            if(this.id != r.id)
            {
                if(this.id == null || r.id == null || !this.id.equals(r.id))
                {
                    return false;
                }
            }
            if(this.pid != r.pid)
            {
                if(this.pid == null || r.pid == null || !this.pid.equals(r.pid))
                {
                    return false;
                }
            }
            if(this.typeId != r.typeId)
            {
                return false;
            }
            if(this.name != r.name)
            {
                if(this.name == null || r.name == null || !this.name.equals(r.name))
                {
                    return false;
                }
            }
            if(this.createTimeStamp != r.createTimeStamp)
            {
                return false;
            }
            if(this.createTimeText != r.createTimeText)
            {
                if(this.createTimeText == null || r.createTimeText == null || !this.createTimeText.equals(r.createTimeText))
                {
                    return false;
                }
            }
            if(this.lastModifyTimeStamp != r.lastModifyTimeStamp)
            {
                return false;
            }
            if(this.lastModifyTimeText != r.lastModifyTimeText)
            {
                if(this.lastModifyTimeText == null || r.lastModifyTimeText == null || !this.lastModifyTimeText.equals(r.lastModifyTimeText))
                {
                    return false;
                }
            }
            if(this.fileLength != r.fileLength)
            {
                return false;
            }
            if(this.isDirectory != r.isDirectory)
            {
                return false;
            }
            if(this.isProject != r.isProject)
            {
                return false;
            }
            if(this.isTask != r.isTask)
            {
                return false;
            }
            if(this.isDesign != r.isDesign)
            {
                return false;
            }
            if(this.isCommit != r.isCommit)
            {
                return false;
            }
            if(this.isHistory != r.isHistory)
            {
                return false;
            }
            if(this.projectId != r.projectId)
            {
                if(this.projectId == null || r.projectId == null || !this.projectId.equals(r.projectId))
                {
                    return false;
                }
            }
            if(this.rangeId != r.rangeId)
            {
                if(this.rangeId == null || r.rangeId == null || !this.rangeId.equals(r.rangeId))
                {
                    return false;
                }
            }
            if(this.issueId != r.issueId)
            {
                if(this.issueId == null || r.issueId == null || !this.issueId.equals(r.issueId))
                {
                    return false;
                }
            }
            if(this.taskId != r.taskId)
            {
                if(this.taskId == null || r.taskId == null || !this.taskId.equals(r.taskId))
                {
                    return false;
                }
            }
            if(this.companyId != r.companyId)
            {
                if(this.companyId == null || r.companyId == null || !this.companyId.equals(r.companyId))
                {
                    return false;
                }
            }
            if(this.ownerUserId != r.ownerUserId)
            {
                if(this.ownerUserId == null || r.ownerUserId == null || !this.ownerUserId.equals(r.ownerUserId))
                {
                    return false;
                }
            }
            if(this.lastModifyRoleId != r.lastModifyRoleId)
            {
                if(this.lastModifyRoleId == null || r.lastModifyRoleId == null || !this.lastModifyRoleId.equals(r.lastModifyRoleId))
                {
                    return false;
                }
            }
            if(this.isReadOnly != r.isReadOnly)
            {
                return false;
            }
            if(this.path != r.path)
            {
                if(this.path == null || r.path == null || !this.path.equals(r.path))
                {
                    return false;
                }
            }
            if(this.projectName != r.projectName)
            {
                if(this.projectName == null || r.projectName == null || !this.projectName.equals(r.projectName))
                {
                    return false;
                }
            }
            if(this.issueName != r.issueName)
            {
                if(this.issueName == null || r.issueName == null || !this.issueName.equals(r.issueName))
                {
                    return false;
                }
            }
            if(this.taskName != r.taskName)
            {
                if(this.taskName == null || r.taskName == null || !this.taskName.equals(r.taskName))
                {
                    return false;
                }
            }
            if(this.companyName != r.companyName)
            {
                if(this.companyName == null || r.companyName == null || !this.companyName.equals(r.companyName))
                {
                    return false;
                }
            }
            if(this.classicName != r.classicName)
            {
                if(this.classicName == null || r.classicName == null || !this.classicName.equals(r.classicName))
                {
                    return false;
                }
            }
            if(this.storagePath != r.storagePath)
            {
                if(this.storagePath == null || r.storagePath == null || !this.storagePath.equals(r.storagePath))
                {
                    return false;
                }
            }
            if(this.ownerRoleId != r.ownerRoleId)
            {
                if(this.ownerRoleId == null || r.ownerRoleId == null || !this.ownerRoleId.equals(r.ownerRoleId))
                {
                    return false;
                }
            }
            if(this.ownerName != r.ownerName)
            {
                if(this.ownerName == null || r.ownerName == null || !this.ownerName.equals(r.ownerName))
                {
                    return false;
                }
            }
            if(this.classicId != r.classicId)
            {
                if(this.classicId == null || r.classicId == null || !this.classicId.equals(r.classicId))
                {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public int hashCode()
    {
        int h_ = 5381;
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::SimpleNodeDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, id);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, pid);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, typeId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, name);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, createTimeStamp);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, createTimeText);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyTimeStamp);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyTimeText);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, fileLength);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, isDirectory);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, isProject);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, isTask);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, isDesign);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, isCommit);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, isHistory);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, projectId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, rangeId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, issueId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, taskId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, companyId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, ownerUserId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyRoleId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, isReadOnly);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, path);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, projectName);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, issueName);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, taskName);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, companyName);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, classicName);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, storagePath);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, ownerRoleId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, ownerName);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, classicId);
        return h_;
    }

    public SimpleNodeDTO clone()
    {
        SimpleNodeDTO c = null;
        try
        {
            c = (SimpleNodeDTO)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.id);
        ostr.writeString(this.pid);
        ostr.writeShort(this.typeId);
        ostr.writeString(this.name);
        ostr.writeLong(this.createTimeStamp);
        ostr.writeString(this.createTimeText);
        ostr.writeLong(this.lastModifyTimeStamp);
        ostr.writeString(this.lastModifyTimeText);
        ostr.writeLong(this.fileLength);
        ostr.writeBool(this.isDirectory);
        ostr.writeBool(this.isProject);
        ostr.writeBool(this.isTask);
        ostr.writeBool(this.isDesign);
        ostr.writeBool(this.isCommit);
        ostr.writeBool(this.isHistory);
        ostr.writeString(this.projectId);
        ostr.writeString(this.rangeId);
        ostr.writeString(this.issueId);
        ostr.writeString(this.taskId);
        ostr.writeString(this.companyId);
        ostr.writeString(this.ownerUserId);
        ostr.writeString(this.lastModifyRoleId);
        ostr.writeBool(this.isReadOnly);
        ostr.writeString(this.path);
        ostr.writeString(this.projectName);
        ostr.writeString(this.issueName);
        ostr.writeString(this.taskName);
        ostr.writeString(this.companyName);
        ostr.writeString(this.classicName);
        ostr.writeString(this.storagePath);
        ostr.writeString(this.ownerRoleId);
        ostr.writeString(this.ownerName);
        ostr.writeString(this.classicId);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.id = istr.readString();
        this.pid = istr.readString();
        this.typeId = istr.readShort();
        this.name = istr.readString();
        this.createTimeStamp = istr.readLong();
        this.createTimeText = istr.readString();
        this.lastModifyTimeStamp = istr.readLong();
        this.lastModifyTimeText = istr.readString();
        this.fileLength = istr.readLong();
        this.isDirectory = istr.readBool();
        this.isProject = istr.readBool();
        this.isTask = istr.readBool();
        this.isDesign = istr.readBool();
        this.isCommit = istr.readBool();
        this.isHistory = istr.readBool();
        this.projectId = istr.readString();
        this.rangeId = istr.readString();
        this.issueId = istr.readString();
        this.taskId = istr.readString();
        this.companyId = istr.readString();
        this.ownerUserId = istr.readString();
        this.lastModifyRoleId = istr.readString();
        this.isReadOnly = istr.readBool();
        this.path = istr.readString();
        this.projectName = istr.readString();
        this.issueName = istr.readString();
        this.taskName = istr.readString();
        this.companyName = istr.readString();
        this.classicName = istr.readString();
        this.storagePath = istr.readString();
        this.ownerRoleId = istr.readString();
        this.ownerName = istr.readString();
        this.classicId = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, SimpleNodeDTO v)
    {
        if(v == null)
        {
            _nullMarshalValue.ice_writeMembers(ostr);
        }
        else
        {
            v.ice_writeMembers(ostr);
        }
    }

    static public SimpleNodeDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        SimpleNodeDTO v = new SimpleNodeDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<SimpleNodeDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, SimpleNodeDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<SimpleNodeDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(SimpleNodeDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final SimpleNodeDTO _nullMarshalValue = new SimpleNodeDTO();

    public static final long serialVersionUID = -1405451127L;
}
