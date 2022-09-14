    package com.example.ludodice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

    class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Roll : Button = findViewById(R.id.btnRoll);
        Roll.setOnClickListener{
            rollDice();
        }


    }

        private fun rollDice() {
            val imageView: ImageView = findViewById(R.id.ivdice);
            val random = Random().nextInt(6)+ 1;
            if(random==1){
                imageView.setImageResource(R.drawable.one)
            }
            else if(random==2){
                imageView.setImageResource(R.drawable.two)

            }
            else if(random==3){
                imageView.setImageResource(R.drawable.three)

            }
            else if(random==4){
                imageView.setImageResource(R.drawable.four)

            }
            else if(random==5){
                imageView.setImageResource(R.drawable.five)

            } else if(random==6){
                imageView.setImageResource(R.drawable.six)

            }
            else{
                Toast.makeText(this, "Error", Toast.LENGTH_LONG).show()
            }

        }
    }