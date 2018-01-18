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

public interface StorageServicePrx extends com.zeroc.Ice.ObjectPrx
{
    default SimpleNodeDTO createNode(UpdateNodeDTO request)
    {
        return createNode(request, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default SimpleNodeDTO createNode(UpdateNodeDTO request, java.util.Map<String, String> context)
    {
        return _iceI_createNodeAsync(request, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<SimpleNodeDTO> createNodeAsync(UpdateNodeDTO request)
    {
        return _iceI_createNodeAsync(request, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<SimpleNodeDTO> createNodeAsync(UpdateNodeDTO request, java.util.Map<String, String> context)
    {
        return _iceI_createNodeAsync(request, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<SimpleNodeDTO> _iceI_createNodeAsync(UpdateNodeDTO iceP_request, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<SimpleNodeDTO> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "createNode", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     UpdateNodeDTO.ice_write(ostr, iceP_request);
                 }, istr -> {
                     SimpleNodeDTO ret;
                     ret = SimpleNodeDTO.ice_read(istr);
                     return ret;
                 });
        return f;
    }

    default SimpleNodeDTO updateNode(SimpleNodeDTO src, UpdateNodeDTO request)
    {
        return updateNode(src, request, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default SimpleNodeDTO updateNode(SimpleNodeDTO src, UpdateNodeDTO request, java.util.Map<String, String> context)
    {
        return _iceI_updateNodeAsync(src, request, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<SimpleNodeDTO> updateNodeAsync(SimpleNodeDTO src, UpdateNodeDTO request)
    {
        return _iceI_updateNodeAsync(src, request, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<SimpleNodeDTO> updateNodeAsync(SimpleNodeDTO src, UpdateNodeDTO request, java.util.Map<String, String> context)
    {
        return _iceI_updateNodeAsync(src, request, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<SimpleNodeDTO> _iceI_updateNodeAsync(SimpleNodeDTO iceP_src, UpdateNodeDTO iceP_request, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<SimpleNodeDTO> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "updateNode", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     SimpleNodeDTO.ice_write(ostr, iceP_src);
                     UpdateNodeDTO.ice_write(ostr, iceP_request);
                 }, istr -> {
                     SimpleNodeDTO ret;
                     ret = SimpleNodeDTO.ice_read(istr);
                     return ret;
                 });
        return f;
    }

    default boolean deleteNodeById(String id)
    {
        return deleteNodeById(id, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default boolean deleteNodeById(String id, java.util.Map<String, String> context)
    {
        return _iceI_deleteNodeByIdAsync(id, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.lang.Boolean> deleteNodeByIdAsync(String id)
    {
        return _iceI_deleteNodeByIdAsync(id, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.lang.Boolean> deleteNodeByIdAsync(String id, java.util.Map<String, String> context)
    {
        return _iceI_deleteNodeByIdAsync(id, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.lang.Boolean> _iceI_deleteNodeByIdAsync(String iceP_id, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.lang.Boolean> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "deleteNodeById", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_id);
                 }, istr -> {
                     boolean ret;
                     ret = istr.readBool();
                     return ret;
                 });
        return f;
    }

    default java.util.List<SimpleNodeDTO> listAllNode(String userId)
    {
        return listAllNode(userId, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default java.util.List<SimpleNodeDTO> listAllNode(String userId, java.util.Map<String, String> context)
    {
        return _iceI_listAllNodeAsync(userId, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.util.List<SimpleNodeDTO>> listAllNodeAsync(String userId)
    {
        return _iceI_listAllNodeAsync(userId, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.util.List<SimpleNodeDTO>> listAllNodeAsync(String userId, java.util.Map<String, String> context)
    {
        return _iceI_listAllNodeAsync(userId, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.util.List<SimpleNodeDTO>> _iceI_listAllNodeAsync(String iceP_userId, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.util.List<SimpleNodeDTO>> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "listAllNode", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_userId);
                 }, istr -> {
                     java.util.List<SimpleNodeDTO> ret;
                     ret = SimpleNodeListHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default java.util.List<SimpleNodeDTO> listNode(QueryNodeDTO query)
    {
        return listNode(query, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default java.util.List<SimpleNodeDTO> listNode(QueryNodeDTO query, java.util.Map<String, String> context)
    {
        return _iceI_listNodeAsync(query, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.util.List<SimpleNodeDTO>> listNodeAsync(QueryNodeDTO query)
    {
        return _iceI_listNodeAsync(query, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.util.List<SimpleNodeDTO>> listNodeAsync(QueryNodeDTO query, java.util.Map<String, String> context)
    {
        return _iceI_listNodeAsync(query, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.util.List<SimpleNodeDTO>> _iceI_listNodeAsync(QueryNodeDTO iceP_query, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.util.List<SimpleNodeDTO>> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "listNode", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     QueryNodeDTO.ice_write(ostr, iceP_query);
                 }, istr -> {
                     java.util.List<SimpleNodeDTO> ret;
                     ret = SimpleNodeListHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default java.util.List<FileNodeDTO> listFileNodeInfo(QueryNodeDTO query, boolean withHistory)
    {
        return listFileNodeInfo(query, withHistory, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default java.util.List<FileNodeDTO> listFileNodeInfo(QueryNodeDTO query, boolean withHistory, java.util.Map<String, String> context)
    {
        return _iceI_listFileNodeInfoAsync(query, withHistory, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.util.List<FileNodeDTO>> listFileNodeInfoAsync(QueryNodeDTO query, boolean withHistory)
    {
        return _iceI_listFileNodeInfoAsync(query, withHistory, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.util.List<FileNodeDTO>> listFileNodeInfoAsync(QueryNodeDTO query, boolean withHistory, java.util.Map<String, String> context)
    {
        return _iceI_listFileNodeInfoAsync(query, withHistory, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.util.List<FileNodeDTO>> _iceI_listFileNodeInfoAsync(QueryNodeDTO iceP_query, boolean iceP_withHistory, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.util.List<FileNodeDTO>> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "listFileNodeInfo", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     QueryNodeDTO.ice_write(ostr, iceP_query);
                     ostr.writeBool(iceP_withHistory);
                 }, istr -> {
                     java.util.List<FileNodeDTO> ret;
                     ret = FileNodeListHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default FullNodeDTO getFullNodeInfo(SimpleNodeDTO node)
    {
        return getFullNodeInfo(node, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default FullNodeDTO getFullNodeInfo(SimpleNodeDTO node, java.util.Map<String, String> context)
    {
        return _iceI_getFullNodeInfoAsync(node, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<FullNodeDTO> getFullNodeInfoAsync(SimpleNodeDTO node)
    {
        return _iceI_getFullNodeInfoAsync(node, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<FullNodeDTO> getFullNodeInfoAsync(SimpleNodeDTO node, java.util.Map<String, String> context)
    {
        return _iceI_getFullNodeInfoAsync(node, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<FullNodeDTO> _iceI_getFullNodeInfoAsync(SimpleNodeDTO iceP_node, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<FullNodeDTO> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getFullNodeInfo", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     SimpleNodeDTO.ice_write(ostr, iceP_node);
                 }, istr -> {
                     FullNodeDTO ret;
                     ret = FullNodeDTO.ice_read(istr);
                     return ret;
                 });
        return f;
    }

    default FileNodeDTO getFileNodeInfo(SimpleNodeDTO node, boolean withHistory)
    {
        return getFileNodeInfo(node, withHistory, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default FileNodeDTO getFileNodeInfo(SimpleNodeDTO node, boolean withHistory, java.util.Map<String, String> context)
    {
        return _iceI_getFileNodeInfoAsync(node, withHistory, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<FileNodeDTO> getFileNodeInfoAsync(SimpleNodeDTO node, boolean withHistory)
    {
        return _iceI_getFileNodeInfoAsync(node, withHistory, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<FileNodeDTO> getFileNodeInfoAsync(SimpleNodeDTO node, boolean withHistory, java.util.Map<String, String> context)
    {
        return _iceI_getFileNodeInfoAsync(node, withHistory, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<FileNodeDTO> _iceI_getFileNodeInfoAsync(SimpleNodeDTO iceP_node, boolean iceP_withHistory, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<FileNodeDTO> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getFileNodeInfo", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     SimpleNodeDTO.ice_write(ostr, iceP_node);
                     ostr.writeBool(iceP_withHistory);
                 }, istr -> {
                     FileNodeDTO ret;
                     ret = FileNodeDTO.ice_read(istr);
                     return ret;
                 });
        return f;
    }

    /**
     **/
    @Deprecated
    default boolean isDirectoryEmpty(String path)
    {
        return isDirectoryEmpty(path, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    /**
     * @param context The Context map to send with the invocation.
     **/
    @Deprecated
    default boolean isDirectoryEmpty(String path, java.util.Map<String, String> context)
    {
        return _iceI_isDirectoryEmptyAsync(path, context, true).waitForResponse();
    }

    /**
     * @return A future that will be completed with the result.
     **/
    @Deprecated
    default java.util.concurrent.CompletableFuture<java.lang.Boolean> isDirectoryEmptyAsync(String path)
    {
        return _iceI_isDirectoryEmptyAsync(path, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    /**
     * @param context The Context map to send with the invocation.
     * @return A future that will be completed with the result.
     **/
    @Deprecated
    default java.util.concurrent.CompletableFuture<java.lang.Boolean> isDirectoryEmptyAsync(String path, java.util.Map<String, String> context)
    {
        return _iceI_isDirectoryEmptyAsync(path, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.lang.Boolean> _iceI_isDirectoryEmptyAsync(String iceP_path, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.lang.Boolean> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "isDirectoryEmpty", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_path);
                 }, istr -> {
                     boolean ret;
                     ret = istr.readBool();
                     return ret;
                 });
        return f;
    }

    /**
     **/
    @Deprecated
    default boolean isDirectoryEmptyForAccount(com.maoding.User.zeroc.AccountDTO account, String path)
    {
        return isDirectoryEmptyForAccount(account, path, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    /**
     * @param context The Context map to send with the invocation.
     **/
    @Deprecated
    default boolean isDirectoryEmptyForAccount(com.maoding.User.zeroc.AccountDTO account, String path, java.util.Map<String, String> context)
    {
        return _iceI_isDirectoryEmptyForAccountAsync(account, path, context, true).waitForResponse();
    }

    /**
     * @return A future that will be completed with the result.
     **/
    @Deprecated
    default java.util.concurrent.CompletableFuture<java.lang.Boolean> isDirectoryEmptyForAccountAsync(com.maoding.User.zeroc.AccountDTO account, String path)
    {
        return _iceI_isDirectoryEmptyForAccountAsync(account, path, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    /**
     * @param context The Context map to send with the invocation.
     * @return A future that will be completed with the result.
     **/
    @Deprecated
    default java.util.concurrent.CompletableFuture<java.lang.Boolean> isDirectoryEmptyForAccountAsync(com.maoding.User.zeroc.AccountDTO account, String path, java.util.Map<String, String> context)
    {
        return _iceI_isDirectoryEmptyForAccountAsync(account, path, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.lang.Boolean> _iceI_isDirectoryEmptyForAccountAsync(com.maoding.User.zeroc.AccountDTO iceP_account, String iceP_path, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.lang.Boolean> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "isDirectoryEmptyForAccount", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     com.maoding.User.zeroc.AccountDTO.ice_write(ostr, iceP_account);
                     ostr.writeString(iceP_path);
                 }, istr -> {
                     boolean ret;
                     ret = istr.readBool();
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
    static StorageServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, ice_staticId(), StorageServicePrx.class, _StorageServicePrxI.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static StorageServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, context, ice_staticId(), StorageServicePrx.class, _StorageServicePrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static StorageServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, ice_staticId(), StorageServicePrx.class, _StorageServicePrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static StorageServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, context, ice_staticId(), StorageServicePrx.class, _StorageServicePrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @return A proxy for this type.
     **/
    static StorageServicePrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, StorageServicePrx.class, _StorageServicePrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    static StorageServicePrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, facet, StorageServicePrx.class, _StorageServicePrxI.class);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the per-proxy context.
     * @param newContext The context for the new proxy.
     * @return A proxy with the specified per-proxy context.
     **/
    @Override
    default StorageServicePrx ice_context(java.util.Map<String, String> newContext)
    {
        return (StorageServicePrx)_ice_context(newContext);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the adapter ID.
     * @param newAdapterId The adapter ID for the new proxy.
     * @return A proxy with the specified adapter ID.
     **/
    @Override
    default StorageServicePrx ice_adapterId(String newAdapterId)
    {
        return (StorageServicePrx)_ice_adapterId(newAdapterId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoints.
     * @param newEndpoints The endpoints for the new proxy.
     * @return A proxy with the specified endpoints.
     **/
    @Override
    default StorageServicePrx ice_endpoints(com.zeroc.Ice.Endpoint[] newEndpoints)
    {
        return (StorageServicePrx)_ice_endpoints(newEndpoints);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator cache timeout.
     * @param newTimeout The new locator cache timeout (in seconds).
     * @return A proxy with the specified locator cache timeout.
     **/
    @Override
    default StorageServicePrx ice_locatorCacheTimeout(int newTimeout)
    {
        return (StorageServicePrx)_ice_locatorCacheTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the invocation timeout.
     * @param newTimeout The new invocation timeout (in seconds).
     * @return A proxy with the specified invocation timeout.
     **/
    @Override
    default StorageServicePrx ice_invocationTimeout(int newTimeout)
    {
        return (StorageServicePrx)_ice_invocationTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for connection caching.
     * @param newCache <code>true</code> if the new proxy should cache connections; <code>false</code> otherwise.
     * @return A proxy with the specified caching policy.
     **/
    @Override
    default StorageServicePrx ice_connectionCached(boolean newCache)
    {
        return (StorageServicePrx)_ice_connectionCached(newCache);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoint selection policy.
     * @param newType The new endpoint selection policy.
     * @return A proxy with the specified endpoint selection policy.
     **/
    @Override
    default StorageServicePrx ice_endpointSelection(com.zeroc.Ice.EndpointSelectionType newType)
    {
        return (StorageServicePrx)_ice_endpointSelection(newType);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for how it selects endpoints.
     * @param b If <code>b</code> is <code>true</code>, only endpoints that use a secure transport are
     * used by the new proxy. If <code>b</code> is false, the returned proxy uses both secure and
     * insecure endpoints.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default StorageServicePrx ice_secure(boolean b)
    {
        return (StorageServicePrx)_ice_secure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the encoding used to marshal parameters.
     * @param e The encoding version to use to marshal request parameters.
     * @return A proxy with the specified encoding version.
     **/
    @Override
    default StorageServicePrx ice_encodingVersion(com.zeroc.Ice.EncodingVersion e)
    {
        return (StorageServicePrx)_ice_encodingVersion(e);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its endpoint selection policy.
     * @param b If <code>b</code> is <code>true</code>, the new proxy will use secure endpoints for invocations
     * and only use insecure endpoints if an invocation cannot be made via secure endpoints. If <code>b</code> is
     * <code>false</code>, the proxy prefers insecure endpoints to secure ones.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default StorageServicePrx ice_preferSecure(boolean b)
    {
        return (StorageServicePrx)_ice_preferSecure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the router.
     * @param router The router for the new proxy.
     * @return A proxy with the specified router.
     **/
    @Override
    default StorageServicePrx ice_router(com.zeroc.Ice.RouterPrx router)
    {
        return (StorageServicePrx)_ice_router(router);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator.
     * @param locator The locator for the new proxy.
     * @return A proxy with the specified locator.
     **/
    @Override
    default StorageServicePrx ice_locator(com.zeroc.Ice.LocatorPrx locator)
    {
        return (StorageServicePrx)_ice_locator(locator);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for collocation optimization.
     * @param b <code>true</code> if the new proxy enables collocation optimization; <code>false</code> otherwise.
     * @return A proxy with the specified collocation optimization.
     **/
    @Override
    default StorageServicePrx ice_collocationOptimized(boolean b)
    {
        return (StorageServicePrx)_ice_collocationOptimized(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses twoway invocations.
     * @return A proxy that uses twoway invocations.
     **/
    @Override
    default StorageServicePrx ice_twoway()
    {
        return (StorageServicePrx)_ice_twoway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses oneway invocations.
     * @return A proxy that uses oneway invocations.
     **/
    @Override
    default StorageServicePrx ice_oneway()
    {
        return (StorageServicePrx)_ice_oneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch oneway invocations.
     * @return A proxy that uses batch oneway invocations.
     **/
    @Override
    default StorageServicePrx ice_batchOneway()
    {
        return (StorageServicePrx)_ice_batchOneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses datagram invocations.
     * @return A proxy that uses datagram invocations.
     **/
    @Override
    default StorageServicePrx ice_datagram()
    {
        return (StorageServicePrx)_ice_datagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch datagram invocations.
     * @return A proxy that uses batch datagram invocations.
     **/
    @Override
    default StorageServicePrx ice_batchDatagram()
    {
        return (StorageServicePrx)_ice_batchDatagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, except for compression.
     * @param co <code>true</code> enables compression for the new proxy; <code>false</code> disables compression.
     * @return A proxy with the specified compression setting.
     **/
    @Override
    default StorageServicePrx ice_compress(boolean co)
    {
        return (StorageServicePrx)_ice_compress(co);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection timeout setting.
     * @param t The connection timeout for the proxy in milliseconds.
     * @return A proxy with the specified timeout.
     **/
    @Override
    default StorageServicePrx ice_timeout(int t)
    {
        return (StorageServicePrx)_ice_timeout(t);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection ID.
     * @param connectionId The connection ID for the new proxy. An empty string removes the connection ID.
     * @return A proxy with the specified connection ID.
     **/
    @Override
    default StorageServicePrx ice_connectionId(String connectionId)
    {
        return (StorageServicePrx)_ice_connectionId(connectionId);
    }

    static String ice_staticId()
    {
        return "::zeroc::StorageService";
    }
}
