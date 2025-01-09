package com.app.network.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\tJ\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tJ$\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tJ,\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010#\u001a\u00020\u000bJ\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010&\u001a\u00020\'J\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010.\u001a\u00020/J\u001c\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u00102\u001a\u000203J!\u00104\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u00105\u001a\u000206H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020-0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u00109\u001a\u00020:J\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020-0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010<\u001a\u00020\u000bJ\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006?"}, d2 = {"Lcom/app/network/repository/HomeRepository;", "", "apiService", "Lcom/app/network/retrofitClient/APIService;", "(Lcom/app/network/retrofitClient/APIService;)V", "getAccountBlockByIban", "Lretrofit2/Call;", "Lcom/app/network/models/responseModels/GetAccountBlocks;", "token", "", "customerId", "", "iban", "getAccounts", "Lcom/app/network/models/responseModels/GetAccounts;", "getBusinessDate", "Lokhttp3/ResponseBody;", "getLoans", "Lcom/app/network/models/responseModels/GetLoans;", "getNewBusinessCards", "Lcom/app/network/models/responseModels/GetNewCards;", "getOldBusinessCards", "Lcom/app/network/models/responseModels/GetOldCards;", "getRecentOps", "Lcom/app/network/models/responseModels/GetRecentOps;", "incomeFlag", "getTransactionDetails", "Lcom/app/network/models/responseModels/TransactionDetails;", "ibankRef", "getTransferCountSummary", "Lcom/app/network/models/responseModels/transferModels/TransferCountSummaryResponse;", "startDate", "endDate", "getTransferList", "Lcom/app/network/models/responseModels/transferModels/TransferListResponse;", "page", "getTransferPdfList", "Lcom/app/network/models/responseModels/GetPdfResponse;", "getPdfList", "Lcom/app/network/models/requestModels/GetPdfList;", "getTrusts", "Lcom/app/network/models/responseModels/GetTrusts;", "getUserBalance", "Lcom/app/network/models/responseModels/GetCustomerBalance;", "sendToBankAPI", "Lcom/app/network/models/responseModels/SignApproveResponse;", "sendToBankModel", "Lcom/app/network/models/requestModels/SendToBankModel;", "setCustomerName", "Lcom/app/network/models/responseModels/LoginVerifyResponse;", "changeCompanyName", "Lcom/app/network/models/requestModels/ChangeCompanyName;", "setUserNickName", "accountNickNameRequest", "Lcom/app/network/models/requestModels/AccountNickNameRequest;", "(Ljava/lang/String;Lcom/app/network/models/requestModels/AccountNickNameRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signOrApprove", "signApproveRequest", "Lcom/app/network/models/requestModels/SignApproveRequest;", "transactionStatus", "code", "userRoles", "Lcom/app/network/models/responseModels/GetUserRoles;", "data_debug"})
public final class HomeRepository {
    private final com.app.network.retrofitClient.APIService apiService = null;
    
    @javax.inject.Inject
    public HomeRepository(@org.jetbrains.annotations.NotNull
    com.app.network.retrofitClient.APIService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.GetAccounts> getAccounts(@org.jetbrains.annotations.NotNull
    java.lang.String token, int customerId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.GetCustomerBalance> getUserBalance(@org.jetbrains.annotations.NotNull
    java.lang.String token, int customerId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object setUserNickName(@org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.AccountNickNameRequest accountNickNameRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.GetAccountBlocks> getAccountBlockByIban(@org.jetbrains.annotations.NotNull
    java.lang.String token, int customerId, @org.jetbrains.annotations.NotNull
    java.lang.String iban) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.GetOldCards> getOldBusinessCards(@org.jetbrains.annotations.NotNull
    java.lang.String token, int customerId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.GetNewCards> getNewBusinessCards(@org.jetbrains.annotations.NotNull
    java.lang.String token, int customerId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.GetLoans> getLoans(@org.jetbrains.annotations.NotNull
    java.lang.String token, int customerId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.GetTrusts> getTrusts(@org.jetbrains.annotations.NotNull
    java.lang.String token, int customerId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.GetRecentOps> getRecentOps(@org.jetbrains.annotations.NotNull
    java.lang.String token, int customerId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.GetRecentOps> getRecentOps(@org.jetbrains.annotations.NotNull
    java.lang.String token, int customerId, @org.jetbrains.annotations.NotNull
    java.lang.String incomeFlag) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.LoginVerifyResponse> setCustomerName(@org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.ChangeCompanyName changeCompanyName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<okhttp3.ResponseBody> getBusinessDate(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.transferModels.TransferCountSummaryResponse> getTransferCountSummary(@org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    java.lang.String startDate, @org.jetbrains.annotations.NotNull
    java.lang.String endDate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.transferModels.TransferListResponse> getTransferList(@org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    java.lang.String startDate, @org.jetbrains.annotations.NotNull
    java.lang.String endDate, int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.GetPdfResponse> getTransferPdfList(@org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.GetPdfList getPdfList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.GetUserRoles> userRoles(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.TransactionDetails> getTransactionDetails(@org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    java.lang.String ibankRef) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.SignApproveResponse> signOrApprove(@org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.SignApproveRequest signApproveRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.SignApproveResponse> transactionStatus(@org.jetbrains.annotations.NotNull
    java.lang.String token, int code) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.app.network.models.responseModels.SignApproveResponse> sendToBankAPI(@org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.SendToBankModel sendToBankModel) {
        return null;
    }
}