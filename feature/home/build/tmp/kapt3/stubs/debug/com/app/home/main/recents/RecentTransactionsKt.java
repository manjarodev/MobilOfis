package com.app.home.main.recents;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0003\u001a\u001a\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0002X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"filterBySearch", "Landroidx/compose/runtime/MutableState;", "", "isSearchEnable", "", "recentTransactions", "CardsItems", "", "data", "Lcom/app/network/models/responseModels/GetRecentOpsItem;", "navController", "Landroidx/navigation/NavController;", "index", "", "RecentTransactions", "viewModel", "Lcom/app/network/viewmodel/HomeViewModel;", "home_debug"})
public final class RecentTransactionsKt {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String recentTransactions = "RecentTransactions";
    private static final androidx.compose.runtime.MutableState<java.lang.Boolean> isSearchEnable = null;
    private static final androidx.compose.runtime.MutableState<java.lang.String> filterBySearch = null;
    
    @androidx.compose.runtime.Composable
    public static final void RecentTransactions(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.app.network.viewmodel.HomeViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void CardsItems(com.app.network.models.responseModels.GetRecentOpsItem data, androidx.navigation.NavController navController, int index) {
    }
}