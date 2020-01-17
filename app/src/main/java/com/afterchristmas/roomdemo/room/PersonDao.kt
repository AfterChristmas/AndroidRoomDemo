package com.afterchristmas.roomdemo.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * @Description:
 * @Date: 2020/1/15 10:39
 * @Auther: afterchristmas
 */
@Dao
interface PersonDao {
    @Query("Select * from person")
    fun getAll():List<Person>;

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(person: Person)
}