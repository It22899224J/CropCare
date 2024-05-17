package com.example.cropcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Onboarding1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding1)
    }

    fun nextClick(view: View){

        val intent = Intent(this, Onboarding2::class.java)
        startActivity(intent)
        finish()


    }
    fun skipClick(view: View){

        val intent = Intent(this, Onboarding4::class.java)
        startActivity(intent)
        finish()


    }
}