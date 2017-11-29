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

public class NodeModifyRequestDTO implements java.lang.Cloneable,
                                             java.io.Serializable
{
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

    public NodeModifyRequestDTO()
    {
        this.name = "";
        this.pNodeId = "";
    }

    public NodeModifyRequestDTO(String name, String pNodeId)
    {
        this.name = name;
        this.pNodeId = pNodeId;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        NodeModifyRequestDTO r = null;
        if(rhs instanceof NodeModifyRequestDTO)
        {
            r = (NodeModifyRequestDTO)rhs;
        }

        if(r != null)
        {
            if(this.name != r.name)
            {
                if(this.name == null || r.name == null || !this.name.equals(r.name))
                {
                    return false;
                }
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
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::NodeModifyRequestDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, name);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, pNodeId);
        return h_;
    }

    public NodeModifyRequestDTO clone()
    {
        NodeModifyRequestDTO c = null;
        try
        {
            c = (NodeModifyRequestDTO)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.name);
        ostr.writeString(this.pNodeId);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.name = istr.readString();
        this.pNodeId = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, NodeModifyRequestDTO v)
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

    static public NodeModifyRequestDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        NodeModifyRequestDTO v = new NodeModifyRequestDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<NodeModifyRequestDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, NodeModifyRequestDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<NodeModifyRequestDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(NodeModifyRequestDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final NodeModifyRequestDTO _nullMarshalValue = new NodeModifyRequestDTO();

    public static final long serialVersionUID = -823189650L;
}