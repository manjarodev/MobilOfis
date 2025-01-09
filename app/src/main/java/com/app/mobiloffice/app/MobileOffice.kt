package com.app.mobiloffice.app

import android.app.Application
import android.content.Context
import com.app.uikit.utils.Utils
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class MobileOffice : Application() {

    companion object {
        lateinit var context: Context
    }


    override fun onCreate() {
        super.onCreate()

        context = this@MobileOffice

        Utils.loadCurrencyData(this)


    }


}