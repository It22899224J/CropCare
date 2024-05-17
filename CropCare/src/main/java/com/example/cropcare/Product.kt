package com.example.cropcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.cropcare.databinding.ActivityProductBinding


class Product : AppCompatActivity() {

    private lateinit var binding : ActivityProductBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val product_name = intent.getStringExtra("product")



        binding.name.text = "\t"+product_name

        binding.closeBtn.setOnClickListener {

            val intent = Intent(this,Home::class.java)
            startActivity(intent)
            finish()
        }
        binding.schedule.setOnClickListener {

            val intent = Intent(this,Schedule::class.java)
            startActivity(intent)
            finish()
        }

    }
    fun profileClick(view: View){

        val intent = Intent(this, Profile::class.java)
        startActivity(intent)
        finish()


    }
    fun btnClick(view: View) {

        val intent = Intent(this,Home::class.java)
        startActivity(intent)
        finish()
    }
}