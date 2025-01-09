package com.app.uikit.bottomSheet;

import java.lang.System;

@kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001aA\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\bH\u0007\u001a\b\u0010\r\u001a\u00020\u0001H\u0003\u001a3\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\bH\u0003\u00a8\u0006\u0011"}, d2 = {"SelectCompanyBottomSheet", "", "selectCompanyState", "Landroidx/compose/runtime/MutableState;", "", "customers", "Lcom/app/network/models/responseModels/Customers;", "onItemClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "companyName", "display", "rowItem", "asanCustomer", "Lcom/app/network/models/responseModels/AsanCustomer;", "uikit_debug"})
public final class SelectCompanyBottomSheetKt {
    
    @androidx.compose.runtime.Composable
    public static final void SelectCompanyBottomSheet() {
    }
    
    @androidx.compose.runtime.Composable
    public static final void SelectCompanyBottomSheet(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.Boolean> selectCompanyState, @org.jetbrains.annotations.NotNull
    com.app.network.models.responseModels.Customers customers, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemClick) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void rowItem(com.app.network.models.responseModels.AsanCustomer asanCustomer, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemClick) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview
    private static final void display() {
    }
}