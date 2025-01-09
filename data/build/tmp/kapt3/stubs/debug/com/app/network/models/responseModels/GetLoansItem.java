package com.app.network.models.responseModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b?\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u001aJ\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0007H\u00c6\u0003J\t\u00106\u001a\u00020\u0007H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0007H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0007H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0001H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0007H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0007H\u00c6\u0003J\t\u0010F\u001a\u00020\u000bH\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0007H\u00c6\u0003J\u00db\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u0001H\u00c6\u0001J\u0013\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010M\u001a\u00020\u000bH\u00d6\u0001J\t\u0010N\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010 R\u0011\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0011\u0010\u0017\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001cR\u0011\u0010\u0019\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103\u00a8\u0006O"}, d2 = {"Lcom/app/network/models/responseModels/GetLoansItem;", "", "BRANCH_NAME", "", "CCY_NAME", "CONTRACT", "CREDIT_AMOUNT", "", "CREDIT_NAME", "CUR_INT_AMOUNT", "DELAY_DAY_COUNT", "", "END_DATE", "INT_RATE", "MAIN_BALANCE", "NEXT_PAYMENT_AMOUNT", "NEXT_PAYMENT_DATE", "PAID_TOTAL_MONTH", "PAYMENT_ACCOUNT", "PAYMENT_ACC_BALANCE", "SENED_NO", "START_DATE", "STATUS", "TOTAL_DELAY_AMOUNT", "iban", "nickName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;DILjava/lang/String;DDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/Object;)V", "getBRANCH_NAME", "()Ljava/lang/String;", "getCCY_NAME", "getCONTRACT", "getCREDIT_AMOUNT", "()D", "getCREDIT_NAME", "getCUR_INT_AMOUNT", "getDELAY_DAY_COUNT", "()I", "getEND_DATE", "getINT_RATE", "getMAIN_BALANCE", "getNEXT_PAYMENT_AMOUNT", "getNEXT_PAYMENT_DATE", "getPAID_TOTAL_MONTH", "getPAYMENT_ACCOUNT", "getPAYMENT_ACC_BALANCE", "getSENED_NO", "getSTART_DATE", "getSTATUS", "getTOTAL_DELAY_AMOUNT", "getIban", "getNickName", "()Ljava/lang/Object;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "data_debug"})
public final class GetLoansItem {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String BRANCH_NAME = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CCY_NAME = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CONTRACT = null;
    private final double CREDIT_AMOUNT = 0.0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CREDIT_NAME = null;
    private final double CUR_INT_AMOUNT = 0.0;
    private final int DELAY_DAY_COUNT = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String END_DATE = null;
    private final double INT_RATE = 0.0;
    private final double MAIN_BALANCE = 0.0;
    private final double NEXT_PAYMENT_AMOUNT = 0.0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String NEXT_PAYMENT_DATE = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String PAID_TOTAL_MONTH = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String PAYMENT_ACCOUNT = null;
    private final double PAYMENT_ACC_BALANCE = 0.0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String SENED_NO = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String START_DATE = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String STATUS = null;
    private final double TOTAL_DELAY_AMOUNT = 0.0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String iban = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object nickName = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.app.network.models.responseModels.GetLoansItem copy(@org.jetbrains.annotations.NotNull
    java.lang.String BRANCH_NAME, @org.jetbrains.annotations.NotNull
    java.lang.String CCY_NAME, @org.jetbrains.annotations.NotNull
    java.lang.String CONTRACT, double CREDIT_AMOUNT, @org.jetbrains.annotations.NotNull
    java.lang.String CREDIT_NAME, double CUR_INT_AMOUNT, int DELAY_DAY_COUNT, @org.jetbrains.annotations.NotNull
    java.lang.String END_DATE, double INT_RATE, double MAIN_BALANCE, double NEXT_PAYMENT_AMOUNT, @org.jetbrains.annotations.NotNull
    java.lang.String NEXT_PAYMENT_DATE, @org.jetbrains.annotations.NotNull
    java.lang.String PAID_TOTAL_MONTH, @org.jetbrains.annotations.NotNull
    java.lang.String PAYMENT_ACCOUNT, double PAYMENT_ACC_BALANCE, @org.jetbrains.annotations.NotNull
    java.lang.String SENED_NO, @org.jetbrains.annotations.NotNull
    java.lang.String START_DATE, @org.jetbrains.annotations.NotNull
    java.lang.String STATUS, double TOTAL_DELAY_AMOUNT, @org.jetbrains.annotations.NotNull
    java.lang.String iban, @org.jetbrains.annotations.NotNull
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
    
    public GetLoansItem(@org.jetbrains.annotations.NotNull
    java.lang.String BRANCH_NAME, @org.jetbrains.annotations.NotNull
    java.lang.String CCY_NAME, @org.jetbrains.annotations.NotNull
    java.lang.String CONTRACT, double CREDIT_AMOUNT, @org.jetbrains.annotations.NotNull
    java.lang.String CREDIT_NAME, double CUR_INT_AMOUNT, int DELAY_DAY_COUNT, @org.jetbrains.annotations.NotNull
    java.lang.String END_DATE, double INT_RATE, double MAIN_BALANCE, double NEXT_PAYMENT_AMOUNT, @org.jetbrains.annotations.NotNull
    java.lang.String NEXT_PAYMENT_DATE, @org.jetbrains.annotations.NotNull
    java.lang.String PAID_TOTAL_MONTH, @org.jetbrains.annotations.NotNull
    java.lang.String PAYMENT_ACCOUNT, double PAYMENT_ACC_BALANCE, @org.jetbrains.annotations.NotNull
    java.lang.String SENED_NO, @org.jetbrains.annotations.NotNull
    java.lang.String START_DATE, @org.jetbrains.annotations.NotNull
    java.lang.String STATUS, double TOTAL_DELAY_AMOUNT, @org.jetbrains.annotations.NotNull
    java.lang.String iban, @org.jetbrains.annotations.NotNull
    java.lang.Object nickName) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBRANCH_NAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCCY_NAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCONTRACT() {
        return null;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double getCREDIT_AMOUNT() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCREDIT_NAME() {
        return null;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double getCUR_INT_AMOUNT() {
        return 0.0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getDELAY_DAY_COUNT() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEND_DATE() {
        return null;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    public final double getINT_RATE() {
        return 0.0;
    }
    
    public final double component10() {
        return 0.0;
    }
    
    public final double getMAIN_BALANCE() {
        return 0.0;
    }
    
    public final double component11() {
        return 0.0;
    }
    
    public final double getNEXT_PAYMENT_AMOUNT() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNEXT_PAYMENT_DATE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPAID_TOTAL_MONTH() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPAYMENT_ACCOUNT() {
        return null;
    }
    
    public final double component15() {
        return 0.0;
    }
    
    public final double getPAYMENT_ACC_BALANCE() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSENED_NO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSTART_DATE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSTATUS() {
        return null;
    }
    
    public final double component19() {
        return 0.0;
    }
    
    public final double getTOTAL_DELAY_AMOUNT() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIban() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getNickName() {
        return null;
    }
}