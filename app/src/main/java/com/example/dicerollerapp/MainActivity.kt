package com.example.dicerollerapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //CREATING THIS TO MAKE THE APP, INTERACTIVE
        val rollButton : Button = findViewById(R.id.button)
        // We create this so that it can be seen after button click
        rollButton.setOnClickListener {
            val resultTextView: TextView=findViewById(R.id.textView)
            resultTextView.text="6"
         val toast=   Toast.makeText(this,"DICE ROLLED SUCCESSFULLY!",Toast.LENGTH_LONG)
            toast.show()
        }
    }
}