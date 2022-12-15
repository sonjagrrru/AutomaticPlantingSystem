package com.example.smartgarden.fragments.bluetooth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\'\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\n\"\u00020\u0004\u00a2\u0006\u0002\u0010$J\"\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010*H\u0017J&\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0017J\b\u00103\u001a\u00020&H\u0003R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u000fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u00064"}, d2 = {"Lcom/example/smartgarden/fragments/bluetooth/BluetoothFragment;", "Landroidx/fragment/app/Fragment;", "()V", "EXTRA_ADDRESS", "", "getEXTRA_ADDRESS", "()Ljava/lang/String;", "setEXTRA_ADDRESS", "(Ljava/lang/String;)V", "PERMISSIONS", "", "getPERMISSIONS", "()[Ljava/lang/String;", "[Ljava/lang/String;", "PERMISSION_ALL", "", "getPERMISSION_ALL", "()I", "REQUEST_ENABLE_BLUETOOTH", "getREQUEST_ENABLE_BLUETOOTH", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "generalViewModel", "Lcom/example/smartgarden/data/general/GeneralViewModel;", "pairedDevices", "", "Landroid/bluetooth/BluetoothDevice;", "getPairedDevices", "()Ljava/util/Set;", "setPairedDevices", "(Ljava/util/Set;)V", "hasPermissions", "", "context", "Landroid/content/Context;", "permissions", "(Landroid/content/Context;[Ljava/lang/String;)Z", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "pairedDeviceList", "app_debug"})
public final class BluetoothFragment extends androidx.fragment.app.Fragment {
    private android.bluetooth.BluetoothAdapter bluetoothAdapter;
    public java.util.Set<android.bluetooth.BluetoothDevice> pairedDevices;
    private final int REQUEST_ENABLE_BLUETOOTH = 1;
    public java.lang.String EXTRA_ADDRESS;
    private final int PERMISSION_ALL = 1;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] PERMISSIONS = {"android.permission.BLUETOOTH_CONNECT"};
    private com.example.smartgarden.data.general.GeneralViewModel generalViewModel;
    private java.util.HashMap _$_findViewCache;
    
    public BluetoothFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<android.bluetooth.BluetoothDevice> getPairedDevices() {
        return null;
    }
    
    public final void setPairedDevices(@org.jetbrains.annotations.NotNull()
    java.util.Set<android.bluetooth.BluetoothDevice> p0) {
    }
    
    public final int getREQUEST_ENABLE_BLUETOOTH() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEXTRA_ADDRESS() {
        return null;
    }
    
    public final void setEXTRA_ADDRESS(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPERMISSION_ALL() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getPERMISSIONS() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @kotlin.Suppress(names = {"DEPRECATION"})
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final boolean hasPermissions(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String... permissions) {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void pairedDeviceList() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @kotlin.Suppress(names = {"DEPRECATION"})
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
}