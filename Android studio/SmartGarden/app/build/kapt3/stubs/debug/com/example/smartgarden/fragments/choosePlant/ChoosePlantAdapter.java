package com.example.smartgarden.fragments.choosePlant;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tH\u0016J\u0014\u0010\u0018\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/smartgarden/fragments/choosePlant/ChoosePlantAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/smartgarden/fragments/choosePlant/ChoosePlantAdapter$MyViewHolder;", "itemClick", "Lcom/example/smartgarden/interfaces/ItemClick;", "(Lcom/example/smartgarden/interfaces/ItemClick;)V", "generalData", "Lcom/example/smartgarden/data/general/General;", "idPlant", "", "getItemClick", "()Lcom/example/smartgarden/interfaces/ItemClick;", "plantList", "", "Lcom/example/smartgarden/data/plant/Plant;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "plants", "setGeneralData", "general", "MyViewHolder", "app_debug"})
public final class ChoosePlantAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.smartgarden.fragments.choosePlant.ChoosePlantAdapter.MyViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.smartgarden.interfaces.ItemClick itemClick = null;
    private java.util.List<com.example.smartgarden.data.plant.Plant> plantList;
    private com.example.smartgarden.data.general.General generalData;
    private int idPlant = 0;
    
    public ChoosePlantAdapter(@org.jetbrains.annotations.NotNull()
    com.example.smartgarden.interfaces.ItemClick itemClick) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.smartgarden.interfaces.ItemClick getItemClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.smartgarden.fragments.choosePlant.ChoosePlantAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.smartgarden.fragments.choosePlant.ChoosePlantAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.smartgarden.data.plant.Plant> plants) {
    }
    
    public final void setGeneralData(@org.jetbrains.annotations.NotNull()
    com.example.smartgarden.data.general.General general) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/smartgarden/fragments/choosePlant/ChoosePlantAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "itemClick", "Lcom/example/smartgarden/interfaces/ItemClick;", "(Landroid/view/View;Lcom/example/smartgarden/interfaces/ItemClick;)V", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        com.example.smartgarden.interfaces.ItemClick itemClick) {
            super(null);
        }
    }
}