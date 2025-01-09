package com.app.network.retrofitClient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/app/network/retrofitClient/BaseRetrofitClient;", "", "session", "Lcom/app/network/helper/Session;", "(Lcom/app/network/helper/Session;)V", "AUTH_TOKEN", "", "getAUTH_TOKEN", "()Ljava/lang/String;", "setAUTH_TOKEN", "(Ljava/lang/String;)V", "authIntercept", "Lokhttp3/Interceptor;", "httpClient", "Lokhttp3/OkHttpClient;", "getHttpClient", "()Lokhttp3/OkHttpClient;", "httpClient$delegate", "Lkotlin/Lazy;", "client", "Lretrofit2/Retrofit;", "createApiService", "Lcom/app/network/retrofitClient/APIService;", "createDefaultResponse", "Lokhttp3/Response;", "data_debug"})
public final class BaseRetrofitClient {
    private final com.app.network.helper.Session session = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.String AUTH_TOKEN;
    private final kotlin.Lazy httpClient$delegate = null;
    private final okhttp3.Interceptor authIntercept = null;
    
    @javax.inject.Inject
    public BaseRetrofitClient(@org.jetbrains.annotations.NotNull
    com.app.network.helper.Session session) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAUTH_TOKEN() {
        return null;
    }
    
    public final void setAUTH_TOKEN(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.network.retrofitClient.APIService createApiService() {
        return null;
    }
    
    private final retrofit2.Retrofit client(okhttp3.OkHttpClient httpClient) {
        return null;
    }
    
    private final okhttp3.OkHttpClient getHttpClient() {
        return null;
    }
    
    private final okhttp3.Response createDefaultResponse() {
        return null;
    }
}