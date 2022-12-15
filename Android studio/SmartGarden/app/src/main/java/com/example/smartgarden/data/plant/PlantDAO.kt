package com.example.smartgarden.data.plant

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.example.smartgarden.data.User


@Dao
interface PlantDAO {

    @Query(value = "SELECT * FROM plants ORDER BY id ASC")
    fun readAllData(): LiveData<List<Plant>>

    @Query(value = "SELECT * FROM plants WHERE id=:myID")
    fun findById(myID:Int): LiveData<Plant>
}
