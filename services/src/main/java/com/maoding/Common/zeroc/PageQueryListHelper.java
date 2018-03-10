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
// Generated from file `Common.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.Common.zeroc;

public final class PageQueryListHelper
{
    public static void write(com.zeroc.Ice.OutputStream ostr, java.util.List<PageQueryDTO> v)
    {
        if(v == null)
        {
            ostr.writeSize(0);
        }
        else
        {
            ostr.writeSize(v.size());
            for(PageQueryDTO elem : v)
            {
                PageQueryDTO.ice_write(ostr, elem);
            }
        }
    }

    public static java.util.List<PageQueryDTO> read(com.zeroc.Ice.InputStream istr)
    {
        final java.util.List<PageQueryDTO> v;
        v = new java.util.ArrayList<PageQueryDTO>();
        final int len0 = istr.readAndCheckSeqSize(8);
        for(int i0 = 0; i0 < len0; i0++)
        {
            PageQueryDTO elem;
            elem = PageQueryDTO.ice_read(istr);
            v.add(elem);
        }
        return v;
    }

    public static void write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<java.util.List<PageQueryDTO>> v)
    {
        if(v != null && v.isPresent())
        {
            write(ostr, tag, v.get());
        }
    }

    public static void write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.List<PageQueryDTO> v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.VSize))
        {
            final int optSize = v == null ? 0 : v.size();
            ostr.writeSize(optSize > 254 ? optSize * 8 + 5 : optSize * 8 + 1);
            PageQueryListHelper.write(ostr, v);
        }
    }

    public static java.util.Optional<java.util.List<PageQueryDTO>> read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.VSize))
        {
            istr.skipSize();
            java.util.List<PageQueryDTO> v;
            v = PageQueryListHelper.read(istr);
            return java.util.Optional.of(v);
        }
        else
        {
            return java.util.Optional.empty();
        }
    }
}