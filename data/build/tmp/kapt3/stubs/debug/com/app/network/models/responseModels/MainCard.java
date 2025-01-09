package com.app.network.models.responseModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b;\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u0019J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u000bH\u00c6\u0003J\t\u00104\u001a\u00020\u000bH\u00c6\u0003J\t\u00105\u001a\u00020\u000bH\u00c6\u0003J\t\u00106\u001a\u00020\u000bH\u00c6\u0003J\t\u00107\u001a\u00020\u000bH\u00c6\u0003J\t\u00108\u001a\u00020\u000bH\u00c6\u0003J\t\u00109\u001a\u00020\u000bH\u00c6\u0003J\t\u0010:\u001a\u00020\u0001H\u00c6\u0003J\t\u0010;\u001a\u00020\u000bH\u00c6\u0003J\t\u0010<\u001a\u00020\u0006H\u00c6\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\t\u0010>\u001a\u00020\u0001H\u00c6\u0003J\t\u0010?\u001a\u00020\u000bH\u00c6\u0003J\t\u0010@\u001a\u00020\u0001H\u00c6\u0003J\t\u0010A\u001a\u00020\u000bH\u00c6\u0003J\t\u0010B\u001a\u00020\u000bH\u00c6\u0003J\t\u0010C\u001a\u00020\u000bH\u00c6\u0003J\u00ca\u0001\u0010D\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010EJ\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010I\u001a\u00020\u0006H\u00d6\u0001J\t\u0010J\u001a\u00020\u000bH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\f\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0011\u0010\r\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0011\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010$R\u0011\u0010\u000f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0011\u0010\u0010\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\u0011\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0011\u0010\u0012\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0011\u0010\u0013\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0011\u0010\u0014\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0011\u0010\u0015\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0011\u0010\u0016\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0011\u0010\u0017\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0011\u0010\u0018\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010$\u00a8\u0006K"}, d2 = {"Lcom/app/network/models/responseModels/MainCard;", "", "AdditionCards", "", "Lcom/app/network/models/responseModels/AdditionCard;", "AdditionNumb", "", "Balance", "", "BlncBlockedBy", "BlockedBy", "", "BlockedDate", "CardHolder", "CardStat", "Currency", "EncryptedPan", "ExpDate", "Iban", "MainStatus", "Name", "Pan", "PaymentSys", "ResidualAmount", "nickName", "(Ljava/util/List;ILjava/lang/Double;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "getAdditionCards", "()Ljava/util/List;", "getAdditionNumb", "()I", "getBalance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBlncBlockedBy", "()Ljava/lang/Object;", "getBlockedBy", "()Ljava/lang/String;", "getBlockedDate", "getCardHolder", "getCardStat", "getCurrency", "getEncryptedPan", "getExpDate", "getIban", "getMainStatus", "getName", "getPan", "getPaymentSys", "getResidualAmount", "getNickName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;ILjava/lang/Double;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Lcom/app/network/models/responseModels/MainCard;", "equals", "", "other", "hashCode", "toString", "data_debug"})
public final class MainCard {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.app.network.models.responseModels.AdditionCard> AdditionCards = null;
    private final int AdditionNumb = 0;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double Balance = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object BlncBlockedBy = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String BlockedBy = null;
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
    private final java.lang.String Iban = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String MainStatus = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String Name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String Pan = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String PaymentSys = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object ResidualAmount = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String nickName = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.app.network.models.responseModels.MainCard copy(@org.jetbrains.annotations.NotNull
    java.util.List<com.app.network.models.responseModels.AdditionCard> AdditionCards, int AdditionNumb, @org.jetbrains.annotations.Nullable
    java.lang.Double Balance, @org.jetbrains.annotations.NotNull
    java.lang.Object BlncBlockedBy, @org.jetbrains.annotations.NotNull
    java.lang.String BlockedBy, @org.jetbrains.annotations.NotNull
    java.lang.Object BlockedDate, @org.jetbrains.annotations.NotNull
    java.lang.String CardHolder, @org.jetbrains.annotations.NotNull
    java.lang.String CardStat, @org.jetbrains.annotations.NotNull
    java.lang.String Currency, @org.jetbrains.annotations.NotNull
    java.lang.String EncryptedPan, @org.jetbrains.annotations.NotNull
    java.lang.String ExpDate, @org.jetbrains.annotations.NotNull
    java.lang.String Iban, @org.jetbrains.annotations.NotNull
    java.lang.String MainStatus, @org.jetbrains.annotations.NotNull
    java.lang.String Name, @org.jetbrains.annotations.NotNull
    java.lang.String Pan, @org.jetbrains.annotations.NotNull
    java.lang.String PaymentSys, @org.jetbrains.annotations.NotNull
    java.lang.Object ResidualAmount, @org.jetbrains.annotations.NotNull
    java.lang.String nickName) {
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
    
    public MainCard(@org.jetbrains.annotations.NotNull
    java.util.List<com.app.network.models.responseModels.AdditionCard> AdditionCards, int AdditionNumb, @org.jetbrains.annotations.Nullable
    java.lang.Double Balance, @org.jetbrains.annotations.NotNull
    java.lang.Object BlncBlockedBy, @org.jetbrains.annotations.NotNull
    java.lang.String BlockedBy, @org.jetbrains.annotations.NotNull
    java.lang.Object BlockedDate, @org.jetbrains.annotations.NotNull
    java.lang.String CardHolder, @org.jetbrains.annotations.NotNull
    java.lang.String CardStat, @org.jetbrains.annotations.NotNull
    java.lang.String Currency, @org.jetbrains.annotations.NotNull
    java.lang.String EncryptedPan, @org.jetbrains.annotations.NotNull
    java.lang.String ExpDate, @org.jetbrains.annotations.NotNull
    java.lang.String Iban, @org.jetbrains.annotations.NotNull
    java.lang.String MainStatus, @org.jetbrains.annotations.NotNull
    java.lang.String Name, @org.jetbrains.annotations.NotNull
    java.lang.String Pan, @org.jetbrains.annotations.NotNull
    java.lang.String PaymentSys, @org.jetbrains.annotations.NotNull
    java.lang.Object ResidualAmount, @org.jetbrains.annotations.NotNull
    java.lang.String nickName) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.app.network.models.responseModels.AdditionCard> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.app.network.models.responseModels.AdditionCard> getAdditionCards() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getAdditionNumb() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getBlncBlockedBy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBlockedBy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getBlockedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCardHolder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCardStat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEncryptedPan() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getExpDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIban() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMainStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPan() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPaymentSys() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getResidualAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNickName() {
        return null;
    }
}