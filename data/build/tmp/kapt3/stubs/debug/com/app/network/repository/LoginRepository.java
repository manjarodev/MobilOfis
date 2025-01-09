package com.app.network.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\u0006\u0010\u0012\u001a\u00020\u0013J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/app/network/repository/LoginRepository;", "", "apiService", "Lcom/app/network/retrofitClient/APIService;", "(Lcom/app/network/retrofitClient/APIService;)V", "getDashBoardMessage", "Lretrofit2/Call;", "Lcom/app/network/models/responseModels/GetStartMessage;", "lastLogin", "Lcom/app/network/models/responseModels/GetLastLogin;", "token", "", "sendLoginAsanRequest", "Lcom/app/network/models/responseModels/LoginAsanResponse;", "loginAsanRequest", "Lcom/app/network/models/requestModels/LoginAsanRequest;", "sendLoginRequestGoogleAuth", "Lcom/app/network/models/responseModels/LoginResponse;", "loginRequest", "Lcom/app/network/models/requestModels/LoginRequest;", "sendLoginVerificationRequest", "Lcom/app/network/models/responseModels/LoginVerifyResponse;", "loginVerificationRequest", "Lcom/app/network/models/requestModels/LoginVerificationRequest;", "data_debug"})
public final class LoginRepository {
    private final com.app.network.retrofitClient.APIService apiService = null;
    
    @javax.inject.Inject
    public LoginRepository(@org.jetbrains.annotations.NotNull
    com.app.network.retrofitClient.APIService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.LoginResponse> sendLoginRequestGoogleAuth(@org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.LoginRequest loginRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.LoginVerifyResponse> sendLoginVerificationRequest(@org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.LoginVerificationRequest loginVerificationRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.LoginAsanResponse> sendLoginAsanRequest(@org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.LoginAsanRequest loginAsanRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.GetLastLogin> lastLogin(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.GetStartMessage> getDashBoardMessage() {
        return null;
    }
}