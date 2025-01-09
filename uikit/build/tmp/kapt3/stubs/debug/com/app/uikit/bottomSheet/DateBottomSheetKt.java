package com.app.uikit.bottomSheet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0011\u001a\u00020\u0012H\u0007\u001a*\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u0015H\u0007\u001a\u001c\u0010\u0017\u001a\u00020\u00122\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00120\u0015H\u0003\u001a\u0010\u0010\u001a\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\" \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\" \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\"\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0016\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"currentDate", "", "datePickerEndBottomSheet", "Landroidx/compose/runtime/MutableState;", "", "getDatePickerEndBottomSheet", "()Landroidx/compose/runtime/MutableState;", "setDatePickerEndBottomSheet", "(Landroidx/compose/runtime/MutableState;)V", "datePickerStartBottomSheet", "getDatePickerStartBottomSheet", "setDatePickerStartBottomSheet", "endDate", "", "kotlin.jvm.PlatformType", "formattedCurrentDate", "startDate", "DateBottomSheet", "", "showDateBottomSheet", "onSelectedDate", "Lkotlin/Function1;", "Lcom/app/uikit/bottomSheet/DateModel;", "DateTypeMenu", "selectedDateType", "Lcom/app/uikit/models/DurationDateModel;", "handleDateWithFilter", "Lcom/app/uikit/models/DateType;", "uikit_debug"})
public final class DateBottomSheetKt {
    public static androidx.compose.runtime.MutableState<java.lang.Boolean> datePickerEndBottomSheet;
    public static androidx.compose.runtime.MutableState<java.lang.Boolean> datePickerStartBottomSheet;
    private static final long currentDate = 0L;
    private static final java.lang.String formattedCurrentDate = null;
    private static final androidx.compose.runtime.MutableState<java.lang.String> startDate = null;
    private static final androidx.compose.runtime.MutableState<java.lang.String> endDate = null;
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<java.lang.Boolean> getDatePickerEndBottomSheet() {
        return null;
    }
    
    public static final void setDatePickerEndBottomSheet(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<java.lang.Boolean> getDatePickerStartBottomSheet() {
        return null;
    }
    
    public static final void setDatePickerStartBottomSheet(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.Boolean> p0) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public static final void DateBottomSheet() {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void DateBottomSheet(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.Boolean> showDateBottomSheet, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.app.uikit.bottomSheet.DateModel, kotlin.Unit> onSelectedDate) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void DateTypeMenu(kotlin.jvm.functions.Function1<? super com.app.uikit.models.DurationDateModel, kotlin.Unit> selectedDateType) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.app.uikit.bottomSheet.DateModel handleDateWithFilter(@org.jetbrains.annotations.Nullable
    com.app.uikit.models.DateType selectedDateType) {
        return null;
    }
}