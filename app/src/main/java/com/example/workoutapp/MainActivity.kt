package com.example.workoutapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.Click_button).setOnClickListener {
            Toast.makeText(this, "Is your name ${findViewById<TextView>(R.id.name).text}", Toast.LENGTH_LONG).show()
        }


    }
}