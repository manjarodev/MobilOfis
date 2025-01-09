package com.app.network.models.responseModels.transferModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0018J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0007H\u00c6\u0003J\t\u00101\u001a\u00020\u0007H\u00c6\u0003J\t\u00102\u001a\u00020\u0007H\u00c6\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003J\t\u00104\u001a\u00020\u0007H\u00c6\u0003J\t\u00105\u001a\u00020\u0001H\u00c6\u0003J\t\u00106\u001a\u00020\u0007H\u00c6\u0003J\t\u00107\u001a\u00020\u0007H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0007H\u00c6\u0003J\t\u0010:\u001a\u00020\u0007H\u00c6\u0003J\t\u0010;\u001a\u00020\u0007H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\u0007H\u00c6\u0003J\t\u0010>\u001a\u00020\u0007H\u00c6\u0003J\t\u0010?\u001a\u00020\u0007H\u00c6\u0003J\u00b9\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010D\u001a\u00020EH\u00d6\u0001J\t\u0010F\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\r\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0014\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0011\u0010\u0015\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0016\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0011\u0010\u0017\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001e\u00a8\u0006G"}, d2 = {"Lcom/app/network/models/responseModels/transferModels/TransferListResponseItem;", "", "actionButtons", "Lcom/app/network/models/responseModels/transferModels/ActionButtons;", "amount", "", "approveAvailable", "", "benefName", "brTrnType", "commamount", "currency", "customerAccount", "description", "errorText", "ibankRef", "signAvailable", "signDetailList", "", "Lcom/app/network/models/responseModels/transferModels/SignDetail;", "status", "statusDescription", "trnDateTime", "trnType", "(Lcom/app/network/models/responseModels/transferModels/ActionButtons;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "getActionButtons", "()Lcom/app/network/models/responseModels/transferModels/ActionButtons;", "getAmount", "()D", "getApproveAvailable", "()Ljava/lang/String;", "getBenefName", "getBrTrnType", "getCommamount", "getCurrency", "getCustomerAccount", "getDescription", "getErrorText", "getIbankRef", "getSignAvailable", "getSignDetailList", "()Ljava/util/List;", "getStatus", "getStatusDescription", "()Ljava/lang/Object;", "getTrnDateTime", "getTrnType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "data_debug"})
public final class TransferListResponseItem {
    @org.jetbrains.annotations.NotNull
    private final com.app.network.models.responseModels.transferModels.ActionButtons actionButtons = null;
    private final double amount = 0.0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String approveAvailable = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String benefName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String brTrnType = null;
    private final double commamount = 0.0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String currency = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String customerAccount = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String errorText = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ibankRef = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String signAvailable = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.app.network.models.responseModels.transferModels.SignDetail> signDetailList = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object statusDescription = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String trnDateTime = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String trnType = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.app.network.models.responseModels.transferModels.TransferListResponseItem copy(@org.jetbrains.annotations.NotNull
    com.app.network.models.responseModels.transferModels.ActionButtons actionButtons, double amount, @org.jetbrains.annotations.NotNull
    java.lang.String approveAvailable, @org.jetbrains.annotations.NotNull
    java.lang.String benefName, @org.jetbrains.annotations.NotNull
    java.lang.String brTrnType, double commamount, @org.jetbrains.annotations.NotNull
    java.lang.String currency, @org.jetbrains.annotations.NotNull
    java.lang.String customerAccount, @org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.lang.String errorText, @org.jetbrains.annotations.NotNull
    java.lang.String ibankRef, @org.jetbrains.annotations.NotNull
    java.lang.String signAvailable, @org.jetbrains.annotations.NotNull
    java.util.List<com.app.network.models.responseModels.transferModels.SignDetail> signDetailList, @org.jetbrains.annotations.NotNull
    java.lang.String status, @org.jetbrains.annotations.NotNull
    java.lang.Object statusDescription, @org.jetbrains.annotations.NotNull
    java.lang.String trnDateTime, @org.jetbrains.annotations.NotNull
    java.lang.String trnType) {
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
    
    public TransferListResponseItem(@org.jetbrains.annotations.NotNull
    com.app.network.models.responseModels.transferModels.ActionButtons actionButtons, double amount, @org.jetbrains.annotations.NotNull
    java.lang.String approveAvailable, @org.jetbrains.annotations.NotNull
    java.lang.String benefName, @org.jetbrains.annotations.NotNull
    java.lang.String brTrnType, double commamount, @org.jetbrains.annotations.NotNull
    java.lang.String currency, @org.jetbrains.annotations.NotNull
    java.lang.String customerAccount, @org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.lang.String errorText, @org.jetbrains.annotations.NotNull
    java.lang.String ibankRef, @org.jetbrains.annotations.NotNull
    java.lang.String signAvailable, @org.jetbrains.annotations.NotNull
    java.util.List<com.app.network.models.responseModels.transferModels.SignDetail> signDetailList, @org.jetbrains.annotations.NotNull
    java.lang.String status, @org.jetbrains.annotations.NotNull
    java.lang.Object statusDescription, @org.jetbrains.annotations.NotNull
    java.lang.String trnDateTime, @org.jetbrains.annotations.NotNull
    java.lang.String trnType) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.network.models.responseModels.transferModels.ActionButtons component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.network.models.responseModels.transferModels.ActionButtons getActionButtons() {
        return null;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double getAmount() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getApproveAvailable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBenefName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBrTrnType() {
        return null;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double getCommamount() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCustomerAccount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getErrorText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIbankRef() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSignAvailable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.app.network.models.responseModels.transferModels.SignDetail> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.app.network.models.responseModels.transferModels.SignDetail> getSignDetailList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getStatusDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTrnDateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTrnType() {
        return null;
    }
}