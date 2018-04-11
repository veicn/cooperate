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

public final class AnnotateListHelper
{
    public static void write(com.zeroc.Ice.OutputStream ostr, java.util.List<AnnotateDTO> v)
    {
        if(v == null)
        {
            ostr.writeSize(0);
        }
        else
        {
            ostr.writeSize(v.size());
            for(AnnotateDTO elem : v)
            {
                AnnotateDTO.ice_write(ostr, elem);
            }
        }
    }

    public static java.util.List<AnnotateDTO> read(com.zeroc.Ice.InputStream istr)
    {
        final java.util.List<AnnotateDTO> v;
        v = new java.util.ArrayList<AnnotateDTO>();
        final int len0 = istr.readAndCheckSeqSize(23);
        for(int i0 = 0; i0 < len0; i0++)
        {
            AnnotateDTO elem;
            elem = AnnotateDTO.ice_read(istr);
            v.add(elem);
        }
        return v;
    }

    public static void write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<java.util.List<AnnotateDTO>> v)
    {
        if(v != null && v.isPresent())
        {
            write(ostr, tag, v.get());
        }
    }

    public static void write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.List<AnnotateDTO> v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            AnnotateListHelper.write(ostr, v);
            ostr.endSize(pos);
        }
    }

    public static java.util.Optional<java.util.List<AnnotateDTO>> read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            java.util.List<AnnotateDTO> v;
            v = AnnotateListHelper.read(istr);
            return java.util.Optional.of(v);
        }
        else
        {
            return java.util.Optional.empty();
        }
    }
}