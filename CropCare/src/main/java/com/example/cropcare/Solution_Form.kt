package com.example.cropcare

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.cropcare.databinding.ActivitySolutionFormBinding


class Solution_Form : AppCompatActivity() {

    private  lateinit var binding: ActivitySolutionFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySolutionFormBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.cancel.setOnClickListener {

            val intent = Intent(this,Home::class.java)
            startActivity(intent)
            finish()
        }


        val spinner = binding.editColor

        val items = arrayOf("0", "4", "6","8")


        val adapter = ArrayAdapter(this, R.layout.simple_spinner_item, items)


        adapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adapter


    }
    fun profileClick(view: View){

        val intent = Intent(this, Profile::class.java)
        startActivity(intent)
        finish()


    }
    fun btnClick(view: View) {

        val intent = Intent(this,Pest_Form::class.java)
        startActivity(intent)
        finish()
    }
}