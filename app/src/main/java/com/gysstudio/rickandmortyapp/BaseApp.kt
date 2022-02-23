package com.gysstudio.rickandmortyapp

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseApp : Application() {

    val TAG: String = BaseApp::class.java.simpleName
    override fun onCreate() {
        super.onCreate()
        Log.v(TAG, "BaseApp: onCreate()")
    }
}