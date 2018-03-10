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

public class QueryFullNodeDTO implements java.lang.Cloneable,
                                         java.io.Serializable
{
    public boolean textQuery;

    public boolean getTextQuery()
    {
        return textQuery;
    }

    public void setTextQuery(boolean textQuery)
    {
        this.textQuery = textQuery;
    }

    public boolean isTextQuery()
    {
        return textQuery;
    }

    public boolean fileQuery;

    public boolean getFileQuery()
    {
        return fileQuery;
    }

    public void setFileQuery(boolean fileQuery)
    {
        this.fileQuery = fileQuery;
    }

    public boolean isFileQuery()
    {
        return fileQuery;
    }

    public boolean historyQuery;

    public boolean getHistoryQuery()
    {
        return historyQuery;
    }

    public void setHistoryQuery(boolean historyQuery)
    {
        this.historyQuery = historyQuery;
    }

    public boolean isHistoryQuery()
    {
        return historyQuery;
    }

    public long historyStartTimeStamp;

    public long getHistoryStartTimeStamp()
    {
        return historyStartTimeStamp;
    }

    public void setHistoryStartTimeStamp(long historyStartTimeStamp)
    {
        this.historyStartTimeStamp = historyStartTimeStamp;
    }

    public long historyEndTimeStamp;

    public long getHistoryEndTimeStamp()
    {
        return historyEndTimeStamp;
    }

    public void setHistoryEndTimeStamp(long historyEndTimeStamp)
    {
        this.historyEndTimeStamp = historyEndTimeStamp;
    }

    public QueryFullNodeDTO()
    {
    }

    public QueryFullNodeDTO(boolean textQuery, boolean fileQuery, boolean historyQuery, long historyStartTimeStamp, long historyEndTimeStamp)
    {
        this.textQuery = textQuery;
        this.fileQuery = fileQuery;
        this.historyQuery = historyQuery;
        this.historyStartTimeStamp = historyStartTimeStamp;
        this.historyEndTimeStamp = historyEndTimeStamp;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        QueryFullNodeDTO r = null;
        if(rhs instanceof QueryFullNodeDTO)
        {
            r = (QueryFullNodeDTO)rhs;
        }

        if(r != null)
        {
            if(this.textQuery != r.textQuery)
            {
                return false;
            }
            if(this.fileQuery != r.fileQuery)
            {
                return false;
            }
            if(this.historyQuery != r.historyQuery)
            {
                return false;
            }
            if(this.historyStartTimeStamp != r.historyStartTimeStamp)
            {
                return false;
            }
            if(this.historyEndTimeStamp != r.historyEndTimeStamp)
            {
                return false;
            }

            return true;
        }

        return false;
    }

    public int hashCode()
    {
        int h_ = 5381;
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::QueryFullNodeDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, textQuery);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, fileQuery);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, historyQuery);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, historyStartTimeStamp);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, historyEndTimeStamp);
        return h_;
    }

    public QueryFullNodeDTO clone()
    {
        QueryFullNodeDTO c = null;
        try
        {
            c = (QueryFullNodeDTO)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeBool(this.textQuery);
        ostr.writeBool(this.fileQuery);
        ostr.writeBool(this.historyQuery);
        ostr.writeLong(this.historyStartTimeStamp);
        ostr.writeLong(this.historyEndTimeStamp);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.textQuery = istr.readBool();
        this.fileQuery = istr.readBool();
        this.historyQuery = istr.readBool();
        this.historyStartTimeStamp = istr.readLong();
        this.historyEndTimeStamp = istr.readLong();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, QueryFullNodeDTO v)
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

    static public QueryFullNodeDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        QueryFullNodeDTO v = new QueryFullNodeDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<QueryFullNodeDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, QueryFullNodeDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.VSize))
        {
            ostr.writeSize(19);
            ice_write(ostr, v);
        }
    }

    static public java.util.Optional<QueryFullNodeDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.VSize))
        {
            istr.skipSize();
            return java.util.Optional.of(QueryFullNodeDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final QueryFullNodeDTO _nullMarshalValue = new QueryFullNodeDTO();

    public static final long serialVersionUID = -1778831625L;
}
