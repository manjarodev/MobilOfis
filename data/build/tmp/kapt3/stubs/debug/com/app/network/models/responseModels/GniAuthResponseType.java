package com.app.network.models.responseModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bU\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00f5\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u0001\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u0001\u0012\u0006\u0010\u001e\u001a\u00020\n\u0012\u0006\u0010\u001f\u001a\u00020\u0001\u0012\u0006\u0010 \u001a\u00020\u0001\u0012\u0006\u0010!\u001a\u00020\n\u00a2\u0006\u0002\u0010\"J\t\u0010C\u001a\u00020\u0001H\u00c6\u0003J\t\u0010D\u001a\u00020\rH\u00c6\u0003J\t\u0010E\u001a\u00020\u0001H\u00c6\u0003J\t\u0010F\u001a\u00020\u0001H\u00c6\u0003J\t\u0010G\u001a\u00020\u0001H\u00c6\u0003J\t\u0010H\u001a\u00020\u0001H\u00c6\u0003J\t\u0010I\u001a\u00020\nH\u00c6\u0003J\t\u0010J\u001a\u00020\u0001H\u00c6\u0003J\t\u0010K\u001a\u00020\u0001H\u00c6\u0003J\t\u0010L\u001a\u00020\u0001H\u00c6\u0003J\t\u0010M\u001a\u00020\nH\u00c6\u0003J\t\u0010N\u001a\u00020\u0001H\u00c6\u0003J\t\u0010O\u001a\u00020\u0001H\u00c6\u0003J\t\u0010P\u001a\u00020\u0001H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0001H\u00c6\u0003J\t\u0010R\u001a\u00020\nH\u00c6\u0003J\t\u0010S\u001a\u00020\nH\u00c6\u0003J\t\u0010T\u001a\u00020\u0001H\u00c6\u0003J\t\u0010U\u001a\u00020\u0001H\u00c6\u0003J\t\u0010V\u001a\u00020\nH\u00c6\u0003J\t\u0010W\u001a\u00020\u0001H\u00c6\u0003J\t\u0010X\u001a\u00020\u0001H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0001H\u00c6\u0003J\t\u0010Z\u001a\u00020\nH\u00c6\u0003J\t\u0010[\u001a\u00020\u0001H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0001H\u00c6\u0003J\t\u0010]\u001a\u00020\u0001H\u00c6\u0003J\t\u0010^\u001a\u00020\u0001H\u00c6\u0003J\t\u0010_\u001a\u00020\nH\u00c6\u0003J\t\u0010`\u001a\u00020\u0001H\u00c6\u0003J\u00b5\u0002\u0010a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\nH\u00c6\u0001J\u0013\u0010b\u001a\u00020c2\b\u0010d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010e\u001a\u00020\rH\u00d6\u0001J\t\u0010f\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0003\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0011\u0010\u0005\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010$R\u0011\u0010\u0006\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0011\u0010\u0007\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\b\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u000b\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u000e\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0011\u0010\u000f\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0011\u0010\u0010\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0011\u0010\u0011\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010$R\u0011\u0010\u0012\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010,R\u0011\u0010\u0013\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0011\u0010\u0014\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0011\u0010\u0015\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010$R\u0011\u0010\u0016\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010,R\u0011\u0010\u0017\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010$R\u0011\u0010\u0018\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010$R\u0011\u0010\u0019\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010$R\u0011\u0010\u001a\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010,R\u0011\u0010\u001b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010,R\u0011\u0010\u001c\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010$R\u0011\u0010\u001d\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010$R\u0011\u0010\u001e\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010,R\u0011\u0010\u001f\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010$R\u0011\u0010 \u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010$R\u0011\u0010!\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010,\u00a8\u0006g"}, d2 = {"Lcom/app/network/models/responseModels/GniAuthResponseType;", "", "TOTPSecret", "action", "apiKey", "authToken", "authType", "certIdentifier", "certsList", "channel", "", "clientId", "customerNo", "", "customers", "deviceId", "ecid", "isTOTPEnabled", "locale", "message", "module", "personalCode", "phoneNumber", "proxyCustomerNo", "refreshToken", "registerOTP", "role", "timeStamp", "totalApproverCount", "totalSignerCount", "userId", "userLongName", "userName", "verfication", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V", "getTOTPSecret", "()Ljava/lang/Object;", "getAction", "getApiKey", "getAuthToken", "getAuthType", "getCertIdentifier", "getCertsList", "getChannel", "()Ljava/lang/String;", "getClientId", "getCustomerNo", "()I", "getCustomers", "getDeviceId", "getEcid", "getLocale", "getMessage", "getModule", "getPersonalCode", "getPhoneNumber", "getProxyCustomerNo", "getRefreshToken", "getRegisterOTP", "getRole", "getTimeStamp", "getTotalApproverCount", "getTotalSignerCount", "getUserId", "getUserLongName", "getUserName", "getVerfication", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "data_debug"})
public final class GniAuthResponseType {
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object TOTPSecret = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object action = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object apiKey = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object authToken = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object authType = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object certIdentifier = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object certsList = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String channel = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object clientId = null;
    private final int customerNo = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object customers = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object deviceId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object ecid = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object isTOTPEnabled = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String locale = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object message = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object module = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object personalCode = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String phoneNumber = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object proxyCustomerNo = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object refreshToken = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object registerOTP = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String role = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String timeStamp = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object totalApproverCount = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object totalSignerCount = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String userId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object userLongName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object userName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String verfication = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.app.network.models.responseModels.GniAuthResponseType copy(@org.jetbrains.annotations.NotNull
    java.lang.Object TOTPSecret, @org.jetbrains.annotations.NotNull
    java.lang.Object action, @org.jetbrains.annotations.NotNull
    java.lang.Object apiKey, @org.jetbrains.annotations.NotNull
    java.lang.Object authToken, @org.jetbrains.annotations.NotNull
    java.lang.Object authType, @org.jetbrains.annotations.NotNull
    java.lang.Object certIdentifier, @org.jetbrains.annotations.NotNull
    java.lang.Object certsList, @org.jetbrains.annotations.NotNull
    java.lang.String channel, @org.jetbrains.annotations.NotNull
    java.lang.Object clientId, int customerNo, @org.jetbrains.annotations.NotNull
    java.lang.Object customers, @org.jetbrains.annotations.NotNull
    java.lang.Object deviceId, @org.jetbrains.annotations.NotNull
    java.lang.Object ecid, @org.jetbrains.annotations.NotNull
    java.lang.Object isTOTPEnabled, @org.jetbrains.annotations.NotNull
    java.lang.String locale, @org.jetbrains.annotations.NotNull
    java.lang.Object message, @org.jetbrains.annotations.NotNull
    java.lang.Object module, @org.jetbrains.annotations.NotNull
    java.lang.Object personalCode, @org.jetbrains.annotations.NotNull
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull
    java.lang.Object proxyCustomerNo, @org.jetbrains.annotations.NotNull
    java.lang.Object refreshToken, @org.jetbrains.annotations.NotNull
    java.lang.Object registerOTP, @org.jetbrains.annotations.NotNull
    java.lang.String role, @org.jetbrains.annotations.NotNull
    java.lang.String timeStamp, @org.jetbrains.annotations.NotNull
    java.lang.Object totalApproverCount, @org.jetbrains.annotations.NotNull
    java.lang.Object totalSignerCount, @org.jetbrains.annotations.NotNull
    java.lang.String userId, @org.jetbrains.annotations.NotNull
    java.lang.Object userLongName, @org.jetbrains.annotations.NotNull
    java.lang.Object userName, @org.jetbrains.annotations.NotNull
    java.lang.String verfication) {
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
    
    public GniAuthResponseType(@org.jetbrains.annotations.NotNull
    java.lang.Object TOTPSecret, @org.jetbrains.annotations.NotNull
    java.lang.Object action, @org.jetbrains.annotations.NotNull
    java.lang.Object apiKey, @org.jetbrains.annotations.NotNull
    java.lang.Object authToken, @org.jetbrains.annotations.NotNull
    java.lang.Object authType, @org.jetbrains.annotations.NotNull
    java.lang.Object certIdentifier, @org.jetbrains.annotations.NotNull
    java.lang.Object certsList, @org.jetbrains.annotations.NotNull
    java.lang.String channel, @org.jetbrains.annotations.NotNull
    java.lang.Object clientId, int customerNo, @org.jetbrains.annotations.NotNull
    java.lang.Object customers, @org.jetbrains.annotations.NotNull
    java.lang.Object deviceId, @org.jetbrains.annotations.NotNull
    java.lang.Object ecid, @org.jetbrains.annotations.NotNull
    java.lang.Object isTOTPEnabled, @org.jetbrains.annotations.NotNull
    java.lang.String locale, @org.jetbrains.annotations.NotNull
    java.lang.Object message, @org.jetbrains.annotations.NotNull
    java.lang.Object module, @org.jetbrains.annotations.NotNull
    java.lang.Object personalCode, @org.jetbrains.annotations.NotNull
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull
    java.lang.Object proxyCustomerNo, @org.jetbrains.annotations.NotNull
    java.lang.Object refreshToken, @org.jetbrains.annotations.NotNull
    java.lang.Object registerOTP, @org.jetbrains.annotations.NotNull
    java.lang.String role, @org.jetbrains.annotations.NotNull
    java.lang.String timeStamp, @org.jetbrains.annotations.NotNull
    java.lang.Object totalApproverCount, @org.jetbrains.annotations.NotNull
    java.lang.Object totalSignerCount, @org.jetbrains.annotations.NotNull
    java.lang.String userId, @org.jetbrains.annotations.NotNull
    java.lang.Object userLongName, @org.jetbrains.annotations.NotNull
    java.lang.Object userName, @org.jetbrains.annotations.NotNull
    java.lang.String verfication) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getTOTPSecret() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getApiKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getAuthToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getAuthType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getCertIdentifier() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getCertsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getChannel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getClientId() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getCustomerNo() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getCustomers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getDeviceId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getEcid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object isTOTPEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLocale() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getPersonalCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getProxyCustomerNo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getRefreshToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getRegisterOTP() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRole() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTimeStamp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getTotalApproverCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getTotalSignerCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getUserLongName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVerfication() {
        return null;
    }
}