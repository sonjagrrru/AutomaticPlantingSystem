package com.example.smartgarden.data.plant;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/example/smartgarden/data/plant/PlantRepository;", "", "plantDAO", "Lcom/example/smartgarden/data/plant/PlantDAO;", "(Lcom/example/smartgarden/data/plant/PlantDAO;)V", "readAllData", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/smartgarden/data/plant/Plant;", "getReadAllData", "()Landroidx/lifecycle/LiveData;", "findById", "myID", "", "app_debug"})
public final class PlantRepository {
    private final com.example.smartgarden.data.plant.PlantDAO plantDAO = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.smartgarden.data.plant.Plant>> readAllData = null;
    
    public PlantRepository(@org.jetbrains.annotations.NotNull()
    com.example.smartgarden.data.plant.PlantDAO plantDAO) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.smartgarden.data.plant.Plant>> getReadAllData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.smartgarden.data.plant.Plant> findById(int myID) {
        return null;
    }
}