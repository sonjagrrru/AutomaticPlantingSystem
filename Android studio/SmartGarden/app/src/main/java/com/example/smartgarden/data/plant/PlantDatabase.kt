package com.example.smartgarden.data.plant

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Plant::class], version = 1, exportSchema = false) //za cuvanje varzija je export schema
abstract class PlantDatabase:RoomDatabase() {
    abstract fun plantDAO(): PlantDAO

    companion object{
        @Volatile
        private var INSTANCE: PlantDatabase? =null

        fun getDatabase(context:Context):PlantDatabase{
            val tmp = INSTANCE
            if(tmp != null)
                return tmp

            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PlantDatabase::class.java,
                    "plants"
                ).createFromAsset("database/plants.db").build()
                INSTANCE = instance
                return  instance
            }
        }
    }
}