package com.app.network.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b:\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IJ\u000e\u0010J\u001a\u00020E2\u0006\u0010F\u001a\u00020GJ\u000e\u0010K\u001a\u00020E2\u0006\u0010F\u001a\u00020GJ\u0006\u0010$\u001a\u00020EJ\u000e\u0010L\u001a\u00020E2\u0006\u0010F\u001a\u00020GJ\u000e\u00106\u001a\u00020E2\u0006\u0010F\u001a\u00020GJ\u000e\u00108\u001a\u00020E2\u0006\u0010F\u001a\u00020GJ\u0016\u0010:\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010M\u001a\u00020IJ\u000e\u0010+\u001a\u00020E2\u0006\u0010N\u001a\u00020IJ\u0016\u00101\u001a\u00020E2\u0006\u0010O\u001a\u00020I2\u0006\u0010P\u001a\u00020IJ\u001e\u0010C\u001a\u00020E2\u0006\u0010Q\u001a\u00020I2\u0006\u0010R\u001a\u00020I2\u0006\u0010S\u001a\u00020GJ\u000e\u0010T\u001a\u00020E2\u0006\u0010U\u001a\u00020VJ\u000e\u0010W\u001a\u00020E2\u0006\u0010F\u001a\u00020GJ\u0006\u00103\u001a\u00020EJ\u000e\u0010X\u001a\u00020E2\u0006\u0010Y\u001a\u00020ZJ\u000e\u0010@\u001a\u00020E2\u0006\u0010[\u001a\u00020\\J\u000e\u0010]\u001a\u00020E2\u0006\u0010^\u001a\u00020_J\u000e\u0010`\u001a\u00020E2\u0006\u0010a\u001a\u00020GR\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u001eR\u001f\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u001f\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u001f\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u001eR\u001f\u0010\'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u001eR\u001f\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b*\u0010\u001eR\u001f\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b,\u0010\u001eR\u001f\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u001eR\u001f\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b0\u0010\u001eR\u001f\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b2\u0010\u001eR\u001f\u00103\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b4\u0010\u001eR\u001f\u00105\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b6\u0010\u001eR\u001f\u00107\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b8\u0010\u001eR\u001f\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b:\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b<\u0010\u001eR\u0011\u0010=\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b>\u0010?R\u001f\u0010@\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\bA\u0010\u001eR\u001f\u0010B\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\bC\u0010\u001e\u00a8\u0006b"}, d2 = {"Lcom/app/network/viewmodel/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/app/network/repository/HomeRepository;", "_session", "Lcom/app/network/helper/Session;", "(Lcom/app/network/repository/HomeRepository;Lcom/app/network/helper/Session;)V", "_accountBalance", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/app/network/models/DataState;", "", "_accountsBlockByIban", "_accountsData", "_businessDate", "_customerLoans", "_customerTrusts", "_getSignOrApprove", "_getTransactionDetails", "_getTransactionPdf", "_getTransferCountSummary", "_getTransferList", "_newBusinessCardsData", "_oldBusinessCardsData", "_recentOps", "_sendToBank", "_setCustomerName", "_transactionStatus", "_userRoles", "accountBalance", "getAccountBalance", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "accountsBlockByIban", "getAccountsBlockByIban", "accountsData", "getAccountsData", "businessDate", "getBusinessDate", "customerLoans", "getCustomerLoans", "customerTrusts", "getCustomerTrusts", "getSignOrApprove", "getGetSignOrApprove", "getTransactionDetails", "getGetTransactionDetails", "getTransactionPdf", "getGetTransactionPdf", "getTransactionStatus", "getGetTransactionStatus", "getTransferCountSummary", "getGetTransferCountSummary", "getUserRoles", "getGetUserRoles", "newBusinessCards", "getNewBusinessCards", "oldBusinessCards", "getOldBusinessCards", "recentOps", "getRecentOps", "sendToBank", "getSendToBank", "session", "getSession", "()Lcom/app/network/helper/Session;", "setCustomerName", "getSetCustomerName", "transferList", "getTransferList", "getAccountBlockByIBAN", "", "customerId", "", "IBAN", "", "getAccounts", "getBalance", "getLoans", "incomeFlag", "ibankRef", "startDate", "endDate", "dateStart", "dateEnd", "page", "getTransferPdfList", "getPdfList", "Lcom/app/network/models/requestModels/GetPdfList;", "getTrusts", "sendToBankAPI", "sendToBankModel", "Lcom/app/network/models/requestModels/SendToBankModel;", "changeCompanyName", "Lcom/app/network/models/requestModels/ChangeCompanyName;", "signOrApprove", "signApproveRequest", "Lcom/app/network/models/requestModels/SignApproveRequest;", "transactionStatus", "code", "data_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.app.network.repository.HomeRepository repository = null;
    private final com.app.network.helper.Session _session = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _accountsData = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _accountsBlockByIban = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _oldBusinessCardsData = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _newBusinessCardsData = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _accountBalance = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _customerLoans = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _customerTrusts = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _recentOps = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _setCustomerName = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _businessDate = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _getTransferCountSummary = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _getTransferList = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _getTransactionDetails = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _getTransactionPdf = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _getSignOrApprove = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _sendToBank = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _transactionStatus = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> _userRoles = null;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.app.network.repository.HomeRepository repository, @org.jetbrains.annotations.NotNull
    com.app.network.helper.Session _session) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.network.helper.Session getSession() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getAccountsData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getAccountsBlockByIban() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getOldBusinessCards() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getNewBusinessCards() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getAccountBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getCustomerLoans() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getCustomerTrusts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getRecentOps() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getSetCustomerName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getBusinessDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getGetTransferCountSummary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getTransferList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getGetTransactionDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getGetTransactionPdf() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getGetSignOrApprove() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getSendToBank() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getGetTransactionStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.app.network.models.DataState<java.lang.Object>> getGetUserRoles() {
        return null;
    }
    
    public final void getAccounts(int customerId) {
    }
    
    public final void getLoans(int customerId) {
    }
    
    public final void getTrusts(int customerId) {
    }
    
    public final void getBalance(int customerId) {
    }
    
    public final void getAccountBlockByIBAN(int customerId, @org.jetbrains.annotations.NotNull
    java.lang.String IBAN) {
    }
    
    public final void getOldBusinessCards(int customerId) {
    }
    
    public final void getNewBusinessCards(int customerId) {
    }
    
    public final void getRecentOps(int customerId, @org.jetbrains.annotations.NotNull
    java.lang.String incomeFlag) {
    }
    
    public final void setCustomerName(@org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.ChangeCompanyName changeCompanyName) {
    }
    
    public final void getBusinessDate() {
    }
    
    public final void getTransferCountSummary(@org.jetbrains.annotations.NotNull
    java.lang.String startDate, @org.jetbrains.annotations.NotNull
    java.lang.String endDate) {
    }
    
    public final void getTransferList(@org.jetbrains.annotations.NotNull
    java.lang.String dateStart, @org.jetbrains.annotations.NotNull
    java.lang.String dateEnd, int page) {
    }
    
    public final void getUserRoles() {
    }
    
    public final void getTransferPdfList(@org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.GetPdfList getPdfList) {
    }
    
    public final void getTransactionDetails(@org.jetbrains.annotations.NotNull
    java.lang.String ibankRef) {
    }
    
    public final void signOrApprove(@org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.SignApproveRequest signApproveRequest) {
    }
    
    public final void transactionStatus(int code) {
    }
    
    public final void sendToBankAPI(@org.jetbrains.annotations.NotNull
    com.app.network.models.requestModels.SendToBankModel sendToBankModel) {
    }
}