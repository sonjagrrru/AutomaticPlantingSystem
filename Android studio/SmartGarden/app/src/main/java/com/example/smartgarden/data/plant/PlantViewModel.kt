package com.example.smartgarden.data.plant

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class PlantViewModel(application: Application): AndroidViewModel(application) {
    val readAllData: LiveData<List<Plant>>
    private val repository: PlantRepository

    init {
        val plantDao = PlantDatabase.getDatabase(application).plantDAO()
        repository = PlantRepository(plantDao)
        readAllData = repository.readAllData
    }

    fun findById(myID:Int) : LiveData<Plant>{
        return repository.findById(myID)
    }
}