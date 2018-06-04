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

public interface UserServicePrx extends com.zeroc.Ice.ObjectPrx
{
    default void setWebRoleStatus(WebRoleDTO webRole, String statusId)
    {
        setWebRoleStatus(webRole, statusId, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void setWebRoleStatus(WebRoleDTO webRole, String statusId, java.util.Map<String, String> context)
    {
        _iceI_setWebRoleStatusAsync(webRole, statusId, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> setWebRoleStatusAsync(WebRoleDTO webRole, String statusId)
    {
        return _iceI_setWebRoleStatusAsync(webRole, statusId, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> setWebRoleStatusAsync(WebRoleDTO webRole, String statusId, java.util.Map<String, String> context)
    {
        return _iceI_setWebRoleStatusAsync(webRole, statusId, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_setWebRoleStatusAsync(WebRoleDTO iceP_webRole, String iceP_statusId, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "setWebRoleStatus", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     WebRoleDTO.ice_write(ostr, iceP_webRole);
                     ostr.writeString(iceP_statusId);
                 }, null);
        return f;
    }

    default java.util.List<WebRoleDTO> listWebRole(QueryWebRoleDTO query)
    {
        return listWebRole(query, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default java.util.List<WebRoleDTO> listWebRole(QueryWebRoleDTO query, java.util.Map<String, String> context)
    {
        return _iceI_listWebRoleAsync(query, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.util.List<WebRoleDTO>> listWebRoleAsync(QueryWebRoleDTO query)
    {
        return _iceI_listWebRoleAsync(query, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.util.List<WebRoleDTO>> listWebRoleAsync(QueryWebRoleDTO query, java.util.Map<String, String> context)
    {
        return _iceI_listWebRoleAsync(query, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.util.List<WebRoleDTO>> _iceI_listWebRoleAsync(QueryWebRoleDTO iceP_query, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.util.List<WebRoleDTO>> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "listWebRole", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     QueryWebRoleDTO.ice_write(ostr, iceP_query);
                 }, istr -> {
                     java.util.List<WebRoleDTO> ret;
                     ret = WebRoleListHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default java.util.List<RoleDTO> listRole(QueryRoleDTO query)
    {
        return listRole(query, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default java.util.List<RoleDTO> listRole(QueryRoleDTO query, java.util.Map<String, String> context)
    {
        return _iceI_listRoleAsync(query, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.util.List<RoleDTO>> listRoleAsync(QueryRoleDTO query)
    {
        return _iceI_listRoleAsync(query, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.util.List<RoleDTO>> listRoleAsync(QueryRoleDTO query, java.util.Map<String, String> context)
    {
        return _iceI_listRoleAsync(query, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.util.List<RoleDTO>> _iceI_listRoleAsync(QueryRoleDTO iceP_query, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.util.List<RoleDTO>> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "listRole", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     QueryRoleDTO.ice_write(ostr, iceP_query);
                 }, istr -> {
                     java.util.List<RoleDTO> ret;
                     ret = RoleListHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default boolean login(LoginDTO loginInfo)
    {
        return login(loginInfo, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default boolean login(LoginDTO loginInfo, java.util.Map<String, String> context)
    {
        return _iceI_loginAsync(loginInfo, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.lang.Boolean> loginAsync(LoginDTO loginInfo)
    {
        return _iceI_loginAsync(loginInfo, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.lang.Boolean> loginAsync(LoginDTO loginInfo, java.util.Map<String, String> context)
    {
        return _iceI_loginAsync(loginInfo, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.lang.Boolean> _iceI_loginAsync(LoginDTO iceP_loginInfo, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.lang.Boolean> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "login", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     LoginDTO.ice_write(ostr, iceP_loginInfo);
                 }, istr -> {
                     boolean ret;
                     ret = istr.readBool();
                     return ret;
                 });
        return f;
    }

    default AccountDTO getCurrent()
    {
        return getCurrent(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default AccountDTO getCurrent(java.util.Map<String, String> context)
    {
        return _iceI_getCurrentAsync(context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<AccountDTO> getCurrentAsync()
    {
        return _iceI_getCurrentAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<AccountDTO> getCurrentAsync(java.util.Map<String, String> context)
    {
        return _iceI_getCurrentAsync(context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<AccountDTO> _iceI_getCurrentAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<AccountDTO> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getCurrent", null, sync, null);
        f.invoke(true, context, null, null, istr -> {
                     AccountDTO ret;
                     ret = AccountDTO.ice_read(istr);
                     return ret;
                 });
        return f;
    }

    default java.util.List<ProjectRoleDTO> listProjectRoleByProjectId(String projectId)
    {
        return listProjectRoleByProjectId(projectId, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default java.util.List<ProjectRoleDTO> listProjectRoleByProjectId(String projectId, java.util.Map<String, String> context)
    {
        return _iceI_listProjectRoleByProjectIdAsync(projectId, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.util.List<ProjectRoleDTO>> listProjectRoleByProjectIdAsync(String projectId)
    {
        return _iceI_listProjectRoleByProjectIdAsync(projectId, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.util.List<ProjectRoleDTO>> listProjectRoleByProjectIdAsync(String projectId, java.util.Map<String, String> context)
    {
        return _iceI_listProjectRoleByProjectIdAsync(projectId, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.util.List<ProjectRoleDTO>> _iceI_listProjectRoleByProjectIdAsync(String iceP_projectId, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.util.List<ProjectRoleDTO>> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "listProjectRoleByProjectId", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_projectId);
                 }, istr -> {
                     java.util.List<ProjectRoleDTO> ret;
                     ret = ProjectRoleListHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default UserJoinDTO listUserJoin()
    {
        return listUserJoin(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default UserJoinDTO listUserJoin(java.util.Map<String, String> context)
    {
        return _iceI_listUserJoinAsync(context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<UserJoinDTO> listUserJoinAsync()
    {
        return _iceI_listUserJoinAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<UserJoinDTO> listUserJoinAsync(java.util.Map<String, String> context)
    {
        return _iceI_listUserJoinAsync(context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<UserJoinDTO> _iceI_listUserJoinAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<UserJoinDTO> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "listUserJoin", null, sync, null);
        f.invoke(true, context, null, null, istr -> {
                     UserJoinDTO ret;
                     ret = UserJoinDTO.ice_read(istr);
                     return ret;
                 });
        return f;
    }

    default UserJoinDTO listUserJoinForAccount(AccountDTO account)
    {
        return listUserJoinForAccount(account, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default UserJoinDTO listUserJoinForAccount(AccountDTO account, java.util.Map<String, String> context)
    {
        return _iceI_listUserJoinForAccountAsync(account, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<UserJoinDTO> listUserJoinForAccountAsync(AccountDTO account)
    {
        return _iceI_listUserJoinForAccountAsync(account, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<UserJoinDTO> listUserJoinForAccountAsync(AccountDTO account, java.util.Map<String, String> context)
    {
        return _iceI_listUserJoinForAccountAsync(account, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<UserJoinDTO> _iceI_listUserJoinForAccountAsync(AccountDTO iceP_account, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<UserJoinDTO> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "listUserJoinForAccount", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     AccountDTO.ice_write(ostr, iceP_account);
                 }, istr -> {
                     UserJoinDTO ret;
                     ret = UserJoinDTO.ice_read(istr);
                     return ret;
                 });
        return f;
    }

    default java.util.List<com.maoding.common.zeroc.IdNameDTO> listMember(QueryMemberDTO query)
    {
        return listMember(query, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default java.util.List<com.maoding.common.zeroc.IdNameDTO> listMember(QueryMemberDTO query, java.util.Map<String, String> context)
    {
        return _iceI_listMemberAsync(query, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.util.List<com.maoding.common.zeroc.IdNameDTO>> listMemberAsync(QueryMemberDTO query)
    {
        return _iceI_listMemberAsync(query, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.util.List<com.maoding.common.zeroc.IdNameDTO>> listMemberAsync(QueryMemberDTO query, java.util.Map<String, String> context)
    {
        return _iceI_listMemberAsync(query, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.util.List<com.maoding.common.zeroc.IdNameDTO>> _iceI_listMemberAsync(QueryMemberDTO iceP_query, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.util.List<com.maoding.common.zeroc.IdNameDTO>> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "listMember", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     QueryMemberDTO.ice_write(ostr, iceP_query);
                 }, istr -> {
                     java.util.List<com.maoding.common.zeroc.IdNameDTO> ret;
                     ret = com.maoding.common.zeroc.IdNameListHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static UserServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, ice_staticId(), UserServicePrx.class, _UserServicePrxI.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static UserServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, context, ice_staticId(), UserServicePrx.class, _UserServicePrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static UserServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, ice_staticId(), UserServicePrx.class, _UserServicePrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static UserServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, context, ice_staticId(), UserServicePrx.class, _UserServicePrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @return A proxy for this type.
     **/
    static UserServicePrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, UserServicePrx.class, _UserServicePrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    static UserServicePrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, facet, UserServicePrx.class, _UserServicePrxI.class);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the per-proxy context.
     * @param newContext The context for the new proxy.
     * @return A proxy with the specified per-proxy context.
     **/
    @Override
    default UserServicePrx ice_context(java.util.Map<String, String> newContext)
    {
        return (UserServicePrx)_ice_context(newContext);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the adapter ID.
     * @param newAdapterId The adapter ID for the new proxy.
     * @return A proxy with the specified adapter ID.
     **/
    @Override
    default UserServicePrx ice_adapterId(String newAdapterId)
    {
        return (UserServicePrx)_ice_adapterId(newAdapterId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoints.
     * @param newEndpoints The endpoints for the new proxy.
     * @return A proxy with the specified endpoints.
     **/
    @Override
    default UserServicePrx ice_endpoints(com.zeroc.Ice.Endpoint[] newEndpoints)
    {
        return (UserServicePrx)_ice_endpoints(newEndpoints);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator cache timeout.
     * @param newTimeout The new locator cache timeout (in seconds).
     * @return A proxy with the specified locator cache timeout.
     **/
    @Override
    default UserServicePrx ice_locatorCacheTimeout(int newTimeout)
    {
        return (UserServicePrx)_ice_locatorCacheTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the invocation timeout.
     * @param newTimeout The new invocation timeout (in seconds).
     * @return A proxy with the specified invocation timeout.
     **/
    @Override
    default UserServicePrx ice_invocationTimeout(int newTimeout)
    {
        return (UserServicePrx)_ice_invocationTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for connection caching.
     * @param newCache <code>true</code> if the new proxy should cache connections; <code>false</code> otherwise.
     * @return A proxy with the specified caching policy.
     **/
    @Override
    default UserServicePrx ice_connectionCached(boolean newCache)
    {
        return (UserServicePrx)_ice_connectionCached(newCache);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoint selection policy.
     * @param newType The new endpoint selection policy.
     * @return A proxy with the specified endpoint selection policy.
     **/
    @Override
    default UserServicePrx ice_endpointSelection(com.zeroc.Ice.EndpointSelectionType newType)
    {
        return (UserServicePrx)_ice_endpointSelection(newType);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for how it selects endpoints.
     * @param b If <code>b</code> is <code>true</code>, only endpoints that use a secure transport are
     * used by the new proxy. If <code>b</code> is false, the returned proxy uses both secure and
     * insecure endpoints.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default UserServicePrx ice_secure(boolean b)
    {
        return (UserServicePrx)_ice_secure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the encoding used to marshal parameters.
     * @param e The encoding version to use to marshal request parameters.
     * @return A proxy with the specified encoding version.
     **/
    @Override
    default UserServicePrx ice_encodingVersion(com.zeroc.Ice.EncodingVersion e)
    {
        return (UserServicePrx)_ice_encodingVersion(e);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its endpoint selection policy.
     * @param b If <code>b</code> is <code>true</code>, the new proxy will use secure endpoints for invocations
     * and only use insecure endpoints if an invocation cannot be made via secure endpoints. If <code>b</code> is
     * <code>false</code>, the proxy prefers insecure endpoints to secure ones.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default UserServicePrx ice_preferSecure(boolean b)
    {
        return (UserServicePrx)_ice_preferSecure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the router.
     * @param router The router for the new proxy.
     * @return A proxy with the specified router.
     **/
    @Override
    default UserServicePrx ice_router(com.zeroc.Ice.RouterPrx router)
    {
        return (UserServicePrx)_ice_router(router);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator.
     * @param locator The locator for the new proxy.
     * @return A proxy with the specified locator.
     **/
    @Override
    default UserServicePrx ice_locator(com.zeroc.Ice.LocatorPrx locator)
    {
        return (UserServicePrx)_ice_locator(locator);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for collocation optimization.
     * @param b <code>true</code> if the new proxy enables collocation optimization; <code>false</code> otherwise.
     * @return A proxy with the specified collocation optimization.
     **/
    @Override
    default UserServicePrx ice_collocationOptimized(boolean b)
    {
        return (UserServicePrx)_ice_collocationOptimized(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses twoway invocations.
     * @return A proxy that uses twoway invocations.
     **/
    @Override
    default UserServicePrx ice_twoway()
    {
        return (UserServicePrx)_ice_twoway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses oneway invocations.
     * @return A proxy that uses oneway invocations.
     **/
    @Override
    default UserServicePrx ice_oneway()
    {
        return (UserServicePrx)_ice_oneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch oneway invocations.
     * @return A proxy that uses batch oneway invocations.
     **/
    @Override
    default UserServicePrx ice_batchOneway()
    {
        return (UserServicePrx)_ice_batchOneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses datagram invocations.
     * @return A proxy that uses datagram invocations.
     **/
    @Override
    default UserServicePrx ice_datagram()
    {
        return (UserServicePrx)_ice_datagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch datagram invocations.
     * @return A proxy that uses batch datagram invocations.
     **/
    @Override
    default UserServicePrx ice_batchDatagram()
    {
        return (UserServicePrx)_ice_batchDatagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, except for compression.
     * @param co <code>true</code> enables compression for the new proxy; <code>false</code> disables compression.
     * @return A proxy with the specified compression setting.
     **/
    @Override
    default UserServicePrx ice_compress(boolean co)
    {
        return (UserServicePrx)_ice_compress(co);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection timeout setting.
     * @param t The connection timeout for the proxy in milliseconds.
     * @return A proxy with the specified timeout.
     **/
    @Override
    default UserServicePrx ice_timeout(int t)
    {
        return (UserServicePrx)_ice_timeout(t);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection ID.
     * @param connectionId The connection ID for the new proxy. An empty string removes the connection ID.
     * @return A proxy with the specified connection ID.
     **/
    @Override
    default UserServicePrx ice_connectionId(String connectionId)
    {
        return (UserServicePrx)_ice_connectionId(connectionId);
    }

    static String ice_staticId()
    {
        return "::zeroc::UserService";
    }
}
