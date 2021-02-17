package com.example.bmiactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btmEnter)

        btn.setOnClickListener{

            val intent = Intent(this,BMIActivity::class.java)

            val personName = findViewById<TextView>(R.id.tfName).text

            intent.putExtra("personName",personName.toString())

            startActivity(intent)



        }


    }
}