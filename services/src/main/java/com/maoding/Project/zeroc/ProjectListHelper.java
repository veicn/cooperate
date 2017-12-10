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
// Generated from file `Project.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.Project.zeroc;

public final class ProjectListHelper
{
    public static void write(com.zeroc.Ice.OutputStream ostr, java.util.List<ProjectDTO> v)
    {
        if(v == null)
        {
            ostr.writeSize(0);
        }
        else
        {
            ostr.writeSize(v.size());
            for(ProjectDTO elem : v)
            {
                ProjectDTO.ice_write(ostr, elem);
            }
        }
    }

    public static java.util.List<ProjectDTO> read(com.zeroc.Ice.InputStream istr)
    {
        final java.util.List<ProjectDTO> v;
        v = new java.util.ArrayList<ProjectDTO>();
        final int len0 = istr.readAndCheckSeqSize(2);
        for(int i0 = 0; i0 < len0; i0++)
        {
            ProjectDTO elem;
            elem = ProjectDTO.ice_read(istr);
            v.add(elem);
        }
        return v;
    }

    public static void write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<java.util.List<ProjectDTO>> v)
    {
        if(v != null && v.isPresent())
        {
            write(ostr, tag, v.get());
        }
    }

    public static void write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.List<ProjectDTO> v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ProjectListHelper.write(ostr, v);
            ostr.endSize(pos);
        }
    }

    public static java.util.Optional<java.util.List<ProjectDTO>> read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            java.util.List<ProjectDTO> v;
            v = ProjectListHelper.read(istr);
            return java.util.Optional.of(v);
        }
        else
        {
            return java.util.Optional.empty();
        }
    }
}