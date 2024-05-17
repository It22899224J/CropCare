package com.example.cropcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Pest_Form : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pest_form)


    }

    fun btnClick(view: View) {

        val intent = Intent(this,Solution_Form::class.java)
        startActivity(intent)
        finish()
    }
    fun nextClick(view: View) {

        val intent = Intent(this,Home::class.java)
        startActivity(intent)
        finish()
    }
}