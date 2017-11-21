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
// Generated from file `FileServer.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.maoding.FileServer.zeroc;

public interface FileServicePrx extends com.zeroc.Ice.ObjectPrx
{
    default void setFileServerType(int type)
    {
        setFileServerType(type, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void setFileServerType(int type, java.util.Map<String, String> context)
    {
        _iceI_setFileServerTypeAsync(type, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> setFileServerTypeAsync(int type)
    {
        return _iceI_setFileServerTypeAsync(type, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> setFileServerTypeAsync(int type, java.util.Map<String, String> context)
    {
        return _iceI_setFileServerTypeAsync(type, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_setFileServerTypeAsync(int iceP_type, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "setFileServerType", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeInt(iceP_type);
                 }, null);
        return f;
    }

    default int getFileServerType()
    {
        return getFileServerType(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default int getFileServerType(java.util.Map<String, String> context)
    {
        return _iceI_getFileServerTypeAsync(context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.lang.Integer> getFileServerTypeAsync()
    {
        return _iceI_getFileServerTypeAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.lang.Integer> getFileServerTypeAsync(java.util.Map<String, String> context)
    {
        return _iceI_getFileServerTypeAsync(context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.lang.Integer> _iceI_getFileServerTypeAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.lang.Integer> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getFileServerType", null, sync, null);
        f.invoke(true, context, null, null, istr -> {
                     int ret;
                     ret = istr.readInt();
                     return ret;
                 });
        return f;
    }

    default FileRequestDTO getUploadRequest(FileDTO src, int mode, CallbackDTO callback)
    {
        return getUploadRequest(src, mode, callback, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default FileRequestDTO getUploadRequest(FileDTO src, int mode, CallbackDTO callback, java.util.Map<String, String> context)
    {
        return _iceI_getUploadRequestAsync(src, mode, callback, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<FileRequestDTO> getUploadRequestAsync(FileDTO src, int mode, CallbackDTO callback)
    {
        return _iceI_getUploadRequestAsync(src, mode, callback, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<FileRequestDTO> getUploadRequestAsync(FileDTO src, int mode, CallbackDTO callback, java.util.Map<String, String> context)
    {
        return _iceI_getUploadRequestAsync(src, mode, callback, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<FileRequestDTO> _iceI_getUploadRequestAsync(FileDTO iceP_src, int iceP_mode, CallbackDTO iceP_callback, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<FileRequestDTO> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getUploadRequest", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     FileDTO.ice_write(ostr, iceP_src);
                     ostr.writeInt(iceP_mode);
                     CallbackDTO.ice_write(ostr, iceP_callback);
                 }, istr -> {
                     FileRequestDTO ret;
                     ret = FileRequestDTO.ice_read(istr);
                     return ret;
                 });
        return f;
    }

    default FileRequestDTO getDownloadRequest(FileDTO src, int mode, CallbackDTO callback)
    {
        return getDownloadRequest(src, mode, callback, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default FileRequestDTO getDownloadRequest(FileDTO src, int mode, CallbackDTO callback, java.util.Map<String, String> context)
    {
        return _iceI_getDownloadRequestAsync(src, mode, callback, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<FileRequestDTO> getDownloadRequestAsync(FileDTO src, int mode, CallbackDTO callback)
    {
        return _iceI_getDownloadRequestAsync(src, mode, callback, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<FileRequestDTO> getDownloadRequestAsync(FileDTO src, int mode, CallbackDTO callback, java.util.Map<String, String> context)
    {
        return _iceI_getDownloadRequestAsync(src, mode, callback, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<FileRequestDTO> _iceI_getDownloadRequestAsync(FileDTO iceP_src, int iceP_mode, CallbackDTO iceP_callback, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<FileRequestDTO> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getDownloadRequest", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     FileDTO.ice_write(ostr, iceP_src);
                     ostr.writeInt(iceP_mode);
                     CallbackDTO.ice_write(ostr, iceP_callback);
                 }, istr -> {
                     FileRequestDTO ret;
                     ret = FileRequestDTO.ice_read(istr);
                     return ret;
                 });
        return f;
    }

    default UploadResultDTO upload(UploadRequestDTO request)
    {
        return upload(request, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default UploadResultDTO upload(UploadRequestDTO request, java.util.Map<String, String> context)
    {
        return _iceI_uploadAsync(request, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<UploadResultDTO> uploadAsync(UploadRequestDTO request)
    {
        return _iceI_uploadAsync(request, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<UploadResultDTO> uploadAsync(UploadRequestDTO request, java.util.Map<String, String> context)
    {
        return _iceI_uploadAsync(request, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<UploadResultDTO> _iceI_uploadAsync(UploadRequestDTO iceP_request, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<UploadResultDTO> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "upload", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     UploadRequestDTO.ice_write(ostr, iceP_request);
                 }, istr -> {
                     UploadResultDTO ret;
                     ret = UploadResultDTO.ice_read(istr);
                     return ret;
                 });
        return f;
    }

    default DownloadResultDTO download(DownloadRequestDTO request)
    {
        return download(request, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default DownloadResultDTO download(DownloadRequestDTO request, java.util.Map<String, String> context)
    {
        return _iceI_downloadAsync(request, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<DownloadResultDTO> downloadAsync(DownloadRequestDTO request)
    {
        return _iceI_downloadAsync(request, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<DownloadResultDTO> downloadAsync(DownloadRequestDTO request, java.util.Map<String, String> context)
    {
        return _iceI_downloadAsync(request, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<DownloadResultDTO> _iceI_downloadAsync(DownloadRequestDTO iceP_request, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<DownloadResultDTO> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "download", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     DownloadRequestDTO.ice_write(ostr, iceP_request);
                 }, istr -> {
                     DownloadResultDTO ret;
                     ret = DownloadResultDTO.ice_read(istr);
                     return ret;
                 });
        return f;
    }

    default String duplicateFile(FileDTO src)
    {
        return duplicateFile(src, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default String duplicateFile(FileDTO src, java.util.Map<String, String> context)
    {
        return _iceI_duplicateFileAsync(src, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.lang.String> duplicateFileAsync(FileDTO src)
    {
        return _iceI_duplicateFileAsync(src, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.lang.String> duplicateFileAsync(FileDTO src, java.util.Map<String, String> context)
    {
        return _iceI_duplicateFileAsync(src, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.lang.String> _iceI_duplicateFileAsync(FileDTO iceP_src, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.lang.String> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "duplicateFile", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     FileDTO.ice_write(ostr, iceP_src);
                 }, istr -> {
                     String ret;
                     ret = istr.readString();
                     return ret;
                 });
        return f;
    }

    default void deleteFile(FileDTO src)
    {
        deleteFile(src, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void deleteFile(FileDTO src, java.util.Map<String, String> context)
    {
        _iceI_deleteFileAsync(src, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> deleteFileAsync(FileDTO src)
    {
        return _iceI_deleteFileAsync(src, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> deleteFileAsync(FileDTO src, java.util.Map<String, String> context)
    {
        return _iceI_deleteFileAsync(src, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_deleteFileAsync(FileDTO iceP_src, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "deleteFile", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     FileDTO.ice_write(ostr, iceP_src);
                 }, null);
        return f;
    }

    default boolean isExist(FileDTO src)
    {
        return isExist(src, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default boolean isExist(FileDTO src, java.util.Map<String, String> context)
    {
        return _iceI_isExistAsync(src, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.lang.Boolean> isExistAsync(FileDTO src)
    {
        return _iceI_isExistAsync(src, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.lang.Boolean> isExistAsync(FileDTO src, java.util.Map<String, String> context)
    {
        return _iceI_isExistAsync(src, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.lang.Boolean> _iceI_isExistAsync(FileDTO iceP_src, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.lang.Boolean> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "isExist", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     FileDTO.ice_write(ostr, iceP_src);
                 }, istr -> {
                     boolean ret;
                     ret = istr.readBool();
                     return ret;
                 });
        return f;
    }

    default java.util.List<java.lang.String> listFile(String scope)
    {
        return listFile(scope, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default java.util.List<java.lang.String> listFile(String scope, java.util.Map<String, String> context)
    {
        return _iceI_listFileAsync(scope, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> listFileAsync(String scope)
    {
        return _iceI_listFileAsync(scope, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> listFileAsync(String scope, java.util.Map<String, String> context)
    {
        return _iceI_listFileAsync(scope, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.util.List<java.lang.String>> _iceI_listFileAsync(String iceP_scope, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.util.List<java.lang.String>> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "listFile", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_scope);
                 }, istr -> {
                     java.util.List<java.lang.String> ret;
                     ret = FileListHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default java.util.List<java.lang.String> listScope()
    {
        return listScope(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default java.util.List<java.lang.String> listScope(java.util.Map<String, String> context)
    {
        return _iceI_listScopeAsync(context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> listScopeAsync()
    {
        return _iceI_listScopeAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.util.List<java.lang.String>> listScopeAsync(java.util.Map<String, String> context)
    {
        return _iceI_listScopeAsync(context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<java.util.List<java.lang.String>> _iceI_listScopeAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.util.List<java.lang.String>> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "listScope", null, sync, null);
        f.invoke(true, context, null, null, istr -> {
                     java.util.List<java.lang.String> ret;
                     ret = ScopeListHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default void finishUpload(FileRequestDTO request)
    {
        finishUpload(request, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void finishUpload(FileRequestDTO request, java.util.Map<String, String> context)
    {
        _iceI_finishUploadAsync(request, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> finishUploadAsync(FileRequestDTO request)
    {
        return _iceI_finishUploadAsync(request, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> finishUploadAsync(FileRequestDTO request, java.util.Map<String, String> context)
    {
        return _iceI_finishUploadAsync(request, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_finishUploadAsync(FileRequestDTO iceP_request, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "finishUpload", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     FileRequestDTO.ice_write(ostr, iceP_request);
                 }, null);
        return f;
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static FileServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, ice_staticId(), FileServicePrx.class, _FileServicePrxI.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static FileServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, context, ice_staticId(), FileServicePrx.class, _FileServicePrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static FileServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, ice_staticId(), FileServicePrx.class, _FileServicePrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static FileServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, context, ice_staticId(), FileServicePrx.class, _FileServicePrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @return A proxy for this type.
     **/
    static FileServicePrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, FileServicePrx.class, _FileServicePrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    static FileServicePrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, facet, FileServicePrx.class, _FileServicePrxI.class);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the per-proxy context.
     * @param newContext The context for the new proxy.
     * @return A proxy with the specified per-proxy context.
     **/
    @Override
    default FileServicePrx ice_context(java.util.Map<String, String> newContext)
    {
        return (FileServicePrx)_ice_context(newContext);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the adapter ID.
     * @param newAdapterId The adapter ID for the new proxy.
     * @return A proxy with the specified adapter ID.
     **/
    @Override
    default FileServicePrx ice_adapterId(String newAdapterId)
    {
        return (FileServicePrx)_ice_adapterId(newAdapterId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoints.
     * @param newEndpoints The endpoints for the new proxy.
     * @return A proxy with the specified endpoints.
     **/
    @Override
    default FileServicePrx ice_endpoints(com.zeroc.Ice.Endpoint[] newEndpoints)
    {
        return (FileServicePrx)_ice_endpoints(newEndpoints);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator cache timeout.
     * @param newTimeout The new locator cache timeout (in seconds).
     * @return A proxy with the specified locator cache timeout.
     **/
    @Override
    default FileServicePrx ice_locatorCacheTimeout(int newTimeout)
    {
        return (FileServicePrx)_ice_locatorCacheTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the invocation timeout.
     * @param newTimeout The new invocation timeout (in seconds).
     * @return A proxy with the specified invocation timeout.
     **/
    @Override
    default FileServicePrx ice_invocationTimeout(int newTimeout)
    {
        return (FileServicePrx)_ice_invocationTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for connection caching.
     * @param newCache <code>true</code> if the new proxy should cache connections; <code>false</code> otherwise.
     * @return A proxy with the specified caching policy.
     **/
    @Override
    default FileServicePrx ice_connectionCached(boolean newCache)
    {
        return (FileServicePrx)_ice_connectionCached(newCache);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoint selection policy.
     * @param newType The new endpoint selection policy.
     * @return A proxy with the specified endpoint selection policy.
     **/
    @Override
    default FileServicePrx ice_endpointSelection(com.zeroc.Ice.EndpointSelectionType newType)
    {
        return (FileServicePrx)_ice_endpointSelection(newType);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for how it selects endpoints.
     * @param b If <code>b</code> is <code>true</code>, only endpoints that use a secure transport are
     * used by the new proxy. If <code>b</code> is false, the returned proxy uses both secure and
     * insecure endpoints.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default FileServicePrx ice_secure(boolean b)
    {
        return (FileServicePrx)_ice_secure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the encoding used to marshal parameters.
     * @param e The encoding version to use to marshal request parameters.
     * @return A proxy with the specified encoding version.
     **/
    @Override
    default FileServicePrx ice_encodingVersion(com.zeroc.Ice.EncodingVersion e)
    {
        return (FileServicePrx)_ice_encodingVersion(e);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its endpoint selection policy.
     * @param b If <code>b</code> is <code>true</code>, the new proxy will use secure endpoints for invocations
     * and only use insecure endpoints if an invocation cannot be made via secure endpoints. If <code>b</code> is
     * <code>false</code>, the proxy prefers insecure endpoints to secure ones.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default FileServicePrx ice_preferSecure(boolean b)
    {
        return (FileServicePrx)_ice_preferSecure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the router.
     * @param router The router for the new proxy.
     * @return A proxy with the specified router.
     **/
    @Override
    default FileServicePrx ice_router(com.zeroc.Ice.RouterPrx router)
    {
        return (FileServicePrx)_ice_router(router);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator.
     * @param locator The locator for the new proxy.
     * @return A proxy with the specified locator.
     **/
    @Override
    default FileServicePrx ice_locator(com.zeroc.Ice.LocatorPrx locator)
    {
        return (FileServicePrx)_ice_locator(locator);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for collocation optimization.
     * @param b <code>true</code> if the new proxy enables collocation optimization; <code>false</code> otherwise.
     * @return A proxy with the specified collocation optimization.
     **/
    @Override
    default FileServicePrx ice_collocationOptimized(boolean b)
    {
        return (FileServicePrx)_ice_collocationOptimized(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses twoway invocations.
     * @return A proxy that uses twoway invocations.
     **/
    @Override
    default FileServicePrx ice_twoway()
    {
        return (FileServicePrx)_ice_twoway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses oneway invocations.
     * @return A proxy that uses oneway invocations.
     **/
    @Override
    default FileServicePrx ice_oneway()
    {
        return (FileServicePrx)_ice_oneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch oneway invocations.
     * @return A proxy that uses batch oneway invocations.
     **/
    @Override
    default FileServicePrx ice_batchOneway()
    {
        return (FileServicePrx)_ice_batchOneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses datagram invocations.
     * @return A proxy that uses datagram invocations.
     **/
    @Override
    default FileServicePrx ice_datagram()
    {
        return (FileServicePrx)_ice_datagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch datagram invocations.
     * @return A proxy that uses batch datagram invocations.
     **/
    @Override
    default FileServicePrx ice_batchDatagram()
    {
        return (FileServicePrx)_ice_batchDatagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, except for compression.
     * @param co <code>true</code> enables compression for the new proxy; <code>false</code> disables compression.
     * @return A proxy with the specified compression setting.
     **/
    @Override
    default FileServicePrx ice_compress(boolean co)
    {
        return (FileServicePrx)_ice_compress(co);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection timeout setting.
     * @param t The connection timeout for the proxy in milliseconds.
     * @return A proxy with the specified timeout.
     **/
    @Override
    default FileServicePrx ice_timeout(int t)
    {
        return (FileServicePrx)_ice_timeout(t);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection ID.
     * @param connectionId The connection ID for the new proxy. An empty string removes the connection ID.
     * @return A proxy with the specified connection ID.
     **/
    @Override
    default FileServicePrx ice_connectionId(String connectionId)
    {
        return (FileServicePrx)_ice_connectionId(connectionId);
    }

    static String ice_staticId()
    {
        return "::zeroc::FileService";
    }
}
