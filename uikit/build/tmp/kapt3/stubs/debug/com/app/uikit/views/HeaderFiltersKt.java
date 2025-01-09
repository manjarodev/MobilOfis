package com.app.uikit.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a*\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000eH\u0007\u001a\b\u0010\u0010\u001a\u00020\nH\u0003\u001a$\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000eH\u0003\"\"\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0000\u0010\u0003\"\u0004\b\u0004\u0010\u0005\"\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0003\u00a8\u0006\u0013"}, d2 = {"isHeaderSelected", "Landroidx/compose/runtime/MutableState;", "Lcom/app/network/models/responseModels/transferModels/TransferCountSummaryResponseItem;", "()Landroidx/compose/runtime/MutableState;", "setHeaderSelected", "(Landroidx/compose/runtime/MutableState;)V", "userRole", "Lcom/app/uikit/models/UserRoles;", "getUserRole", "HeaderFilters", "", "transferHeaderList", "", "onFilterClick", "Lkotlin/Function1;", "", "MenuPreview", "TransferMenuItemView", "menu", "uikit_debug"})
public final class HeaderFiltersKt {
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.runtime.MutableState<com.app.uikit.models.UserRoles> userRole = null;
    @org.jetbrains.annotations.NotNull
    private static androidx.compose.runtime.MutableState<com.app.network.models.responseModels.transferModels.TransferCountSummaryResponseItem> isHeaderSelected;
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<com.app.uikit.models.UserRoles> getUserRole() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<com.app.network.models.responseModels.transferModels.TransferCountSummaryResponseItem> isHeaderSelected() {
        return null;
    }
    
    public static final void setHeaderSelected(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<com.app.network.models.responseModels.transferModels.TransferCountSummaryResponseItem> p0) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void HeaderFilters(@org.jetbrains.annotations.NotNull
    java.util.List<com.app.network.models.responseModels.transferModels.TransferCountSummaryResponseItem> transferHeaderList, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFilterClick) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void TransferMenuItemView(com.app.network.models.responseModels.transferModels.TransferCountSummaryResponseItem menu, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFilterClick) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(device = "id:pixel_4")
    private static final void MenuPreview() {
    }
}