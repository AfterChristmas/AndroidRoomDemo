package com.afterchristmas.roomdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.afterchristmas.roomdemo.room.DBInstance
import com.afterchristmas.roomdemo.room.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt_click.setOnClickListener {
            val person = Person(100L, "ceshi", 200,20)
            DBInstance.personDao.insert(person)
        }
        bt_get.setOnClickListener {
            val person = DBInstance.personDao.getAll().get(0)
            Log.e("size==", person.title)
        }
    }
}
