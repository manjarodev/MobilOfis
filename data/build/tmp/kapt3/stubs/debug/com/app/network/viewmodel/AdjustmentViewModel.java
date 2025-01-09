package com.app.network.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0013\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u0006\u0010\u0016\u001a\u00020)J\u0006\u0010\u0018\u001a\u00020)J\u0006\u0010\u001b\u001a\u00020)J\u000e\u0010\"\u001a\u00020)2\u0006\u0010,\u001a\u00020-J\u000e\u0010\u001f\u001a\u00020)2\u0006\u0010.\u001a\u00020/J\u000e\u0010#\u001a\u00020)2\u0006\u00100\u001a\u000201J\u000e\u0010%\u001a\u00020)2\u0006\u00102\u001a\u000203J\u000e\u0010\'\u001a\u00020)2\u0006\u00104\u001a\u000205R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u001f\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u001f\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001c\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0015R\u001f\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u0015R\u001f\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u0015R\u001f\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u0015R\u001f\u0010\'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u0015\u00a8\u00066"}, d2 = {"Lcom/app/network/viewmodel/AdjustmentViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/app/network/repository/AdjustmentRepository;", "_session", "Lcom/app/network/helper/Session;", "(Lcom/app/network/repository/AdjustmentRepository;Lcom/app/network/helper/Session;)V", "_changePassword", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/app/network/models/DataState;", "", "_disable2FA", "_enable2FA", "_exchangeRates", "_setFavCustomer", "_userInfo", "_verify2FA", "_verify2FASecret", "_verifyChangePassword", "changePassword", "getChangePassword", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "disable2FA", "getDisable2FA", "enable2FA", "getEnable2FA", "exchangeRates", "getExchangeRates", "session", "getSession", "()Lcom/app/network/helper/Session;", "setFavCustomer", "getSetFavCustomer", "userInfo", "getUserInfo", "verify2FA", "getVerify2FA", "verify2FASecret", "getVerify2FASecret", "verifyChangePassword", "getVerifyChangePassword", "", "changePasswordRequest", "Lcom/app/network/models/requestModels/ChangePasswordRequest;", "customerId", "", "favCustomer", "Lcom/app/network/models/requestModels/SetFavCustomer;", "verifyRequest", "Lcom/app/network/models/requestModels/VerifyRequest;", "verifySecretRequest", "Lcom/app/network/models/requestModels/VerifySecretRequest;", "verifyChangePasswordRequest", "Lcom/app/network/models/requestModels/VerifyChangePasswordRequest;", "data_debug"})
public final class AdjustmentViewModel extends androidx.lifecycle.ViewModel {
    private final com.app.network.repository.AdjustmentRepository repository = null;
    private final com.app.network.helper.Session _session = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _userInfo = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _disable2FA = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _enable2FA = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _verify2FA = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _verify2FASecret = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _exchangeRates = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _changePassword = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _verifyChangePassword = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _setFavCustomer = null;
    
    @javax.inject.Inject
    public AdjustmentViewModel(@org.jetbrains.annotations.NotNull
    com.app.network.repository.AdjustmentRepository repository, @org.jetbrains.annotations.NotNull
    com.app.network.helper.Session _session) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.network.helper.Session getSession() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getUserInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getDisable2FA() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getEnable2FA() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getVerify2FA() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getVerify2FASecret() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getExchangeRates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getChangePassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getVerifyChangePassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getSetFavCustomer() {
        return null;
    }
    
    public final void getUserInfo(@org.jetbrains.annotations.NotNull
    java.lang.String customerId) {
    }
    
    public final void disable2FA() {
    }
    
    public final void enable2FA() {
    }
    
    public final void verify2FA(@org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.VerifyRequest verifyRequest) {
    }
    
    public final void verify2FASecret(@org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.VerifySecretRequest verifySecretRequest) {
    }
    
    public final void getExchangeRates() {
    }
    
    public final void changePassword(@org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.ChangePasswordRequest changePasswordRequest) {
    }
    
    public final void verifyChangePassword(@org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.VerifyChangePasswordRequest verifyChangePasswordRequest) {
    }
    
    public final void setFavCustomer(@org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.SetFavCustomer favCustomer) {
    }
}