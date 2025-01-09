package com.app.home.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020%H\u0003\u001a9\u0010&\u001a\u00020\"2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032!\u0010(\u001a\u001d\u0012\u0013\u0012\u00110*\u00a2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\"0)H\u0007\u001a\b\u0010.\u001a\u00020\"H\u0007\u001a\u001a\u0010/\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\b\b\u0002\u00100\u001a\u000201H\u0007\u001a\b\u00102\u001a\u00020\"H\u0002\u001a\u0010\u00103\u001a\u00020\"2\u0006\u00104\u001a\u000205H\u0002\u001a0\u00106\u001a\u00020\"2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u00109\u001a\b\u0012\u0004\u0012\u00020;0:\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\" \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\u000b\"\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006\"\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0019\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006\u00a8\u0006<"}, d2 = {"TAG", "", "disableSearch", "Landroidx/compose/runtime/MutableState;", "", "getDisableSearch", "()Landroidx/compose/runtime/MutableState;", "enableSearch", "getEnableSearch", "isShowBalance", "setShowBalance", "(Landroidx/compose/runtime/MutableState;)V", "recentDetail", "Lcom/app/network/models/responseModels/GetRecentOpsItem;", "getRecentDetail", "search", "getSearch", "searchAccountNo", "getSearchAccountNo", "searchBy", "Lcom/app/home/main/model/SearchBy;", "getSearchBy", "searchContract", "getSearchContract", "searchDepositName", "getSearchDepositName", "searchFrom", "Lcom/app/home/main/model/Search;", "getSearchFrom", "searchIban", "getSearchIban", "searchUser", "getSearchUser", "CardsItem", "", "data", "navController", "Landroidx/navigation/NavController;", "DropDownPopup", "expanded", "selectedString", "Lkotlin/Function1;", "Lcom/app/home/main/Balance;", "Lkotlin/ParameterName;", "name", "type", "HomeScreenPreview", "MenuScreen", "viewModel", "Lcom/app/network/viewmodel/HomeViewModel;", "handleSearchParams", "handleUserRoles", "role", "", "setDefaultBalanceValue", "customerBalanceType", "balance", "customerBalance", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/app/network/models/responseModels/GetCustomerBalanceItem;", "home_debug"})
public final class MainScreenKt {
    private static final java.lang.String TAG = "MenuScreen";
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.runtime.MutableState<com.app.network.models.responseModels.GetRecentOpsItem> recentDetail = null;
    @org.jetbrains.annotations.NotNull
    private static androidx.compose.runtime.MutableState<java.lang.Boolean> isShowBalance;
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.runtime.MutableState<java.lang.Boolean> enableSearch = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.runtime.MutableState<java.lang.Boolean> disableSearch = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.runtime.MutableState<java.lang.String> searchIban = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.runtime.MutableState<java.lang.String> searchUser = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.runtime.MutableState<java.lang.String> searchContract = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.runtime.MutableState<java.lang.String> searchDepositName = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.runtime.MutableState<java.lang.String> searchAccountNo = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.runtime.MutableState<java.lang.String> search = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.runtime.MutableState<com.app.home.main.model.Search> searchFrom = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.runtime.MutableState<com.app.home.main.model.SearchBy> searchBy = null;
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<com.app.network.models.responseModels.GetRecentOpsItem> getRecentDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<java.lang.Boolean> isShowBalance() {
        return null;
    }
    
    public static final void setShowBalance(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<java.lang.Boolean> getEnableSearch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<java.lang.Boolean> getDisableSearch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<java.lang.String> getSearchIban() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<java.lang.String> getSearchUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<java.lang.String> getSearchContract() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<java.lang.String> getSearchDepositName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<java.lang.String> getSearchAccountNo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<java.lang.String> getSearch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<com.app.home.main.model.Search> getSearchFrom() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<com.app.home.main.model.SearchBy> getSearchBy() {
        return null;
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material.ExperimentalMaterialApi.class})
    @android.annotation.SuppressLint(value = {"FlowOperatorInvokedInComposition"})
    public static final void MenuScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.app.network.viewmodel.HomeViewModel viewModel) {
    }
    
    private static final void handleUserRoles(int role) {
    }
    
    private static final void handleSearchParams() {
    }
    
    @androidx.compose.runtime.Composable
    private static final void CardsItem(com.app.network.models.responseModels.GetRecentOpsItem data, androidx.navigation.NavController navController) {
    }
    
    public static final void setDefaultBalanceValue(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.String> customerBalanceType, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.String> balance, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.snapshots.SnapshotStateList<com.app.network.models.responseModels.GetCustomerBalanceItem> customerBalance) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void DropDownPopup(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.Boolean> expanded, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.app.home.main.Balance, kotlin.Unit> selectedString) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(device = "id:pixel_4", showBackground = true, showSystemUi = true)
    public static final void HomeScreenPreview() {
    }
}