package com.app.network.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\b\u001a\u00020\tJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\b\u001a\u00020\tJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tJ\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001dJ\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/app/network/repository/AdjustmentRepository;", "", "apiService", "Lcom/app/network/retrofitClient/APIService;", "(Lcom/app/network/retrofitClient/APIService;)V", "changePasswordRequest", "Lretrofit2/Call;", "Lcom/app/network/models/responseModels/ChangePasswordResponse;", "token", "", "Lcom/app/network/models/requestModels/ChangePasswordRequest;", "changePasswordVerify", "Lcom/app/network/models/responseModels/VerifyChangePasswordResponse;", "verifyChangePasswordRequest", "Lcom/app/network/models/requestModels/VerifyChangePasswordRequest;", "disable2FA", "Lokhttp3/ResponseBody;", "enable2FA", "getExchangeList", "Lcom/app/network/models/responseModels/GetExchangeRates;", "getUserInfo", "Lcom/app/network/models/responseModels/GetUserProfile;", "customerId", "setFavCustomer", "favCustomer", "Lcom/app/network/models/requestModels/SetFavCustomer;", "verify2FA", "Lcom/app/network/models/responseModels/GetVerify2FA;", "verifyRequest", "Lcom/app/network/models/requestModels/VerifyRequest;", "verify2FASecret", "Lcom/app/network/models/requestModels/VerifySecretRequest;", "data_debug"})
public final class AdjustmentRepository {
    private final com.app.network.retrofitClient.APIService apiService = null;
    
    @javax.inject.Inject
    public AdjustmentRepository(@org.jetbrains.annotations.NotNull
    com.app.network.retrofitClient.APIService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.GetUserProfile> getUserInfo(@org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    java.lang.String customerId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<okhttp3.ResponseBody> disable2FA(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<okhttp3.ResponseBody> enable2FA(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.GetVerify2FA> verify2FA(@org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.VerifyRequest verifyRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.GetVerify2FA> verify2FASecret(@org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.VerifySecretRequest verifyRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.GetExchangeRates> getExchangeList(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.ChangePasswordResponse> changePasswordRequest(@org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.ChangePasswordRequest changePasswordRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.VerifyChangePasswordResponse> changePasswordVerify(@org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.VerifyChangePasswordRequest verifyChangePasswordRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<okhttp3.ResponseBody> setFavCustomer(@org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.SetFavCustomer favCustomer) {
        return null;
    }
}