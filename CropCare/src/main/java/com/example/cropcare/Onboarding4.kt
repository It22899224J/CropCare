package com.example.cropcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Onboarding4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding4)
    }

    fun logClick(view: View){

        val intent = Intent(this, LogIn::class.java)
        startActivity(intent)
        finish()


    }
    fun signClick(view: View){

        val intent = Intent(this, SignUp::class.java)
        startActivity(intent)
        finish()


    }
}