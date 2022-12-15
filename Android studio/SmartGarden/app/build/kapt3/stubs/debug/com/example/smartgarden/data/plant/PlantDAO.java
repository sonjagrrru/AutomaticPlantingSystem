package com.example.smartgarden.data.plant;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0003H\'\u00a8\u0006\t"}, d2 = {"Lcom/example/smartgarden/data/plant/PlantDAO;", "", "findById", "Landroidx/lifecycle/LiveData;", "Lcom/example/smartgarden/data/plant/Plant;", "myID", "", "readAllData", "", "app_debug"})
public abstract interface PlantDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM plants ORDER BY id ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.smartgarden.data.plant.Plant>> readAllData();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM plants WHERE id=:myID")
    public abstract androidx.lifecycle.LiveData<com.example.smartgarden.data.plant.Plant> findById(int myID);
}