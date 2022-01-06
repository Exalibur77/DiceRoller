package com.example.diceroller

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton : Button = findViewById(R.id.roll_button)

//        rollButton.text = "Let's Roll"

        rollButton.setOnClickListener(){
//            Toast.makeText(this, "Button Clicked .. !", Toast.LENGTH_SHORT).show()
                rollDice()

        }

        diceImage = findViewById(R.id.dice_image)
    }

    @SuppressLint("SetTextI18n")
    private fun rollDice() {
//        val resultText : TextView = findViewById(R.id.result_text)



        val randomInt= Random.nextInt(7)

        val drawableResource = when(randomInt){

            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        // this operation is done globally instead of calling it multiple times in our local variable rollDice
//        val diceImage : ImageView = findViewById(R.id.dice_image)

        diceImage.setImageResource(drawableResource)



//        resultText.text = randomInt.toString()
    }
}