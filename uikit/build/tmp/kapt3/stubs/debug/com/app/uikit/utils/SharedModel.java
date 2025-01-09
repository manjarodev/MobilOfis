package com.app.uikit.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/app/uikit/utils/SharedModel;", "Landroidx/lifecycle/ViewModel;", "()V", "easyVerificationCode", "Landroidx/compose/runtime/MutableState;", "", "getEasyVerificationCode", "()Landroidx/compose/runtime/MutableState;", "loginType", "Landroidx/compose/runtime/MutableIntState;", "getLoginType", "()Landroidx/compose/runtime/MutableIntState;", "signatureData", "Lcom/app/uikit/models/SignatureInfo;", "getSignatureData", "Companion", "uikit_debug"})
public final class SharedModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableIntState loginType = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> easyVerificationCode = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.app.uikit.models.SignatureInfo> signatureData = null;
    @org.jetbrains.annotations.NotNull
    public static final com.app.uikit.utils.SharedModel.Companion Companion = null;
    private static final kotlin.Lazy instance$delegate = null;
    
    public SharedModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableIntState getLoginType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getEasyVerificationCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.app.uikit.models.SignatureInfo> getSignatureData() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/app/uikit/utils/SharedModel$Companion;", "", "()V", "instance", "Lcom/app/uikit/utils/SharedModel;", "getInstance", "()Lcom/app/uikit/utils/SharedModel;", "instance$delegate", "Lkotlin/Lazy;", "init", "uikit_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final com.app.uikit.utils.SharedModel getInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.app.uikit.utils.SharedModel init() {
            return null;
        }
    }
}