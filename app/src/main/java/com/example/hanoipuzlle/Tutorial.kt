package com.example.hanoipuzlle
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Tutorial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)

        var game = GameLogic()
        game.winCondition(false)
    }
}