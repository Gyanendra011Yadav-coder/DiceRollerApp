package com.example.dicerollerapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
            //CALLLING THE rollDice method
            rollDice()
         val toast=   Toast.makeText(this,"DICE ROLLED SUCCESSFULLY!",Toast.LENGTH_LONG)
            toast.show()
        }
    }
// CREATING THIS TO CALL THE DICE METHOD AND PASS THE SIDES
    private fun rollDice (){
    //calling the Dice method
        val dice =Dice(6)
    //CALLLING THE roll method to, TO ROLL THE DICE
        val roll=dice.roll()
        val resultTextView: TextView=findViewById(R.id.textView)
        resultTextView.text=roll.toString()
    //THIS, WILL ADD THE IMAGE
        val diceImage: ImageView =findViewById(R.id.imageView)
  //we are checking,
    when(roll){
        1->diceImage.setImageResource(R.drawable.dice_1)
        2->diceImage.setImageResource(R.drawable.dice_2)
        3->diceImage.setImageResource(R.drawable.dice_3)
        4->diceImage.setImageResource(R.drawable.dice_4)
        5->diceImage.setImageResource(R.drawable.dice_5)
        else->diceImage.setImageResource(R.drawable.dice_6)
    }

    }

    /*THIS IS THE METHOD THAT WILL ROLL THE DICE*/
    class Dice(val Sides: Int){
        fun roll():Int{
            return (1..Sides).random()
        }
    }
}