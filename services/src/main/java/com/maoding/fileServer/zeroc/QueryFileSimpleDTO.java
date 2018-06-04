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
// Generated from file `FileServerData.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.fileServer.zeroc;

public class QueryFileSimpleDTO implements java.lang.Cloneable,
                                           java.io.Serializable
{
    public String ownerUserId;

    public String getOwnerUserId()
    {
        return ownerUserId;
    }

    public void setOwnerUserId(String ownerUserId)
    {
        this.ownerUserId = ownerUserId;
    }

    public String notOwnerUserId;

    public String getNotOwnerUserId()
    {
        return notOwnerUserId;
    }

    public void setNotOwnerUserId(String notOwnerUserId)
    {
        this.notOwnerUserId = notOwnerUserId;
    }

    public String designMode;

    public String getDesignMode()
    {
        return designMode;
    }

    public void setDesignMode(String designMode)
    {
        this.designMode = designMode;
    }

    public String caMode;

    public String getCaMode()
    {
        return caMode;
    }

    public void setCaMode(String caMode)
    {
        this.caMode = caMode;
    }

    public String commitMode;

    public String getCommitMode()
    {
        return commitMode;
    }

    public void setCommitMode(String commitMode)
    {
        this.commitMode = commitMode;
    }

    public String historyMode;

    public String getHistoryMode()
    {
        return historyMode;
    }

    public void setHistoryMode(String historyMode)
    {
        this.historyMode = historyMode;
    }

    public String accountId;

    public String getAccountId()
    {
        return accountId;
    }

    public void setAccountId(String accountId)
    {
        this.accountId = accountId;
    }

    public String isTaskDesigner;

    public String getIsTaskDesigner()
    {
        return isTaskDesigner;
    }

    public void setIsTaskDesigner(String isTaskDesigner)
    {
        this.isTaskDesigner = isTaskDesigner;
    }

    public String isTaskChecker;

    public String getIsTaskChecker()
    {
        return isTaskChecker;
    }

    public void setIsTaskChecker(String isTaskChecker)
    {
        this.isTaskChecker = isTaskChecker;
    }

    public String isTaskAuditor;

    public String getIsTaskAuditor()
    {
        return isTaskAuditor;
    }

    public void setIsTaskAuditor(String isTaskAuditor)
    {
        this.isTaskAuditor = isTaskAuditor;
    }

    public QueryFileSimpleDTO()
    {
        this.ownerUserId = "";
        this.notOwnerUserId = "";
        this.designMode = "";
        this.caMode = "";
        this.commitMode = "";
        this.historyMode = "";
        this.accountId = "";
        this.isTaskDesigner = "";
        this.isTaskChecker = "";
        this.isTaskAuditor = "";
    }

    public QueryFileSimpleDTO(String ownerUserId, String notOwnerUserId, String designMode, String caMode, String commitMode, String historyMode, String accountId, String isTaskDesigner, String isTaskChecker, String isTaskAuditor)
    {
        this.ownerUserId = ownerUserId;
        this.notOwnerUserId = notOwnerUserId;
        this.designMode = designMode;
        this.caMode = caMode;
        this.commitMode = commitMode;
        this.historyMode = historyMode;
        this.accountId = accountId;
        this.isTaskDesigner = isTaskDesigner;
        this.isTaskChecker = isTaskChecker;
        this.isTaskAuditor = isTaskAuditor;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        QueryFileSimpleDTO r = null;
        if(rhs instanceof QueryFileSimpleDTO)
        {
            r = (QueryFileSimpleDTO)rhs;
        }

        if(r != null)
        {
            if(this.ownerUserId != r.ownerUserId)
            {
                if(this.ownerUserId == null || r.ownerUserId == null || !this.ownerUserId.equals(r.ownerUserId))
                {
                    return false;
                }
            }
            if(this.notOwnerUserId != r.notOwnerUserId)
            {
                if(this.notOwnerUserId == null || r.notOwnerUserId == null || !this.notOwnerUserId.equals(r.notOwnerUserId))
                {
                    return false;
                }
            }
            if(this.designMode != r.designMode)
            {
                if(this.designMode == null || r.designMode == null || !this.designMode.equals(r.designMode))
                {
                    return false;
                }
            }
            if(this.caMode != r.caMode)
            {
                if(this.caMode == null || r.caMode == null || !this.caMode.equals(r.caMode))
                {
                    return false;
                }
            }
            if(this.commitMode != r.commitMode)
            {
                if(this.commitMode == null || r.commitMode == null || !this.commitMode.equals(r.commitMode))
                {
                    return false;
                }
            }
            if(this.historyMode != r.historyMode)
            {
                if(this.historyMode == null || r.historyMode == null || !this.historyMode.equals(r.historyMode))
                {
                    return false;
                }
            }
            if(this.accountId != r.accountId)
            {
                if(this.accountId == null || r.accountId == null || !this.accountId.equals(r.accountId))
                {
                    return false;
                }
            }
            if(this.isTaskDesigner != r.isTaskDesigner)
            {
                if(this.isTaskDesigner == null || r.isTaskDesigner == null || !this.isTaskDesigner.equals(r.isTaskDesigner))
                {
                    return false;
                }
            }
            if(this.isTaskChecker != r.isTaskChecker)
            {
                if(this.isTaskChecker == null || r.isTaskChecker == null || !this.isTaskChecker.equals(r.isTaskChecker))
                {
                    return false;
                }
            }
            if(this.isTaskAuditor != r.isTaskAuditor)
            {
                if(this.isTaskAuditor == null || r.isTaskAuditor == null || !this.isTaskAuditor.equals(r.isTaskAuditor))
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
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::QueryFileSimpleDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, ownerUserId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, notOwnerUserId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, designMode);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, caMode);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, commitMode);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, historyMode);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, accountId);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, isTaskDesigner);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, isTaskChecker);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, isTaskAuditor);
        return h_;
    }

    public QueryFileSimpleDTO clone()
    {
        QueryFileSimpleDTO c = null;
        try
        {
            c = (QueryFileSimpleDTO)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.ownerUserId);
        ostr.writeString(this.notOwnerUserId);
        ostr.writeString(this.designMode);
        ostr.writeString(this.caMode);
        ostr.writeString(this.commitMode);
        ostr.writeString(this.historyMode);
        ostr.writeString(this.accountId);
        ostr.writeString(this.isTaskDesigner);
        ostr.writeString(this.isTaskChecker);
        ostr.writeString(this.isTaskAuditor);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.ownerUserId = istr.readString();
        this.notOwnerUserId = istr.readString();
        this.designMode = istr.readString();
        this.caMode = istr.readString();
        this.commitMode = istr.readString();
        this.historyMode = istr.readString();
        this.accountId = istr.readString();
        this.isTaskDesigner = istr.readString();
        this.isTaskChecker = istr.readString();
        this.isTaskAuditor = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, QueryFileSimpleDTO v)
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

    static public QueryFileSimpleDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        QueryFileSimpleDTO v = new QueryFileSimpleDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<QueryFileSimpleDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, QueryFileSimpleDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<QueryFileSimpleDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(QueryFileSimpleDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final QueryFileSimpleDTO _nullMarshalValue = new QueryFileSimpleDTO();

    public static final long serialVersionUID = -583679906L;
}
