package com.afterchristmas.roomdemo.room

import android.util.Log
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase


/**
 * @Description:
 * @Date: 2020/1/15 10:43
 * @Auther: wanyan
 */
@Database(entities = [Person::class], version = 2, exportSchema = false)
abstract class DataBase : RoomDatabase() {
    abstract fun getPersonDao(): PersonDao
    //数据库变动添加Migration，简白的而说就是版本1到版本2改了什么东西

    companion object{
        val MIGRATION_1_2: Migration = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                Log.e("size==", "update--------------------")
                //告诉person表，增添一个String类型的字段 son
                database.execSQL("ALTER TABLE Person ADD age INTEGER NOT NULL DEFAULT 0")

            }
        }
    }

}