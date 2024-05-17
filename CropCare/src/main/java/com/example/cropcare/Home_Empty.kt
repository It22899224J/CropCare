package com.example.cropcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home_Empty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_empty)

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
    }

    fun btnStart(view: View){

        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun btnClick(view: View) {

        val intent = Intent(this,Onboarding4::class.java)
        startActivity(intent)
        finish()
    }
}