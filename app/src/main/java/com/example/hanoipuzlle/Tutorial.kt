package com.example.hanoipuzlle
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Tutorial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)

        val game = GameLogic()
        var chosed = false
        var segment = -1

        //Akcje przypisane do lewego przycisku
        val btnL: Button = findViewById(R.id.btn_L)
        val btnM: Button = findViewById(R.id.btn_M)
        val btnR: Button = findViewById(R.id.btn_R)
        btnL.setOnClickListener {
            if(!chosed) {
                segment = game.getState(0)
                if(segment == -1)
                {
                    println("No segments")
                }
                else {
                    btnL.setBackgroundColor(Color.GREEN)
                    chosed = true
                    println("State: " + chosed + "tower: 0, highest segment is:" + segment)
                }
            }
            else {
                btnL.setBackgroundColor(Color.RED)
                btnM.setBackgroundColor(Color.RED)
                btnR.setBackgroundColor(Color.RED)
                chosed = false
                println("State: "+chosed)
            }
        }

        //akcje przypisane do środkowego przycisku
        btnM.setOnClickListener {
            if(!chosed) {
                btnM.setBackgroundColor(Color.GREEN)
                chosed = true
                println("State: "+chosed)
            }
            else {
                btnL.setBackgroundColor(Color.RED)
                btnM.setBackgroundColor(Color.RED)
                btnR.setBackgroundColor(Color.RED)
                chosed = false
                println("State: "+chosed)
            }
        }

        //akcje przypisane do prawego przycisku
        btnR.setOnClickListener {
            if(!chosed) {
                btnR.setBackgroundColor(Color.GREEN)
                chosed = true
                println("State: "+chosed)
            }
            else {
                btnL.setBackgroundColor(Color.RED)
                btnM.setBackgroundColor(Color.RED)
                btnR.setBackgroundColor(Color.RED)
                chosed = false
                println("State: "+chosed)
            }
        }
    }
}