package com.example.smartgarden.data.general

import android.app.Application
import android.location.Address
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class GeneralViewModel(application: Application): AndroidViewModel(application) {
    val readGeneral: LiveData<General>
    private val repository: GeneralRepository

    init {
        val plantDao = GeneralDatabase.getDatabase(application).generalDAO()
        repository = GeneralRepository(plantDao)
        readGeneral = repository.readGeneral
    }

    fun updatePlant(idPlant:Int){
        repository.updatePlant(idPlant)
    }

    fun updateAddress(address:String){
        repository.updateAddress(address)
    }
}