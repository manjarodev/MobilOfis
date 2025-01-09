package com.app.uikit.bottomSheet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001aG\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a3\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002\u001a\b\u0010\u0011\u001a\u00020\u0001H\u0007\u00a8\u0006\u0012"}, d2 = {"TypeBottomSheet", "", "showStatusBottomSheet", "Landroidx/compose/runtime/MutableState;", "", "typeList", "", "", "onTypeClick", "Lkotlin/Function1;", "Lcom/app/uikit/bottomSheet/TypeModel;", "Lkotlin/ParameterName;", "name", "menuItem", "TypeMenuItem", "extractTypeDetails", "type", "showTypeBottom", "uikit_debug"})
public final class TypeBottomSheetKt {
    
    @androidx.compose.runtime.Composable
    public static final void TypeBottomSheet() {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void TypeBottomSheet(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.Boolean> showStatusBottomSheet, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> typeList, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.app.uikit.bottomSheet.TypeModel, kotlin.Unit> onTypeClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void TypeMenuItem(@org.jetbrains.annotations.NotNull
    java.lang.String menuItem, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.app.uikit.bottomSheet.TypeModel, kotlin.Unit> onTypeClick) {
    }
    
    private static final java.lang.String extractTypeDetails(java.lang.String type) {
        return null;
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(device = "id:pixel_4", showSystemUi = true, showBackground = true)
    public static final void showTypeBottom() {
    }
}