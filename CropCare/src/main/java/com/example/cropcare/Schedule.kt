package com.example.cropcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Schedule : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)

    }

    fun profileClick(view: View){

        val intent = Intent(this,Profile::class.java)
        startActivity(intent)
        finish()
    }

    fun btnClick(view: View) {

        val intent = Intent(this,Home::class.java)
        startActivity(intent)
        finish()
    }
}