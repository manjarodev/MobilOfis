package com.app.home.main.subviews;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\b\u0010\u0010\u001a\u00020\u000bH\u0007\u001a$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u0014H\u0003\u001a$\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0014H\u0003\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"filterByStatus", "Landroidx/compose/runtime/MutableState;", "", "selectedNewCard", "Lcom/app/network/models/responseModels/MainCardX;", "getSelectedNewCard", "()Landroidx/compose/runtime/MutableState;", "selectedOldCard", "Lcom/app/network/models/responseModels/MainCard;", "getSelectedOldCard", "CardsList", "", "navController", "Landroidx/navigation/NavController;", "viewModel", "Lcom/app/network/viewmodel/HomeViewModel;", "CardsPreview", "NewCardsListItem", "obj", "onCardClick", "Lkotlin/Function1;", "OldCardsListItem", "home_debug"})
public final class CardsKt {
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.runtime.MutableState<com.app.network.models.responseModels.MainCard> selectedOldCard = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.runtime.MutableState<com.app.network.models.responseModels.MainCardX> selectedNewCard = null;
    private static final androidx.compose.runtime.MutableState<java.lang.String> filterByStatus = null;
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<com.app.network.models.responseModels.MainCard> getSelectedOldCard() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.MutableState<com.app.network.models.responseModels.MainCardX> getSelectedNewCard() {
        return null;
    }
    
    @androidx.compose.runtime.Composable
    public static final void CardsList(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.app.network.viewmodel.HomeViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void OldCardsListItem(com.app.network.models.responseModels.MainCard obj, kotlin.jvm.functions.Function1<? super com.app.network.models.responseModels.MainCard, kotlin.Unit> onCardClick) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void NewCardsListItem(com.app.network.models.responseModels.MainCardX obj, kotlin.jvm.functions.Function1<? super com.app.network.models.responseModels.MainCardX, kotlin.Unit> onCardClick) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(device = "id:pixel_4")
    public static final void CardsPreview() {
    }
}