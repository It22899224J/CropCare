package com.example.cropcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.cropcare.databinding.ActivityLogInBinding


class LogIn : AppCompatActivity() {

    private lateinit var binding: ActivityLogInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)

binding.signUpBtn.setOnClickListener {
        val intent = Intent(this,Home::class.java)
        startActivity(intent)
        finish()
    }
    }
    fun btnClick(view: View) {

        val intent = Intent(this, Home_Empty::class.java)
        startActivity(intent)
        finish()
    }
}