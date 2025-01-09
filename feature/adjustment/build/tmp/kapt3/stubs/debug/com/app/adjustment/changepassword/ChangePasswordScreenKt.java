package com.app.adjustment.changepassword;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\b\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u001a\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"securityToChangePassword", "", "ChangePasswordScreenPreview", "", "ForgetPasswordScreen", "navController", "Landroidx/navigation/NavController;", "viewModel", "Lcom/app/network/viewmodel/AdjustmentViewModel;", "isPasswordValid", "", "password", "adjustment_debug"})
public final class ChangePasswordScreenKt {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String securityToChangePassword = "securityToChangePassword";
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.ui.ExperimentalComposeUiApi.class})
    public static final void ForgetPasswordScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.app.network.viewmodel.AdjustmentViewModel viewModel) {
    }
    
    private static final boolean isPasswordValid(java.lang.String password) {
        return false;
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(device = "id:pixel_4")
    public static final void ChangePasswordScreenPreview() {
    }
}