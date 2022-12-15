package com.example.smartgarden.data.general

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [General::class], version = 1, exportSchema = false)
abstract class GeneralDatabase:RoomDatabase() {
    abstract fun generalDAO(): GeneralDAO

    companion object{
        @Volatile
        private var INSTANCE: GeneralDatabase? =null

        fun getDatabase(context:Context):GeneralDatabase{
            val tmp = INSTANCE
            if(tmp != null)
                return tmp

            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    GeneralDatabase::class.java,
                    "general"
                ).createFromAsset("database/general.db").build()
                INSTANCE = instance
                return  instance
            }
        }
    }
}