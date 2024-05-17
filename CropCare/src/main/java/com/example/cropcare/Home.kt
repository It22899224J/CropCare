package com.example.cropcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.cropcare.Data.ListAdapter
import com.example.cropcare.Data.Treatments
import com.example.cropcare.databinding.ActivityHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class Home : AppCompatActivity() {

   private lateinit var binding : ActivityHomeBinding
    private lateinit var treatmentArrayList: ArrayList<Treatments>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        navView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home -> {
                    val intent = Intent(this,Home::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.profile -> {
                    val intent = Intent(this,Profile::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.search -> {
                    val intent = Intent(this,Solution_Form::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                else -> false
            }
        }

        val name = arrayOf(

            "Godagama Field", "Horana Field", "Bope Field"
        )
        val pest = arrayOf(

            "Rice Gall Midge", "Rice Stem Borers", "Rice Hispa"
        )


        val status_l = arrayOf(

            "Active", "Treated", "Pending"
        )
        val level= arrayOf(

            "Normal", "Moderate", "Critical"
        )
        val product = arrayOf(

            "Yuri (Lambdacyhalothrin 4.9%)", "Katsu (Cartap Hydrochloride 4%)", "CIC pestcontrol"
        )
        val i_time = arrayOf(

            "5 days", "10 days", "14 days"
        )

        val description = arrayOf(
            "Common insect pests in paddy fields include rice stem borers, rice leaf folders, rice leafhoppers, and rice weevils.","Insecticides may be applied as foliar sprays or soil treatments to effectively manage insect infestations.",
            "Nematicides are chemicals designed to control nematode populations in paddy fields and prevent damage to rice plants. "
        )


        treatmentArrayList = ArrayList()

        for (i in name.indices){

            val treatment = Treatments(name[i],status_l[i],pest[i],level[i],i_time[i],product[i],description[i])
            treatmentArrayList.add(treatment)
        }

        binding.treatmentlist.isClickable = true
        binding.treatmentlist.adapter = ListAdapter(this,treatmentArrayList)
        binding.treatmentlist.setOnItemClickListener { parent, view, position, id ->

            val name = name[position]
            val pest = pest[position]
            val status = status_l[position]
            val level = level[position]
            val i_time = i_time[position]
            val product = product[position]
            val description = description[position]

            val listIntent = Intent(this,TreatmentDetails::class.java)
            listIntent.putExtra("name",name)
            listIntent.putExtra("pest",pest)
            listIntent.putExtra("status",status)
            listIntent.putExtra("level",level)
            listIntent.putExtra("i_time",i_time)
            listIntent.putExtra("product",product)
            listIntent.putExtra("description",description)
            startActivity(listIntent)
            finish()

        }

        binding.find.setOnClickListener {

            val intent = Intent(this,Solution_Form::class.java)
            startActivity(intent)
            finish()
        }




    }


    fun profileClick(view: View){

        val intent = Intent(this,Profile::class.java)
        startActivity(intent)
        finish()


    }



}