package com.app.transfer.transfers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0003\u001a\b\u0010\u001f\u001a\u00020\u001cH\u0003\u001a2\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000f2\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001c0%H\u0003\u001a\u001a\u0010&\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007\u001a\b\u0010+\u001a\u00020\u001cH\u0007\u001a\u0018\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0002H\u0002\" \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0004\"\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0004\"\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001X\u0082.\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001X\u0082.\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001X\u0082.\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001X\u0082.\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001X\u0082.\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001X\u0082.\u00a2\u0006\u0002\n\u0000\" \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0004\"\u0004\b\u001a\u0010\u0006\u00a8\u00060"}, d2 = {"endDateSelected", "Landroidx/compose/runtime/MutableState;", "", "getEndDateSelected", "()Landroidx/compose/runtime/MutableState;", "setEndDateSelected", "(Landroidx/compose/runtime/MutableState;)V", "filterByAccount", "filterByAmount", "filterByCurrency", "filterBySearch", "filterByStatus", "getFilterByStatus", "filterByType", "fromMain", "", "getFromMain", "isSearchEnable", "showAmountBottomSheet", "showCurrencyBottomSheet", "showDateBottomSheet", "showFromAccountBottomSheet", "showStatusBottomSheet", "showTypeBottomSheet", "startDateSelected", "getStartDateSelected", "setStartDateSelected", "DateHeader", "", "inputDateTimeString", "Ljava/time/LocalDate;", "FilterListMenu", "TransferListItem", "transfer", "Lcom/app/network/models/responseModels/transferModels/TransferListResponseItem;", "enableSigning", "onTransferSelected", "Lkotlin/Function2;", "TransferScreen", "navController", "Landroidx/navigation/NavController;", "viewModel", "Lcom/app/network/viewmodel/HomeViewModel;", "TransferScreenPreview", "compareDates", "", "dateStr1", "dateStr2", "transfer_debug"})
public final class TransferScreenKt {
    private static androidx.compose.runtime.MutableState<java.lang.Boolean> showDateBottomSheet;
    private static androidx.compose.runtime.MutableState<java.lang.Boolean> showFromAccountBottomSheet;
    private static androidx.compose.runtime.MutableState<java.lang.Boolean> showStatusBottomSheet;
    private static androidx.compose.runtime.MutableState<java.lang.Boolean> showTypeBottomSheet;
    private static androidx.compose.runtime.MutableState<java.lang.Boolean> showAmountBottomSheet;
    private static androidx.compose.runtime.MutableState<java.lang.Boolean> showCurrencyBottomSheet;
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.runtime.MutableState<java.lang.String> filterByStatus = null;
    private static final androidx.compose.runtime.MutableState<java.lang.String> filterByType = null;
    private static final androidx.compose.runtime.MutableState<java.lang.String> filterByAccount = null;
    private static final androidx.compose.runtime.MutableState<java.lang.String> filterByAmount = null;
    private static final androidx.compose.runtime.MutableState<java.lang.String> filterByCurrency = null;
    private static final androidx.compose.runtime.MutableState<java.lang.String> filterBySearch = null;
    private static final androidx.compose.runtime.MutableState<java.lang.Boolean> isSearchEnable = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.runtime.MutableState<java.lang.Boolean> fromMain = null;
    @org.jetbrains.annotations.NotNull
    private static androidx.compose.runtime.MutableState<java.lang.String> startDateSelected;
    @org.jetbrains.annotations.NotNull
    private static androidx.compose.runtime.MutableState<java.lang.String> endDateSelected;
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<java.lang.String> getFilterByStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<java.lang.Boolean> getFromMain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<java.lang.String> getStartDateSelected() {
        return null;
    }
    
    public static final void setStartDateSelected(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<java.lang.String> getEndDateSelected() {
        return null;
    }
    
    public static final void setEndDateSelected(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.String> p0) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void TransferScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.app.network.viewmodel.HomeViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void DateHeader(java.time.LocalDate inputDateTimeString) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void TransferListItem(com.app.network.models.responseModels.transferModels.TransferListResponseItem transfer, boolean enableSigning, kotlin.jvm.functions.Function2<? super com.app.network.models.responseModels.transferModels.TransferListResponseItem, ? super java.lang.Boolean, kotlin.Unit> onTransferSelected) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void FilterListMenu() {
    }
    
    private static final int compareDates(java.lang.String dateStr1, java.lang.String dateStr2) {
        return 0;
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(device = "id:pixel_4")
    public static final void TransferScreenPreview() {
    }
}