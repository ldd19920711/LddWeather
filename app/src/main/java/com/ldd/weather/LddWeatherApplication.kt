package com.ldd.weather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class LddWeatherApplication : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        const val TOKEN = "UYpVt5WKwizCLu5L"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}