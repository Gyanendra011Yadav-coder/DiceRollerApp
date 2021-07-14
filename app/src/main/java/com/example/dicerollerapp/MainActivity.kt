package com.example.dicerollerapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //CREATING THIS TO MAKE THE APP, INTERACTIVE
        val rollButton : Button = findViewById(R.id.button)
        rollButton.setOnClickListener {

        }
    }
}