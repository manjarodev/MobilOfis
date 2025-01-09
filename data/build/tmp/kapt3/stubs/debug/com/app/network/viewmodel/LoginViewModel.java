package com.app.network.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001dJ\u0006\u0010\u0016\u001a\u00020\u001dJ\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u001f\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u001f\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u001f\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006\'"}, d2 = {"Lcom/app/network/viewmodel/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/app/network/repository/LoginRepository;", "_session", "Lcom/app/network/helper/Session;", "(Lcom/app/network/repository/LoginRepository;Lcom/app/network/helper/Session;)V", "_asanLogin", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/app/network/models/DataState;", "", "_data", "_getDashboardMessage", "_lastLogin", "_otp", "asanLogin", "getAsanLogin", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "data", "getData", "getDashboardMessage", "getGetDashboardMessage", "lastLogin", "getLastLogin", "otp", "getOtp", "session", "getSession", "()Lcom/app/network/helper/Session;", "", "loginAsanRequest", "Lcom/app/network/models/requestModels/LoginAsanRequest;", "getDashBoardMessage", "loginAuthVerification", "loginVerificationRequest", "Lcom/app/network/models/requestModels/LoginVerificationRequest;", "loginWithUserName", "loginRequest", "Lcom/app/network/models/requestModels/LoginRequest;", "data_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final com.app.network.repository.LoginRepository repository = null;
    private final com.app.network.helper.Session _session = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _data = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _otp = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _asanLogin = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _getDashboardMessage = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _lastLogin = null;
    
    @javax.inject.Inject
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    com.app.network.repository.LoginRepository repository, @org.jetbrains.annotations.NotNull
    com.app.network.helper.Session _session) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.network.helper.Session getSession() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getOtp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getAsanLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getGetDashboardMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getLastLogin() {
        return null;
    }
    
    public final void loginWithUserName(@org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.LoginRequest loginRequest) {
    }
    
    public final void loginAuthVerification(@org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.LoginVerificationRequest loginVerificationRequest) {
    }
    
    public final void asanLogin(@org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.LoginAsanRequest loginAsanRequest) {
    }
    
    public final void lastLogin() {
    }
    
    public final void getDashBoardMessage() {
    }
}