package com.xlarry.didongweather

import android.app.Application
import android.content.Context

class DiDongWeatherApplication : Application() {
    companion object{
        lateinit var context: Context    //类似静态的方式
        const val TOKEN = " "
    }
    override fun onCreate(){
        super.onCreate()
        context = applicationContext  //getApplicationContext(
    }
}