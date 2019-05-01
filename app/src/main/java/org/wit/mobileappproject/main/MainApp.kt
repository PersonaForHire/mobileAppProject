package org.wit.mobileappproject.main

import android.app.Application
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.wit.mobileappproject.models.HunterModel

class MainApp : Application(), AnkoLogger {

    val placemarks = ArrayList<HunterModel>()#

    override fun onCreate() {
        super.onCreate()
        info("Placemark started")
    }
}