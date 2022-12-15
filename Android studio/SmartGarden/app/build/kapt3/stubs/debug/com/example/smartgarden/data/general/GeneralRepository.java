package com.example.smartgarden.data.general;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0011"}, d2 = {"Lcom/example/smartgarden/data/general/GeneralRepository;", "", "generalDAO", "Lcom/example/smartgarden/data/general/GeneralDAO;", "(Lcom/example/smartgarden/data/general/GeneralDAO;)V", "readGeneral", "Landroidx/lifecycle/LiveData;", "Lcom/example/smartgarden/data/general/General;", "getReadGeneral", "()Landroidx/lifecycle/LiveData;", "updateAddress", "", "address", "", "updatePlant", "idPlant", "", "app_debug"})
public final class GeneralRepository {
    private final com.example.smartgarden.data.general.GeneralDAO generalDAO = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.smartgarden.data.general.General> readGeneral = null;
    
    public GeneralRepository(@org.jetbrains.annotations.NotNull()
    com.example.smartgarden.data.general.GeneralDAO generalDAO) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.smartgarden.data.general.General> getReadGeneral() {
        return null;
    }
    
    public final void updatePlant(int idPlant) {
    }
    
    public final void updateAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
}