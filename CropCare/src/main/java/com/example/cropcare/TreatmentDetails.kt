package com.example.cropcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.cropcare.databinding.ActivityTreatmentDetailsBinding


class TreatmentDetails : AppCompatActivity() {

   private lateinit var binding : ActivityTreatmentDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTreatmentDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val name = intent.getStringExtra("name")
        val pname = intent.getStringExtra("pest")
        val status = intent.getStringExtra("status")
        val date = intent.getStringExtra("i_time")
        val level = intent.getStringExtra("level")
        val product = intent.getStringExtra("product")
        val descp = intent.getStringExtra("description")

        binding.fieldName.text = name
        binding.pest.text = pname
        binding.date.text = date
        binding.level.text = level
        binding.treatment.text = product
        binding.descp.text = descp

        binding.productBtn.setOnClickListener {

            val intent = Intent(this, Product::class.java)

            intent.putExtra("product",product)
            startActivity(intent)
            finish()
        }

        binding.closeBtn.setOnClickListener {

            val intent = Intent(this,Home::class.java)
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