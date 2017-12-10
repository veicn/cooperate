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

    public String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
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

    public String typeName;

    public String getTypeName()
    {
        return typeName;
    }

    public void setTypeName(String typeName)
    {
        this.typeName = typeName;
    }

    public short pTypeId;

    public short getPTypeId()
    {
        return pTypeId;
    }

    public void setPTypeId(short pTypeId)
    {
        this.pTypeId = pTypeId;
    }

    public String pTypeName;

    public String getPTypeName()
    {
        return pTypeName;
    }

    public void setPTypeName(String pTypeName)
    {
        this.pTypeName = pTypeName;
    }

    public String path;

    public String getPath()
    {
        return path;
    }

    public void setPath(String path)
    {
        this.path = path;
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

    public boolean isValid;

    public boolean getIsValid()
    {
        return isValid;
    }

    public void setIsValid(boolean isValid)
    {
        this.isValid = isValid;
    }

    public boolean isIsValid()
    {
        return isValid;
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

    public SimpleNodeDTO()
    {
        this.id = "";
        this.name = "";
        this.pid = "";
        this.typeName = "";
        this.pTypeName = "";
        this.path = "";
        this.createTimeText = "";
        this.lastModifyTimeText = "";
        this.pNodeId = "";
    }

    public SimpleNodeDTO(String id, String name, String pid, short typeId, String typeName, short pTypeId, String pTypeName, String path, long createTimeStamp, String createTimeText, long lastModifyTimeStamp, String lastModifyTimeText, boolean isReadOnly, long fileLength, boolean isDirectory, boolean isValid, String pNodeId)
    {
        this.id = id;
        this.name = name;
        this.pid = pid;
        this.typeId = typeId;
        this.typeName = typeName;
        this.pTypeId = pTypeId;
        this.pTypeName = pTypeName;
        this.path = path;
        this.createTimeStamp = createTimeStamp;
        this.createTimeText = createTimeText;
        this.lastModifyTimeStamp = lastModifyTimeStamp;
        this.lastModifyTimeText = lastModifyTimeText;
        this.isReadOnly = isReadOnly;
        this.fileLength = fileLength;
        this.isDirectory = isDirectory;
        this.isValid = isValid;
        this.pNodeId = pNodeId;
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
            if(this.name != r.name)
            {
                if(this.name == null || r.name == null || !this.name.equals(r.name))
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
            if(this.typeName != r.typeName)
            {
                if(this.typeName == null || r.typeName == null || !this.typeName.equals(r.typeName))
                {
                    return false;
                }
            }
            if(this.pTypeId != r.pTypeId)
            {
                return false;
            }
            if(this.pTypeName != r.pTypeName)
            {
                if(this.pTypeName == null || r.pTypeName == null || !this.pTypeName.equals(r.pTypeName))
                {
                    return false;
                }
            }
            if(this.path != r.path)
            {
                if(this.path == null || r.path == null || !this.path.equals(r.path))
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
            if(this.isReadOnly != r.isReadOnly)
            {
                return false;
            }
            if(this.fileLength != r.fileLength)
            {
                return false;
            }
            if(this.isDirectory != r.isDirectory)
            {
                return false;
            }
            if(this.isValid != r.isValid)
            {
                return false;
            }
            if(this.pNodeId != r.pNodeId)
            {
                if(this.pNodeId == null || r.pNodeId == null || !this.pNodeId.equals(r.pNodeId))
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
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, name);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, pid);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, typeId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, typeName);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, pTypeId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, pTypeName);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, path);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, createTimeStamp);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, createTimeText);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyTimeStamp);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyTimeText);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, isReadOnly);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, fileLength);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, isDirectory);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, isValid);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, pNodeId);
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
        ostr.writeString(this.name);
        ostr.writeString(this.pid);
        ostr.writeShort(this.typeId);
        ostr.writeString(this.typeName);
        ostr.writeShort(this.pTypeId);
        ostr.writeString(this.pTypeName);
        ostr.writeString(this.path);
        ostr.writeLong(this.createTimeStamp);
        ostr.writeString(this.createTimeText);
        ostr.writeLong(this.lastModifyTimeStamp);
        ostr.writeString(this.lastModifyTimeText);
        ostr.writeBool(this.isReadOnly);
        ostr.writeLong(this.fileLength);
        ostr.writeBool(this.isDirectory);
        ostr.writeBool(this.isValid);
        ostr.writeString(this.pNodeId);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.id = istr.readString();
        this.name = istr.readString();
        this.pid = istr.readString();
        this.typeId = istr.readShort();
        this.typeName = istr.readString();
        this.pTypeId = istr.readShort();
        this.pTypeName = istr.readString();
        this.path = istr.readString();
        this.createTimeStamp = istr.readLong();
        this.createTimeText = istr.readString();
        this.lastModifyTimeStamp = istr.readLong();
        this.lastModifyTimeText = istr.readString();
        this.isReadOnly = istr.readBool();
        this.fileLength = istr.readLong();
        this.isDirectory = istr.readBool();
        this.isValid = istr.readBool();
        this.pNodeId = istr.readString();
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

    public static final long serialVersionUID = 417127394L;
}
