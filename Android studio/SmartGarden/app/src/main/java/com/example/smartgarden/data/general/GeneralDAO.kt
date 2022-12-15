package com.example.smartgarden.data.general

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Update
import com.example.smartgarden.data.User


@Dao
interface GeneralDAO {

    @Query(value = "SELECT * FROM general WHERE id=0")
    fun readGeneral(): LiveData<General>

    @Query(value= "UPDATE general SET plantID=:idPlant WHERE id=0")
    fun updatePlant(idPlant:Int)

    @Query(value= "UPDATE general SET userMail=:address WHERE id=0")
    fun updateAddress(address:String)
}
