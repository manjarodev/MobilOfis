package com.app.network.retrofitClient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\fH\'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0006H\'J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\'J\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\'J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0003H\'J\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\'J\"\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\'J\"\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\'J\"\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\'J,\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010(\u001a\u00020\u0006H\'J,\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010+\u001a\u00020\u00062\b\b\u0001\u0010,\u001a\u00020\u0006H\'J6\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010+\u001a\u00020\u00062\b\b\u0001\u0010,\u001a\u00020\u00062\b\b\u0001\u0010/\u001a\u00020\u0013H\'J\"\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u00102\u001a\u000203H\'J\"\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\'J\"\u00106\u001a\b\u0012\u0004\u0012\u0002070\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u00108\u001a\u00020\u0006H\'J\u0018\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00032\b\b\u0001\u0010;\u001a\u00020<H\'J\"\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010=\u001a\u00020?H\'J\u0018\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u00032\b\b\u0001\u0010B\u001a\u00020CH\'J\"\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010F\u001a\u00020GH\'J%\u0010H\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010I\u001a\u00020JH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010KJ\"\u0010L\u001a\b\u0012\u0004\u0012\u00020>0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010M\u001a\u00020NH\'J\"\u0010O\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010O\u001a\u00020PH\'J\"\u0010Q\u001a\b\u0012\u0004\u0012\u00020E0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010R\u001a\u00020SH\'J\"\u0010T\u001a\b\u0012\u0004\u0012\u00020U0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010V\u001a\u00020\u0006H\'J\"\u0010W\u001a\b\u0012\u0004\u0012\u00020E0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010X\u001a\u00020\u0013H\'J\u0018\u0010Y\u001a\b\u0012\u0004\u0012\u00020Z0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010[\u001a\b\u0012\u0004\u0012\u00020\\0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010]\u001a\u00020^H\'J\"\u0010_\u001a\b\u0012\u0004\u0012\u00020\\0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010`\u001a\u00020aH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006b"}, d2 = {"Lcom/app/network/retrofitClient/APIService;", "", "changePassword", "Lretrofit2/Call;", "Lcom/app/network/models/responseModels/ChangePasswordResponse;", "token", "", "changePasswordRequest", "Lcom/app/network/models/requestModels/ChangePasswordRequest;", "changePasswordVerify", "Lcom/app/network/models/responseModels/VerifyChangePasswordResponse;", "verifyChangePasswordRequest", "Lcom/app/network/models/requestModels/VerifyChangePasswordRequest;", "disable2FA", "Lokhttp3/ResponseBody;", "enable2FA", "getAccountBlockByIBAN", "Lcom/app/network/models/responseModels/GetAccountBlocks;", "customerId", "", "iban", "getAccounts", "Lcom/app/network/models/responseModels/GetAccounts;", "getBalance", "Lcom/app/network/models/responseModels/GetCustomerBalance;", "getBusinessDate", "getDashBoardMessage", "Lcom/app/network/models/responseModels/GetStartMessage;", "getExchangeList", "Lcom/app/network/models/responseModels/GetExchangeRates;", "getLastLogin", "Lcom/app/network/models/responseModels/GetLastLogin;", "getLoans", "Lcom/app/network/models/responseModels/GetLoans;", "getNewBusinessCards", "Lcom/app/network/models/responseModels/GetNewCards;", "getOldBusinessCards", "Lcom/app/network/models/responseModels/GetOldCards;", "getRecentOps", "Lcom/app/network/models/responseModels/GetRecentOps;", "flag", "getTransferCountSummary", "Lcom/app/network/models/responseModels/transferModels/TransferCountSummaryResponse;", "startDate", "endDate", "getTransferList", "Lcom/app/network/models/responseModels/transferModels/TransferListResponse;", "page", "getTransferPdfList", "Lcom/app/network/models/responseModels/GetPdfResponse;", "getPdfList", "Lcom/app/network/models/requestModels/GetPdfList;", "getTrusts", "Lcom/app/network/models/responseModels/GetTrusts;", "getUserInfo", "Lcom/app/network/models/responseModels/GetUserProfile;", "customerNo", "loginAsan", "Lcom/app/network/models/responseModels/LoginAsanResponse;", "loginAsanRequest", "Lcom/app/network/models/requestModels/LoginAsanRequest;", "loginVerification", "Lcom/app/network/models/responseModels/LoginVerifyResponse;", "Lcom/app/network/models/requestModels/LoginVerificationRequest;", "loginWithUserName", "Lcom/app/network/models/responseModels/LoginResponse;", "loginBody", "Lcom/app/network/models/requestModels/LoginRequest;", "sendToBankAPI", "Lcom/app/network/models/responseModels/SignApproveResponse;", "sendToBank", "Lcom/app/network/models/requestModels/SendToBankModel;", "setAccountNickName", "accountNickNameRequest", "Lcom/app/network/models/requestModels/AccountNickNameRequest;", "(Ljava/lang/String;Lcom/app/network/models/requestModels/AccountNickNameRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCompanyName", "chaneCompanyName", "Lcom/app/network/models/requestModels/ChangeCompanyName;", "setFavCustomer", "Lcom/app/network/models/requestModels/SetFavCustomer;", "signOrApprove", "signApproveRequest", "Lcom/app/network/models/requestModels/SignApproveRequest;", "transactionDetails", "Lcom/app/network/models/responseModels/TransactionDetails;", "ibankRef", "transactionStatus", "code", "userRoles", "Lcom/app/network/models/responseModels/GetUserRoles;", "verify2FA", "Lcom/app/network/models/responseModels/GetVerify2FA;", "verify2FARequest", "Lcom/app/network/models/requestModels/VerifyRequest;", "verify2FASecret", "verifySecretRequest", "Lcom/app/network/models/requestModels/VerifySecretRequest;", "data_debug"})
public abstract interface APIService {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "auth/login")
    public abstract retrofit2.Call<com.app.network.models.responseModels.LoginResponse> loginWithUserName(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.app.network.models.requestModels.LoginRequest loginBody);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "auth/login/verify")
    public abstract retrofit2.Call<com.app.network.models.responseModels.LoginVerifyResponse> loginVerification(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.app.network.models.requestModels.LoginVerificationRequest loginVerification);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "auth/asan")
    public abstract retrofit2.Call<com.app.network.models.responseModels.LoginAsanResponse> loginAsan(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.app.network.models.requestModels.LoginAsanRequest loginAsanRequest);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "auth/changepassword")
    public abstract retrofit2.Call<com.app.network.models.responseModels.ChangePasswordResponse> changePassword(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.app.network.models.requestModels.ChangePasswordRequest changePasswordRequest);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "auth/changepassword/verify")
    public abstract retrofit2.Call<com.app.network.models.responseModels.VerifyChangePasswordResponse> changePasswordVerify(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.app.network.models.requestModels.VerifyChangePasswordRequest verifyChangePasswordRequest);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "auth/set-fav-customer")
    public abstract retrofit2.Call<okhttp3.ResponseBody> setFavCustomer(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.app.network.models.requestModels.SetFavCustomer setFavCustomer);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "customers/{customerId}/accounts")
    public abstract retrofit2.Call<com.app.network.models.responseModels.GetAccounts> getAccounts(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @retrofit2.http.Path(value = "customerId")
    int customerId);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "customers/{customerId}/accounts/nickname")
    public abstract java.lang.Object setAccountNickName(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.app.network.models.requestModels.AccountNickNameRequest accountNickNameRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> continuation);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "customers/{customerId}/balance")
    public abstract retrofit2.Call<com.app.network.models.responseModels.GetCustomerBalance> getBalance(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @retrofit2.http.Path(value = "customerId")
    int customerId);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "auth/getlastlogin")
    public abstract retrofit2.Call<com.app.network.models.responseModels.GetLastLogin> getLastLogin(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "auth/getuserinfo")
    public abstract retrofit2.Call<com.app.network.models.responseModels.GetUserProfile> getUserInfo(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "customerNo")
    java.lang.String customerNo);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "customers/{customerId}/accounts/blocksbyiban/{iban}")
    public abstract retrofit2.Call<com.app.network.models.responseModels.GetAccountBlocks> getAccountBlockByIBAN(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @retrofit2.http.Path(value = "customerId")
    int customerId, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "iban")
    java.lang.String iban);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "brcards/get-old-business-cards-by-cif/{customerId}")
    public abstract retrofit2.Call<com.app.network.models.responseModels.GetOldCards> getOldBusinessCards(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @retrofit2.http.Path(value = "customerId")
    int customerId);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "brcards/get-new-business-cards-by-cif/{customerId}")
    public abstract retrofit2.Call<com.app.network.models.responseModels.GetNewCards> getNewBusinessCards(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @retrofit2.http.Path(value = "customerId")
    int customerId);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "credit/{customerId}")
    public abstract retrofit2.Call<com.app.network.models.responseModels.GetLoans> getLoans(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @retrofit2.http.Path(value = "customerId")
    int customerId);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "customers/{customerId}/timedeposits")
    public abstract retrofit2.Call<com.app.network.models.responseModels.GetTrusts> getTrusts(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @retrofit2.http.Path(value = "customerId")
    int customerId);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "customers/{customerId}/activities-byfilter?page=1&limit=20")
    public abstract retrofit2.Call<com.app.network.models.responseModels.GetRecentOps> getRecentOps(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @retrofit2.http.Path(value = "customerId")
    int customerId, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "debit_credit_flag")
    java.lang.String flag);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "customers/{customerId}/activities-byfilter?page=1&limit=20")
    public abstract retrofit2.Call<com.app.network.models.responseModels.GetRecentOps> getRecentOps(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @retrofit2.http.Path(value = "customerId")
    int customerId);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "auth/totp-register/disable")
    public abstract retrofit2.Call<okhttp3.ResponseBody> disable2FA(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "auth/totp-register/enable")
    public abstract retrofit2.Call<okhttp3.ResponseBody> enable2FA(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "auth/totp-register/status")
    public abstract retrofit2.Call<com.app.network.models.responseModels.GetVerify2FA> verify2FA(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.app.network.models.requestModels.VerifyRequest verify2FARequest);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "auth/totp-register/verify")
    public abstract retrofit2.Call<com.app.network.models.responseModels.GetVerify2FA> verify2FASecret(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.app.network.models.requestModels.VerifySecretRequest verifySecretRequest);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "exchange/exchange/listrates")
    public abstract retrofit2.Call<com.app.network.models.responseModels.GetExchangeRates> getExchangeList(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "auth/setcustomer")
    public abstract retrofit2.Call<com.app.network.models.responseModels.LoginVerifyResponse> setCompanyName(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.app.network.models.requestModels.ChangeCompanyName chaneCompanyName);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "bank/bussinessdate")
    public abstract retrofit2.Call<okhttp3.ResponseBody> getBusinessDate(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "transaction/transfer-count-summary")
    public abstract retrofit2.Call<com.app.network.models.responseModels.transferModels.TransferCountSummaryResponse> getTransferCountSummary(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "startdate")
    java.lang.String startDate, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "enddate")
    java.lang.String endDate);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "transaction/transfer-list/{startDate}/{endDate}")
    public abstract retrofit2.Call<com.app.network.models.responseModels.transferModels.TransferListResponse> getTransferList(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "startDate")
    java.lang.String startDate, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "endDate")
    java.lang.String endDate, @retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "file/get-list-payment-order-pdf")
    public abstract retrofit2.Call<com.app.network.models.responseModels.GetPdfResponse> getTransferPdfList(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.app.network.models.requestModels.GetPdfList getPdfList);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "transaction/getransactionbyibankref/{ibankRef}")
    public abstract retrofit2.Call<com.app.network.models.responseModels.TransactionDetails> transactionDetails(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "ibankRef")
    java.lang.String ibankRef);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "auth/rule-transaction-button")
    public abstract retrofit2.Call<com.app.network.models.responseModels.GetUserRoles> userRoles(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "transaction/approve")
    public abstract retrofit2.Call<com.app.network.models.responseModels.SignApproveResponse> signOrApprove(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.app.network.models.requestModels.SignApproveRequest signApproveRequest);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "transaction/status/{code}")
    public abstract retrofit2.Call<com.app.network.models.responseModels.SignApproveResponse> transactionStatus(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @retrofit2.http.Path(value = "code")
    int code);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "transaction/send-to-bank")
    public abstract retrofit2.Call<com.app.network.models.responseModels.SignApproveResponse> sendToBankAPI(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Auth_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.app.network.models.requestModels.SendToBankModel sendToBank);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "bank/dashboardMessage")
    public abstract retrofit2.Call<com.app.network.models.responseModels.GetStartMessage> getDashBoardMessage();
}