package com.example.smartgarden.data

import androidx.lifecycle.LiveData

class UserRepository(private val userDAO:UserDAO) {
    val readAllData:LiveData<List<User>> = userDAO.readAllData()

    suspend  fun addUser(user:User){ //mora suspend jer je u dao suspend
        userDAO.addUser(user)
    }
}