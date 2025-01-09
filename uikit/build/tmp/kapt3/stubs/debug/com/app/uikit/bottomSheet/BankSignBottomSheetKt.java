package com.app.uikit.bottomSheet;

import java.lang.System;

@kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class, androidx.compose.material3.ExperimentalMaterial3Api.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007\u001a\b\u0010\u000b\u001a\u00020\u0001H\u0007\u001a.\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u0006H\u0003\u00a8\u0006\u0010"}, d2 = {"BankSignBottomSheet", "", "aboutBankState", "Landroidx/compose/runtime/MutableState;", "", "onItemClick", "Lkotlin/Function1;", "Lcom/app/uikit/models/AuthType;", "BankSignSheet", "navController", "Landroidx/navigation/NavController;", "BankSignSheetView", "SigningItem", "bankSign", "Lcom/app/uikit/bottomSheet/BankSign;", "isSelected", "uikit_debug"})
public final class BankSignBottomSheetKt {
    
    @androidx.compose.runtime.Composable
    public static final void BankSignSheet(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void BankSignBottomSheet(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.Boolean> aboutBankState, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.app.uikit.models.AuthType, kotlin.Unit> onItemClick) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void SigningItem(com.app.uikit.bottomSheet.BankSign bankSign, com.app.uikit.bottomSheet.BankSign isSelected, kotlin.jvm.functions.Function1<? super com.app.uikit.bottomSheet.BankSign, kotlin.Unit> onItemClick) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview
    public static final void BankSignSheetView() {
    }
}