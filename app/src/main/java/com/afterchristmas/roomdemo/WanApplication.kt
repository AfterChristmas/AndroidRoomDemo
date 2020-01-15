package com.afterchristmas.roomdemo

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * @description
 */
class WanApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = applicationContext
    }

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var instance: Context
    }
}