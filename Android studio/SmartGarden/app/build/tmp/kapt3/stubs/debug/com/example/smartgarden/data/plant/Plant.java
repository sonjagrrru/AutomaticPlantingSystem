package com.example.smartgarden.data.plant;

import java.lang.System;

@androidx.room.Entity(tableName = "plants")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\'\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\u0081\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001J\t\u00100\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014\u00a8\u00061"}, d2 = {"Lcom/example/smartgarden/data/plant/Plant;", "", "id", "", "name", "", "caption", "age", "optimalMinTemperature", "optimalMaxTemperature", "optimalSoilMoisture", "optimalBrightness", "startFlowering", "endFlowering", "imgName", "miniCaption", "(ILjava/lang/String;Ljava/lang/String;IIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAge", "()I", "getCaption", "()Ljava/lang/String;", "getEndFlowering", "getId", "getImgName", "getMiniCaption", "getName", "getOptimalBrightness", "getOptimalMaxTemperature", "getOptimalMinTemperature", "getOptimalSoilMoisture", "getStartFlowering", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Plant {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String caption = null;
    private final int age = 0;
    private final int optimalMinTemperature = 0;
    private final int optimalMaxTemperature = 0;
    private final int optimalSoilMoisture = 0;
    private final int optimalBrightness = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String startFlowering = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String endFlowering = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String imgName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String miniCaption = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.smartgarden.data.plant.Plant copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String caption, int age, int optimalMinTemperature, int optimalMaxTemperature, int optimalSoilMoisture, int optimalBrightness, @org.jetbrains.annotations.NotNull()
    java.lang.String startFlowering, @org.jetbrains.annotations.NotNull()
    java.lang.String endFlowering, @org.jetbrains.annotations.NotNull()
    java.lang.String imgName, @org.jetbrains.annotations.NotNull()
    java.lang.String miniCaption) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Plant(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String caption, int age, int optimalMinTemperature, int optimalMaxTemperature, int optimalSoilMoisture, int optimalBrightness, @org.jetbrains.annotations.NotNull()
    java.lang.String startFlowering, @org.jetbrains.annotations.NotNull()
    java.lang.String endFlowering, @org.jetbrains.annotations.NotNull()
    java.lang.String imgName, @org.jetbrains.annotations.NotNull()
    java.lang.String miniCaption) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCaption() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getAge() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getOptimalMinTemperature() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getOptimalMaxTemperature() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getOptimalSoilMoisture() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getOptimalBrightness() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStartFlowering() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEndFlowering() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImgName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMiniCaption() {
        return null;
    }
}