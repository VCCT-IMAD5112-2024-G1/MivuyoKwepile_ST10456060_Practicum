package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val backButton = findViewById<Button>(R.id.backButton)

        backButton.setOnClickListener {
            // Define the destination activity

            val intent = Intent(this@MainActivity3, MainActivity2::class.java)
            // Start the next activity
            startActivity(intent)
        }
        val daysOfWeek = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday")
        val maxtemp = arrayOf(23, 21, 17, 18, 17, 18, 18)
        val mintemp = arrayOf(15, 13, 8, 8, 9, 11, 11)
        val weatherCondition = arrayOf("Partly Cloudy", "Partly Cloudy", "Scattered " +
                "Showers", "Partly Cloudy", "Sunny", "Sunny","Mostly Sunny")

        val tableStringBuilder = StringBuilder()
        tableStringBuilder.append("| Day        | Max Temp (C) | Min Temp (C) | Weather Condition |\n")
        tableStringBuilder.append("|------------|--------------|--------------|-------------------|\n")

        for (i in daysOfWeek.indices) {
            tableStringBuilder.append("| ${daysOfWeek[i].padEnd(10)} | ${maxtemp[i].toString()
                .padEnd(13)} | ${mintemp[i].toString().padEnd(13)} | ${weatherCondition[i].padEnd(17)} |\n")
        }
        val tableTextView = findViewById<TextView>(R.id.tableTextView)
        tableTextView.text = tableStringBuilder.toString()
    }
    }
