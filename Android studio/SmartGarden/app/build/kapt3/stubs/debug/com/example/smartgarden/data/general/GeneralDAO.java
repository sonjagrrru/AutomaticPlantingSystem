package com.example.smartgarden.data.general;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Lcom/example/smartgarden/data/general/GeneralDAO;", "", "readGeneral", "Landroidx/lifecycle/LiveData;", "Lcom/example/smartgarden/data/general/General;", "updateAddress", "", "address", "", "updatePlant", "idPlant", "", "app_debug"})
public abstract interface GeneralDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM general WHERE id=0")
    public abstract androidx.lifecycle.LiveData<com.example.smartgarden.data.general.General> readGeneral();
    
    @androidx.room.Query(value = "UPDATE general SET plantID=:idPlant WHERE id=0")
    public abstract void updatePlant(int idPlant);
    
    @androidx.room.Query(value = "UPDATE general SET userMail=:address WHERE id=0")
    public abstract void updateAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address);
}