package com.app.uikit.bottomSheet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a8\u0010\u0002\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\nH\u0007\u001a$\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\nH\u0003\u001a\b\u0010\r\u001a\u00020\u0001H\u0003\u00a8\u0006\u000e"}, d2 = {"BottomSheetCard", "", "BottomSheetCardStatus", "showStatusBottomSheet", "Landroidx/compose/runtime/MutableState;", "", "statusList", "", "", "onStatusClick", "Lkotlin/Function1;", "StatusMenuItem", "status", "showStatus", "uikit_debug"})
public final class BottomSheetCardStatusKt {
    
    @androidx.compose.runtime.Composable
    public static final void BottomSheetCard() {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void BottomSheetCardStatus(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.Boolean> showStatusBottomSheet, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> statusList, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onStatusClick) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void StatusMenuItem(java.lang.String status, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onStatusClick) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(device = "id:pixel_4", showSystemUi = true, showBackground = true)
    private static final void showStatus() {
    }
}