package com.app.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B\u001f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f\u0082\u0001\u0003\u0015\u0016\u0017\u00a8\u0006\u0018"}, d2 = {"Lcom/app/home/BottomNavItem;", "", "title", "", "icon", "", "screen_route", "(Ljava/lang/String;ILjava/lang/String;)V", "getIcon", "()I", "setIcon", "(I)V", "getScreen_route", "()Ljava/lang/String;", "setScreen_route", "(Ljava/lang/String;)V", "getTitle", "setTitle", "Adjustments", "Main", "Transfers", "Lcom/app/home/BottomNavItem$Adjustments;", "Lcom/app/home/BottomNavItem$Main;", "Lcom/app/home/BottomNavItem$Transfers;", "home_debug"})
public abstract class BottomNavItem {
    @org.jetbrains.annotations.NotNull
    private java.lang.String title;
    private int icon;
    @org.jetbrains.annotations.NotNull
    private java.lang.String screen_route;
    
    private BottomNavItem(java.lang.String title, int icon, java.lang.String screen_route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getIcon() {
        return 0;
    }
    
    public final void setIcon(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getScreen_route() {
        return null;
    }
    
    public final void setScreen_route(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/app/home/BottomNavItem$Main;", "Lcom/app/home/BottomNavItem;", "()V", "home_debug"})
    public static final class Main extends com.app.home.BottomNavItem {
        @org.jetbrains.annotations.NotNull
        public static final com.app.home.BottomNavItem.Main INSTANCE = null;
        
        private Main() {
            super(null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/app/home/BottomNavItem$Transfers;", "Lcom/app/home/BottomNavItem;", "()V", "home_debug"})
    public static final class Transfers extends com.app.home.BottomNavItem {
        @org.jetbrains.annotations.NotNull
        public static final com.app.home.BottomNavItem.Transfers INSTANCE = null;
        
        private Transfers() {
            super(null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/app/home/BottomNavItem$Adjustments;", "Lcom/app/home/BottomNavItem;", "()V", "home_debug"})
    public static final class Adjustments extends com.app.home.BottomNavItem {
        @org.jetbrains.annotations.NotNull
        public static final com.app.home.BottomNavItem.Adjustments INSTANCE = null;
        
        private Adjustments() {
            super(null, 0, null);
        }
    }
}