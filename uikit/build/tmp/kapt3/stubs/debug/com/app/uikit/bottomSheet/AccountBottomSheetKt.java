package com.app.uikit.bottomSheet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001aI\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a3\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a\b\u0010\u000e\u001a\u00020\u0001H\u0007\u00a8\u0006\u000f"}, d2 = {"AccountBottomSheet", "", "showAccountBottomSheet", "Landroidx/compose/runtime/MutableState;", "", "accounts", "", "Lcom/app/uikit/models/AccountsData;", "onAccountClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "accountItem", "AccountMenuItem", "previewAccounts", "uikit_debug"})
public final class AccountBottomSheetKt {
    
    @androidx.compose.runtime.Composable
    public static final void AccountBottomSheet() {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void AccountBottomSheet(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.Boolean> showAccountBottomSheet, @org.jetbrains.annotations.Nullable
    java.util.List<com.app.uikit.models.AccountsData> accounts, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.app.uikit.models.AccountsData, kotlin.Unit> onAccountClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void AccountMenuItem(@org.jetbrains.annotations.NotNull
    com.app.uikit.models.AccountsData accountItem, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.app.uikit.models.AccountsData, kotlin.Unit> onAccountClick) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(device = "id:pixel_4", showSystemUi = true, showBackground = true)
    public static final void previewAccounts() {
    }
}