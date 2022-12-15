package com.example.smartgarden.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1, exportSchema = false) //za cuvanje varzija je export schema
abstract class UserDatabase:RoomDatabase() {
    abstract fun userDAO(): UserDAO

    companion object{
        @Volatile
        private var INSTANCE: UserDatabase? =null

        fun getDatabase(context:Context):UserDatabase{
            val tmp = INSTANCE
            if(tmp != null)
                return tmp

            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase::class.java,
                    "user_database"
                ).build()
                INSTANCE = instance
                return  instance
            }
        }
    }
}