package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val viewDetailsButton = findViewById<Button>(R.id.viewDetailsButton)

        viewDetailsButton.setOnClickListener {
            // Define the destination activity

            val intent = Intent(this@MainActivity2, MainActivity3::class.java)
            // Start the next activity
            startActivity(intent)

            val exit2Button: Button = findViewById(R.id.exit2Button)
            exit2Button.setOnClickListener {
                finish()
            }
            exit2Button.setOnClickListener {
                finishAffinity() // Use this to close all activities in the task
            }

                }
        val daysOfWeek = arrayOf("Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday", "Sunday")
        val maxtemp = arrayOf(23, 21, 17, 18, 17, 18, 18)
        val mintemp = arrayOf(15, 13, 8, 8, 9, 11, 11)

        var sum = 0
        for (temperature in maxtemp) {
            sum += temperature
        }

        val average = sum.toDouble() / maxtemp.size


        val avgTextView = findViewById<TextView>(R.id.avgTextView)
        avgTextView.text = average.toString()

    }
    }


