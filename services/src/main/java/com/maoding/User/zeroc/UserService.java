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
// Generated from file `User.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.user.zeroc;

public interface UserService extends com.zeroc.Ice.Object
{
    void setWebRoleStatus(WebRoleDTO webRole, String statusId, com.zeroc.Ice.Current current);

    java.util.List<WebRoleDTO> listWebRole(QueryWebRoleDTO query, com.zeroc.Ice.Current current);

    java.util.List<RoleDTO> listRole(QueryRoleDTO query, com.zeroc.Ice.Current current);

    boolean login(LoginDTO loginInfo, com.zeroc.Ice.Current current);

    AccountDTO getCurrent(com.zeroc.Ice.Current current);

    java.util.List<ProjectRoleDTO> listProjectRoleByProjectId(String projectId, com.zeroc.Ice.Current current);

    UserJoinDTO listUserJoin(com.zeroc.Ice.Current current);

    UserJoinDTO listUserJoinForAccount(AccountDTO account, com.zeroc.Ice.Current current);

    java.util.List<com.maoding.common.zeroc.IdNameDTO> listMember(QueryMemberDTO query, com.zeroc.Ice.Current current);

    static final String[] _iceIds =
    {
        "::Ice::Object",
        "::zeroc::UserService"
    };

    @Override
    default String[] ice_ids(com.zeroc.Ice.Current current)
    {
        return _iceIds;
    }

    @Override
    default String ice_id(com.zeroc.Ice.Current current)
    {
        return ice_staticId();
    }

    static String ice_staticId()
    {
        return "::zeroc::UserService";
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_setWebRoleStatus(UserService obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        WebRoleDTO iceP_webRole;
        String iceP_statusId;
        iceP_webRole = WebRoleDTO.ice_read(istr);
        iceP_statusId = istr.readString();
        inS.endReadParams();
        obj.setWebRoleStatus(iceP_webRole, iceP_statusId, current);
        return inS.setResult(inS.writeEmptyParams());
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_listWebRole(UserService obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        QueryWebRoleDTO iceP_query;
        iceP_query = QueryWebRoleDTO.ice_read(istr);
        inS.endReadParams();
        java.util.List<WebRoleDTO> ret = obj.listWebRole(iceP_query, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        WebRoleListHelper.write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_listRole(UserService obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        QueryRoleDTO iceP_query;
        iceP_query = QueryRoleDTO.ice_read(istr);
        inS.endReadParams();
        java.util.List<RoleDTO> ret = obj.listRole(iceP_query, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        RoleListHelper.write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_login(UserService obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        LoginDTO iceP_loginInfo;
        iceP_loginInfo = LoginDTO.ice_read(istr);
        inS.endReadParams();
        boolean ret = obj.login(iceP_loginInfo, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeBool(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_getCurrent(UserService obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        inS.readEmptyParams();
        AccountDTO ret = obj.getCurrent(current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        AccountDTO.ice_write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_listProjectRoleByProjectId(UserService obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_projectId;
        iceP_projectId = istr.readString();
        inS.endReadParams();
        java.util.List<ProjectRoleDTO> ret = obj.listProjectRoleByProjectId(iceP_projectId, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ProjectRoleListHelper.write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_listUserJoin(UserService obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        inS.readEmptyParams();
        UserJoinDTO ret = obj.listUserJoin(current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        UserJoinDTO.ice_write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_listUserJoinForAccount(UserService obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        AccountDTO iceP_account;
        iceP_account = AccountDTO.ice_read(istr);
        inS.endReadParams();
        UserJoinDTO ret = obj.listUserJoinForAccount(iceP_account, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        UserJoinDTO.ice_write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_listMember(UserService obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        QueryMemberDTO iceP_query;
        iceP_query = QueryMemberDTO.ice_read(istr);
        inS.endReadParams();
        java.util.List<com.maoding.common.zeroc.IdNameDTO> ret = obj.listMember(iceP_query, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        com.maoding.common.zeroc.IdNameListHelper.write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    final static String[] _iceOps =
    {
        "getCurrent",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "listMember",
        "listProjectRoleByProjectId",
        "listRole",
        "listUserJoin",
        "listUserJoinForAccount",
        "listWebRole",
        "login",
        "setWebRoleStatus"
    };

    @Override
    default java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceDispatch(com.zeroc.IceInternal.Incoming in, com.zeroc.Ice.Current current)
        throws com.zeroc.Ice.UserException
    {
        int pos = java.util.Arrays.binarySearch(_iceOps, current.operation);
        if(pos < 0)
        {
            throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return _iceD_getCurrent(this, in, current);
            }
            case 1:
            {
                return com.zeroc.Ice.Object._iceD_ice_id(this, in, current);
            }
            case 2:
            {
                return com.zeroc.Ice.Object._iceD_ice_ids(this, in, current);
            }
            case 3:
            {
                return com.zeroc.Ice.Object._iceD_ice_isA(this, in, current);
            }
            case 4:
            {
                return com.zeroc.Ice.Object._iceD_ice_ping(this, in, current);
            }
            case 5:
            {
                return _iceD_listMember(this, in, current);
            }
            case 6:
            {
                return _iceD_listProjectRoleByProjectId(this, in, current);
            }
            case 7:
            {
                return _iceD_listRole(this, in, current);
            }
            case 8:
            {
                return _iceD_listUserJoin(this, in, current);
            }
            case 9:
            {
                return _iceD_listUserJoinForAccount(this, in, current);
            }
            case 10:
            {
                return _iceD_listWebRole(this, in, current);
            }
            case 11:
            {
                return _iceD_login(this, in, current);
            }
            case 12:
            {
                return _iceD_setWebRoleStatus(this, in, current);
            }
        }

        assert(false);
        throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
    }
}
