package com.afterchristmas.roomdemo.room

import android.util.Log
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.afterchristmas.roomdemo.WanApplication

/**
 * @Description:
 * @Date: 2020/1/15 14:53
 * @Auther: afterchristmas
 */
object DBInstance {
    private const val DB_NAME = "afterchristmas.db"
    private val instance: DataBase by lazy {
        Room.databaseBuilder(WanApplication.instance, DataBase::class.java, DB_NAME)
            .addCallback(object : RoomDatabase.Callback() {
                override fun onCreate(db: SupportSQLiteDatabase) {
                    super.onCreate(db)
                    Log.e("db", "create")

                }

                override fun onOpen(db: SupportSQLiteDatabase) {
                    super.onOpen(db)
                    Log.e("db", "open")
                }
            })
            .allowMainThreadQueries()
            .addMigrations(DataBase.MIGRATION_1_2)
            .build()
    }
    val personDao = instance.getPersonDao();
}