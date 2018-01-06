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

/**
 **/
@Deprecated
public class SimpleNodeWithSubDTO implements java.lang.Cloneable,
                                             java.io.Serializable
{
    public SimpleNodeDTO node;

    public SimpleNodeDTO getNode()
    {
        return node;
    }

    public void setNode(SimpleNodeDTO node)
    {
        this.node = node;
    }

    public java.util.List<SimpleNodeDTO> subNodeList;

    public java.util.List<SimpleNodeDTO> getSubNodeList()
    {
        return subNodeList;
    }

    public void setSubNodeList(java.util.List<SimpleNodeDTO> subNodeList)
    {
        this.subNodeList = subNodeList;
    }

    public SimpleNodeWithSubDTO()
    {
        this.node = new SimpleNodeDTO();
    }

    public SimpleNodeWithSubDTO(SimpleNodeDTO node, java.util.List<SimpleNodeDTO> subNodeList)
    {
        this.node = node;
        this.subNodeList = subNodeList;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        SimpleNodeWithSubDTO r = null;
        if(rhs instanceof SimpleNodeWithSubDTO)
        {
            r = (SimpleNodeWithSubDTO)rhs;
        }

        if(r != null)
        {
            if(this.node != r.node)
            {
                if(this.node == null || r.node == null || !this.node.equals(r.node))
                {
                    return false;
                }
            }
            if(this.subNodeList != r.subNodeList)
            {
                if(this.subNodeList == null || r.subNodeList == null || !this.subNodeList.equals(r.subNodeList))
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
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::SimpleNodeWithSubDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, node);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, subNodeList);
        return h_;
    }

    public SimpleNodeWithSubDTO clone()
    {
        SimpleNodeWithSubDTO c = null;
        try
        {
            c = (SimpleNodeWithSubDTO)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        SimpleNodeDTO.ice_write(ostr, this.node);
        SimpleNodeListHelper.write(ostr, this.subNodeList);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.node = SimpleNodeDTO.ice_read(istr);
        this.subNodeList = SimpleNodeListHelper.read(istr);
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, SimpleNodeWithSubDTO v)
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

    static public SimpleNodeWithSubDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        SimpleNodeWithSubDTO v = new SimpleNodeWithSubDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<SimpleNodeWithSubDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, SimpleNodeWithSubDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<SimpleNodeWithSubDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(SimpleNodeWithSubDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final SimpleNodeWithSubDTO _nullMarshalValue = new SimpleNodeWithSubDTO();

    public static final long serialVersionUID = -945976005L;
}
