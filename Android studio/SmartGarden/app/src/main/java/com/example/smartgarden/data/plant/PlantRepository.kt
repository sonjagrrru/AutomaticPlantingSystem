package com.example.smartgarden.data.plant

import androidx.lifecycle.LiveData

class PlantRepository(private val plantDAO:PlantDAO) {
    val readAllData:LiveData<List<Plant>> = plantDAO.readAllData()

    fun findById(myID: Int):LiveData<Plant>{
        return plantDAO.findById(myID)
    }

}