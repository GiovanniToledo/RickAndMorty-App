package com.gysstudio.basecleanarchexample.presentation

import android.app.Application
import android.util.Log

class BaseApp : Application() {

    val TAG: String = BaseApp::class.java.simpleName
    override fun onCreate() {
        super.onCreate()
        Log.v(TAG, "BaseApp: onCreate()")
    }
}