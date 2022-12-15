package com.example.smartgarden.data.plant

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "plants")
data class Plant (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name:String,
    val caption: String,
    val age: Int,
    val optimalMinTemperature: Int,
    val optimalMaxTemperature: Int,
    val optimalSoilMoisture: Int,
    val optimalBrightness: Int,
    val startFlowering: String,
    val endFlowering: String,
    val imgName: String,
    val miniCaption: String
)