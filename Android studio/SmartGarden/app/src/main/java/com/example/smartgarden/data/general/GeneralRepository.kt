package com.example.smartgarden.data.general

import androidx.lifecycle.LiveData

class GeneralRepository(private val generalDAO: GeneralDAO) {
    val readGeneral:LiveData<General> = generalDAO.readGeneral()

    fun updatePlant(idPlant:Int){
        generalDAO.updatePlant(idPlant)
    }

    fun updateAddress(address:String){
        generalDAO.updateAddress(address)
    }

}