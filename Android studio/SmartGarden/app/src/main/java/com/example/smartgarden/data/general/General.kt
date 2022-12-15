package com.example.smartgarden.data.general

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "general")
data class General (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val plantID:Int,
    val userMail: String
)