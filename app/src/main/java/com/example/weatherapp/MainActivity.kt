package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getStartedButton = findViewById<Button>(R.id.getStartedButton)

        getStartedButton.setOnClickListener {
            // Define the destination activity

            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            // Start the next activity
            startActivity(intent)
        }

        val exitButton: Button = findViewById(R.id.exitButton)
        exitButton.setOnClickListener {
            finish()
        }
        exitButton.setOnClickListener {
            finishAffinity() // Use this to close all activities in the task
        }
    }
}