package com.example.cropcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Onboarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding2)
    }

    fun nextClick(view: View){

        val intent = Intent(this, Onboarding3::class.java)
        startActivity(intent)
        finish()


    }
}