package com.app.network.models.responseModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0001H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0001H\u00c6\u0003J\t\u0010!\u001a\u00020\u0001H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0001H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\u0081\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u0001H\u00c6\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020/H\u00d6\u0001J\t\u00100\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011\u00a8\u00061"}, d2 = {"Lcom/app/network/models/responseModels/AdditionCard;", "", "BlockedBy", "BlockedDate", "CardHolder", "", "CardStat", "Currency", "EncryptedPan", "ExpDate", "MainStatus", "Name", "Pan", "PaymSys", "nickName", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "getBlockedBy", "()Ljava/lang/Object;", "getBlockedDate", "getCardHolder", "()Ljava/lang/String;", "getCardStat", "getCurrency", "getEncryptedPan", "getExpDate", "getMainStatus", "getName", "getPan", "getPaymSys", "getNickName", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "data_debug"})
public final class AdditionCard {
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object BlockedBy = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object BlockedDate = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CardHolder = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CardStat = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String Currency = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String EncryptedPan = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ExpDate = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String MainStatus = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String Name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String Pan = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object PaymSys = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object nickName = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.app.network.models.responseModels.AdditionCard copy(@org.jetbrains.annotations.NotNull
    java.lang.Object BlockedBy, @org.jetbrains.annotations.NotNull
    java.lang.Object BlockedDate, @org.jetbrains.annotations.NotNull
    java.lang.String CardHolder, @org.jetbrains.annotations.NotNull
    java.lang.String CardStat, @org.jetbrains.annotations.NotNull
    java.lang.String Currency, @org.jetbrains.annotations.NotNull
    java.lang.String EncryptedPan, @org.jetbrains.annotations.NotNull
    java.lang.String ExpDate, @org.jetbrains.annotations.NotNull
    java.lang.String MainStatus, @org.jetbrains.annotations.NotNull
    java.lang.String Name, @org.jetbrains.annotations.NotNull
    java.lang.String Pan, @org.jetbrains.annotations.NotNull
    java.lang.Object PaymSys, @org.jetbrains.annotations.NotNull
    java.lang.Object nickName) {
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
    
    public AdditionCard(@org.jetbrains.annotations.NotNull
    java.lang.Object BlockedBy, @org.jetbrains.annotations.NotNull
    java.lang.Object BlockedDate, @org.jetbrains.annotations.NotNull
    java.lang.String CardHolder, @org.jetbrains.annotations.NotNull
    java.lang.String CardStat, @org.jetbrains.annotations.NotNull
    java.lang.String Currency, @org.jetbrains.annotations.NotNull
    java.lang.String EncryptedPan, @org.jetbrains.annotations.NotNull
    java.lang.String ExpDate, @org.jetbrains.annotations.NotNull
    java.lang.String MainStatus, @org.jetbrains.annotations.NotNull
    java.lang.String Name, @org.jetbrains.annotations.NotNull
    java.lang.String Pan, @org.jetbrains.annotations.NotNull
    java.lang.Object PaymSys, @org.jetbrains.annotations.NotNull
    java.lang.Object nickName) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getBlockedBy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getBlockedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCardHolder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCardStat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEncryptedPan() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getExpDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMainStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPan() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getPaymSys() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getNickName() {
        return null;
    }
}