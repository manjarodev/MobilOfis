package com.app.auth.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0003\u001a\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0002H\u0007\u001a\b\u0010\r\u001a\u00020\u0005H\u0003\u001a\u001a\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\b\u0010\u0013\u001a\u00020\u0005H\u0007\u001a$\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0017H\u0007\u001a\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002\u001a&\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eH\u0003\u001a\u0016\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u0002\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082.\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"paswdState", "Landroidx/compose/runtime/MutableState;", "", "usernameState", "BottomSheetItems", "", "iconRes", "", "title", "showBorder", "", "ClickableLinkTextView", "text", "LanguageOptions", "LoginScreen", "navController", "Landroidx/navigation/NavController;", "viewModel", "Lcom/app/network/viewmodel/LoginViewModel;", "LoginScreenPreview", "LoginTabsRow", "selected", "setSelected", "Lkotlin/Function1;", "formatPhoneNumber", "input", "showDialog", "shown", "message", "onClose", "Lkotlin/Function0;", "showMessage", "context", "Landroid/content/Context;", "auth_debug"})
public final class LoginScreenKt {
    private static androidx.compose.runtime.MutableState<java.lang.String> usernameState;
    private static androidx.compose.runtime.MutableState<java.lang.String> paswdState;
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material.ExperimentalMaterialApi.class, androidx.compose.ui.ExperimentalComposeUiApi.class})
    public static final void LoginScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.app.network.viewmodel.LoginViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void showDialog(boolean shown, java.lang.String message, kotlin.jvm.functions.Function0<kotlin.Unit> onClose) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ClickableLinkTextView(@org.jetbrains.annotations.NotNull
    java.lang.String text) {
    }
    
    public static final void showMessage(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void LoginTabsRow(int selected, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> setSelected) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void BottomSheetItems(int iconRes, java.lang.String title, boolean showBorder) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void LanguageOptions() {
    }
    
    private static final java.lang.String formatPhoneNumber(java.lang.String input) {
        return null;
    }
    
    @androidx.compose.runtime.Composable
    public static final void LoginScreenPreview() {
    }
}