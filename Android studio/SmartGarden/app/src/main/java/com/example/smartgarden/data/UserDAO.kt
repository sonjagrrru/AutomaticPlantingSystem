package com.example.smartgarden.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(user:User)

    @Query(value = "SELECT * FROM user_data ORDER BY id ASC")
    fun readAllData(): LiveData<List<User>>
}