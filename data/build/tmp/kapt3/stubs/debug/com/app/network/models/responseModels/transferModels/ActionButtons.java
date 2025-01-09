package com.app.network.models.responseModels.transferModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\u008b\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010-\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u000200H\u00d6\u0001J\t\u00101\u001a\u000202H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012\u00a8\u00063"}, d2 = {"Lcom/app/network/models/responseModels/transferModels/ActionButtons;", "", "adocButton", "", "approveButton", "closeButton", "deleteButton", "editButton", "excelButton", "multiplePdfButton", "repeatButton", "saveAsTemplateButton", "sendBankButton", "signButton", "singlePdfButton", "swiftButton", "(ZZZZZZZZZZZZZ)V", "getAdocButton", "()Z", "getApproveButton", "getCloseButton", "getDeleteButton", "getEditButton", "getExcelButton", "getMultiplePdfButton", "getRepeatButton", "getSaveAsTemplateButton", "getSendBankButton", "getSignButton", "getSinglePdfButton", "getSwiftButton", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "data_debug"})
public final class ActionButtons {
    private final boolean adocButton = false;
    private final boolean approveButton = false;
    private final boolean closeButton = false;
    private final boolean deleteButton = false;
    private final boolean editButton = false;
    private final boolean excelButton = false;
    private final boolean multiplePdfButton = false;
    private final boolean repeatButton = false;
    private final boolean saveAsTemplateButton = false;
    private final boolean sendBankButton = false;
    private final boolean signButton = false;
    private final boolean singlePdfButton = false;
    private final boolean swiftButton = false;
    
    @org.jetbrains.annotations.NotNull
    public final com.app.network.models.responseModels.transferModels.ActionButtons copy(boolean adocButton, boolean approveButton, boolean closeButton, boolean deleteButton, boolean editButton, boolean excelButton, boolean multiplePdfButton, boolean repeatButton, boolean saveAsTemplateButton, boolean sendBankButton, boolean signButton, boolean singlePdfButton, boolean swiftButton) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public ActionButtons(boolean adocButton, boolean approveButton, boolean closeButton, boolean deleteButton, boolean editButton, boolean excelButton, boolean multiplePdfButton, boolean repeatButton, boolean saveAsTemplateButton, boolean sendBankButton, boolean signButton, boolean singlePdfButton, boolean swiftButton) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getAdocButton() {
        return false;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getApproveButton() {
        return false;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getCloseButton() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getDeleteButton() {
        return false;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getEditButton() {
        return false;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean getExcelButton() {
        return false;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getMultiplePdfButton() {
        return false;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean getRepeatButton() {
        return false;
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean getSaveAsTemplateButton() {
        return false;
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final boolean getSendBankButton() {
        return false;
    }
    
    public final boolean component11() {
        return false;
    }
    
    public final boolean getSignButton() {
        return false;
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean getSinglePdfButton() {
        return false;
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final boolean getSwiftButton() {
        return false;
    }
}