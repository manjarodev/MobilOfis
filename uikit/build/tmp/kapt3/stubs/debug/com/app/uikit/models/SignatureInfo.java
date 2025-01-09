package com.app.uikit.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/app/uikit/models/SignatureInfo;", "", "isSignRequired", "", "transfer", "Lcom/app/network/models/responseModels/transferModels/TransferListResponseItem;", "transferList", "", "(ZLcom/app/network/models/responseModels/transferModels/TransferListResponseItem;Ljava/util/List;)V", "()Z", "getTransfer", "()Lcom/app/network/models/responseModels/transferModels/TransferListResponseItem;", "getTransferList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "uikit_debug"})
public final class SignatureInfo {
    private final boolean isSignRequired = false;
    @org.jetbrains.annotations.Nullable
    private final com.app.network.models.responseModels.transferModels.TransferListResponseItem transfer = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.app.network.models.responseModels.transferModels.TransferListResponseItem> transferList = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.app.uikit.models.SignatureInfo copy(boolean isSignRequired, @org.jetbrains.annotations.Nullable
    com.app.network.models.responseModels.transferModels.TransferListResponseItem transfer, @org.jetbrains.annotations.Nullable
    java.util.List<com.app.network.models.responseModels.transferModels.TransferListResponseItem> transferList) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public SignatureInfo(boolean isSignRequired, @org.jetbrains.annotations.Nullable
    com.app.network.models.responseModels.transferModels.TransferListResponseItem transfer, @org.jetbrains.annotations.Nullable
    java.util.List<com.app.network.models.responseModels.transferModels.TransferListResponseItem> transferList) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean isSignRequired() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.app.network.models.responseModels.transferModels.TransferListResponseItem component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.app.network.models.responseModels.transferModels.TransferListResponseItem getTransfer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.app.network.models.responseModels.transferModels.TransferListResponseItem> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.app.network.models.responseModels.transferModels.TransferListResponseItem> getTransferList() {
        return null;
    }
}