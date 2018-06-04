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
// Generated from file `UserData.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.user.zeroc;

public class TaskRoleDTO implements java.lang.Cloneable,
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

    public java.util.List<com.maoding.common.zeroc.IdNameDTO> taskRoleList;

    public java.util.List<com.maoding.common.zeroc.IdNameDTO> getTaskRoleList()
    {
        return taskRoleList;
    }

    public void setTaskRoleList(java.util.List<com.maoding.common.zeroc.IdNameDTO> taskRoleList)
    {
        this.taskRoleList = taskRoleList;
    }

    public TaskRoleDTO()
    {
        this.id = "";
        this.name = "";
    }

    public TaskRoleDTO(String id, String name, java.util.List<com.maoding.common.zeroc.IdNameDTO> taskRoleList)
    {
        this.id = id;
        this.name = name;
        this.taskRoleList = taskRoleList;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        TaskRoleDTO r = null;
        if(rhs instanceof TaskRoleDTO)
        {
            r = (TaskRoleDTO)rhs;
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
            if(this.taskRoleList != r.taskRoleList)
            {
                if(this.taskRoleList == null || r.taskRoleList == null || !this.taskRoleList.equals(r.taskRoleList))
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
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::zeroc::TaskRoleDTO");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, id);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, name);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, taskRoleList);
        return h_;
    }

    public TaskRoleDTO clone()
    {
        TaskRoleDTO c = null;
        try
        {
            c = (TaskRoleDTO)super.clone();
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
        com.maoding.common.zeroc.IdNameListHelper.write(ostr, this.taskRoleList);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.id = istr.readString();
        this.name = istr.readString();
        this.taskRoleList = com.maoding.common.zeroc.IdNameListHelper.read(istr);
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, TaskRoleDTO v)
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

    static public TaskRoleDTO ice_read(com.zeroc.Ice.InputStream istr)
    {
        TaskRoleDTO v = new TaskRoleDTO();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<TaskRoleDTO> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, TaskRoleDTO v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<TaskRoleDTO> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(TaskRoleDTO.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final TaskRoleDTO _nullMarshalValue = new TaskRoleDTO();

    public static final long serialVersionUID = 1460001914L;
}
