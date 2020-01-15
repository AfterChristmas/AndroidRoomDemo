package com.afterchristmas.roomdemo.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @Description:
 * @Date: 2020/1/15 10:31
 * @Auther: wanyan
 */
@Entity
data class Person(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val cache_id: Long = 0,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "type") val type: Int,
    @ColumnInfo(name = "age" ) val age: Int
)