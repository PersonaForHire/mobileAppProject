package org.wit.mobileappproject.activites

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast
import org.wit.mobileappproject.R
import org.wit.mobileappproject.main.MainApp
import org.wit.mobileappproject.models.HunterModel

class MainActivity : AppCompatActivity(), AnkoLogger {
    var placemark = HunterModel()
    lateinit var app : MainApp
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        app = application as MainApp

        btnAdd.setOnClickListener() {
            placemark.title = placemarkTitle.text.toString()
            placemark.description = description.text.toString()
            if (placemark.title.isNotEmpty()) {
                app.placemarks.add(placemark.copy())
                info("add Button Pressed: $placemarkTitle")
                app.placemarks.forEach { info("add Button Pressed: ${it}")}
                setResult(AppCompatActivity.RESULT_OK)
                finish()
            }
            else {
                toast ("Please Enter a title")
            }
        }
    }
}
