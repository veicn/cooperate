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

public class FileVersionDTO implements java.lang.Cloneable,
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

    public String nodeId;

    public String getNodeId()
    {
        return nodeId;
    }

    public void setNodeId(String nodeId)
    {
        this.nodeId = nodeId;
    }

    public String fileVersion;

    public String getFileVersion()
    {
        return fileVersion;
    }

    public void setFileVersion(String fileVersion)
    {
        this.fileVersion = fileVersion;
    }

    public String lastModifyAddress;

    public String getLastModifyAddress()
    {
        return lastModifyAddress;
    }

    public void setLastModifyAddress(String lastModifyAddress)
    {
        this.lastModifyAddress = lastModifyAddress;
    }

    public boolean locking;

    public boolean getLocking()
    {
        return locking;
    }

    public void setLocking(boolean locking)
    {
        this.locking = locking;
    }

    public boolean isLocking()
    {
        return locking;
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

    public String lastModifyDutyId;

    public String getLastModifyDutyId()
    {
        return lastModifyDutyId;
    }

    public void setLastModifyDutyId(String lastModifyDutyId)
    {
        this.lastModifyDutyId = lastModifyDutyId;
    }

    public String lastModifyDutyName;

    public String getLastModifyDutyName()
    {
        return lastModifyDutyName;
    }

    public void setLastModifyDutyName(String lastModifyDutyName)
    {
        this.lastModifyDutyName = lastModifyDutyName;
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

    public FileVersionDTO()
    {
        this.id = "";
        this.nodeId = "";
        this.fileVersion = "";
        this.lastModifyAddress = "";
        this.createTimeText = "";
        this.lastModifyDutyId = "";
        this.lastModifyDutyName = "";
        this.lastModifyTimeText = "";
    }

    public FileVersionDTO(String id, String nodeId, String fileVersion, String lastModifyAddress, boolean locking, long createTimeStamp, String createTimeText, String lastModifyDutyId, String lastModifyDutyName, long lastModifyTimeStamp, String lastModifyTimeText)
    {
        this.id = id;
        this.nodeId = nodeId;
        this.fileVersion = fileVersion;
        this.lastModifyAddress = lastModifyAddress;
        this.locking = locking;
        this.createTimeStamp = createTimeStamp;
        this.createTimeText = createTimeText;
        this.lastModifyDutyId = lastModifyDutyId;
        this.lastModifyDutyName = lastModifyDutyName;
        this.lastModifyTimeStamp = lastModifyTimeStamp;
        this.lastModifyTimeText = lastModifyTimeText;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FileVersionDTO r = null;
        if(rhs instanceof FileVersionDTO)
        {
            r = (FileVersionDTO)rhs;
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
            if(this.nodeId != r.nodeId)
            {
                if(this.nodeId == null || r.nodeId == null || !this.nodeId.equals(r.nodeId))
                {
                    return false;
                }
            }
            if(this.fileVersion != r.fileVersion)
            {
                if(this.fileVersion == null || r.fileVersion == null || !this.fileVersion.equals(r.fileVersion))
                {
                    return false;
                }
            }
            if(this.lastModifyAddress != r.lastModifyAddress)
            {
                if(this.lastModifyAddress == null || r.lastModifyAddress == null || !this.lastModifyAddress.equals(r.lastModifyAddress))
                {
                    return false;
                }
            }
            if(this.locking != r.locking)
            {
                return false;
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
            if(this.lastModifyDutyId != r.lastModifyDutyId)
            {
                if(this.lastModifyDutyId == null || r.lastModifyDutyId == null || !this.lastModifyDutyId.equals(r.lastModifyDutyId))
                {
                    return false;
                }
            }
            if(this.lastModifyDutyName != r.lastModifyDutyName)
            {
                if(this.lastModifyDutyName == null || r.lastModifyDutyName == null || !this.lastModifyDutyName.equals(r.lastModifyDutyName))
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

            return true;
        }

        return false;
    }

    public int hashCode()
    {
        int h_ = 5381;
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::FileVersionDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, id);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, nodeId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, fileVersion);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyAddress);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, locking);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, createTimeStamp);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, createTimeText);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyDutyId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyDutyName);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyTimeStamp);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, lastModifyTimeText);
        return h_;
    }

    public FileVersionDTO clone()
    {
        FileVersionDTO c = null;
        try
        {
            c = (FileVersionDTO)super.clone();
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
        ostr.writeString(this.nodeId);
        ostr.writeString(this.fileVersion);
        ostr.writeString(this.lastModifyAddress);
        ostr.writeBool(this.locking);
        ostr.writeLong(this.createTimeStamp);
        ostr.writeString(this.createTimeText);
        ostr.writeString(this.lastModifyDutyId);
        ostr.writeString(this.lastModifyDutyName);
        ostr.writeLong(this.lastModifyTimeStamp);
        ostr.writeString(this.lastModifyTimeText);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.id = istr.readString();
        this.nodeId = istr.readString();
        this.fileVersion = istr.readString();
        this.lastModifyAddress = istr.readString();
        this.locking = istr.readBool();
        this.createTimeStamp = istr.readLong();
        this.createTimeText = istr.readString();
        this.lastModifyDutyId = istr.readString();
        this.lastModifyDutyName = istr.readString();
        this.lastModifyTimeStamp = istr.readLong();
        this.lastModifyTimeText = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, FileVersionDTO v)
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

    static public FileVersionDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        FileVersionDTO v = new FileVersionDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<FileVersionDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, FileVersionDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<FileVersionDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(FileVersionDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final FileVersionDTO _nullMarshalValue = new FileVersionDTO();

    public static final long serialVersionUID = 1005729311L;
}
