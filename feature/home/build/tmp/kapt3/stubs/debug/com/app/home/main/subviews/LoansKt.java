package com.app.home.main.subviews;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\bH\u0003\u001a\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u001a$\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\bH\u0003\u001a\b\u0010\u0014\u001a\u00020\u0006H\u0007\"\u0019\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0015"}, d2 = {"loanItem", "Landroidx/compose/runtime/MutableState;", "Lcom/app/network/models/responseModels/GetLoansItem;", "getLoanItem", "()Landroidx/compose/runtime/MutableState;", "Filters", "", "onFilter", "Lkotlin/Function1;", "", "onSelectedFilter", "", "LoansList", "navController", "Landroidx/navigation/NavController;", "viewModel", "Lcom/app/network/viewmodel/HomeViewModel;", "LoansListItem", "obj", "onSelectedLoan", "LoansPreview", "home_debug"})
public final class LoansKt {
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.runtime.MutableState<com.app.network.models.responseModels.GetLoansItem> loanItem = null;
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<com.app.network.models.responseModels.GetLoansItem> getLoanItem() {
        return null;
    }
    
    @androidx.compose.runtime.Composable
    public static final void LoansList(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.app.network.viewmodel.HomeViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void LoansListItem(com.app.network.models.responseModels.GetLoansItem obj, kotlin.jvm.functions.Function1<? super com.app.network.models.responseModels.GetLoansItem, kotlin.Unit> onSelectedLoan) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void Filters(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFilter, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onSelectedFilter) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(device = "id:pixel_4")
    public static final void LoansPreview() {
    }
}