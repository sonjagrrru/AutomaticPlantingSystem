package com.example.smartgarden.fragments.plantInfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0002&\'B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\'\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005\u00a2\u0006\u0002\u0010\u001bJ&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0005H\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/example/smartgarden/fragments/plantInfo/PlantInfo;", "Landroidx/fragment/app/Fragment;", "()V", "PERMISSIONS", "", "", "getPERMISSIONS", "()[Ljava/lang/String;", "[Ljava/lang/String;", "PERMISSION_ALL", "", "getPERMISSION_ALL", "()I", "generalViewModel", "Lcom/example/smartgarden/data/general/GeneralViewModel;", "myPlant", "Lcom/example/smartgarden/data/plant/Plant;", "plantId", "plantViewModel", "Lcom/example/smartgarden/data/plant/PlantViewModel;", "disconnect", "", "hasPermissions", "", "context", "Landroid/content/Context;", "permissions", "(Landroid/content/Context;[Ljava/lang/String;)Z", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "sendCommand", "input", "Companion", "ConnectToDevice", "app_debug"})
public final class PlantInfo extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.smartgarden.fragments.plantInfo.PlantInfo.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static java.util.UUID myUUID;
    @org.jetbrains.annotations.Nullable()
    private static android.bluetooth.BluetoothSocket bluetoothSocket;
    public static android.app.ProgressDialog progress;
    public static android.bluetooth.BluetoothAdapter bluetoothAdapter;
    private static boolean isConnected = false;
    public static java.lang.String address;
    private final int PERMISSION_ALL = 1;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] PERMISSIONS = {"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"};
    private com.example.smartgarden.data.general.GeneralViewModel generalViewModel;
    private com.example.smartgarden.data.plant.PlantViewModel plantViewModel;
    private int plantId = 0;
    private com.example.smartgarden.data.plant.Plant myPlant;
    private java.util.HashMap _$_findViewCache;
    
    public PlantInfo() {
        super();
    }
    
    public final int getPERMISSION_ALL() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getPERMISSIONS() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"DEPRECATION"})
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void sendCommand(java.lang.String input) {
    }
    
    public final boolean hasPermissions(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String... permissions) {
        return false;
    }
    
    private final void disconnect() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @kotlin.Suppress(names = {"DEPRECATION"})
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\n\u001a\u00020\u00032\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0011\u001a\u00020\u000fH\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/smartgarden/fragments/plantInfo/PlantInfo$ConnectToDevice;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "c", "Landroid/content/Context;", "(Landroid/content/Context;)V", "connectSuccess", "", "context", "doInBackground", "p0", "", "([Ljava/lang/Void;)Ljava/lang/String;", "onPostExecute", "", "result", "onPreExecute", "app_debug"})
    static final class ConnectToDevice extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.String> {
        private boolean connectSuccess = true;
        private android.content.Context context;
        
        public ConnectToDevice(@org.jetbrains.annotations.NotNull()
        android.content.Context c) {
            super();
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.lang.String result) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.String doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... p0) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPreExecute() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u0006&"}, d2 = {"Lcom/example/smartgarden/fragments/plantInfo/PlantInfo$Companion;", "", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "getBluetoothAdapter", "()Landroid/bluetooth/BluetoothAdapter;", "setBluetoothAdapter", "(Landroid/bluetooth/BluetoothAdapter;)V", "bluetoothSocket", "Landroid/bluetooth/BluetoothSocket;", "getBluetoothSocket", "()Landroid/bluetooth/BluetoothSocket;", "setBluetoothSocket", "(Landroid/bluetooth/BluetoothSocket;)V", "isConnected", "", "()Z", "setConnected", "(Z)V", "myUUID", "Ljava/util/UUID;", "getMyUUID", "()Ljava/util/UUID;", "setMyUUID", "(Ljava/util/UUID;)V", "progress", "Landroid/app/ProgressDialog;", "getProgress", "()Landroid/app/ProgressDialog;", "setProgress", "(Landroid/app/ProgressDialog;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.UUID getMyUUID() {
            return null;
        }
        
        public final void setMyUUID(@org.jetbrains.annotations.NotNull()
        java.util.UUID p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.bluetooth.BluetoothSocket getBluetoothSocket() {
            return null;
        }
        
        public final void setBluetoothSocket(@org.jetbrains.annotations.Nullable()
        android.bluetooth.BluetoothSocket p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.ProgressDialog getProgress() {
            return null;
        }
        
        public final void setProgress(@org.jetbrains.annotations.NotNull()
        android.app.ProgressDialog p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.bluetooth.BluetoothAdapter getBluetoothAdapter() {
            return null;
        }
        
        public final void setBluetoothAdapter(@org.jetbrains.annotations.NotNull()
        android.bluetooth.BluetoothAdapter p0) {
        }
        
        public final boolean isConnected() {
            return false;
        }
        
        public final void setConnected(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAddress() {
            return null;
        }
        
        public final void setAddress(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
}