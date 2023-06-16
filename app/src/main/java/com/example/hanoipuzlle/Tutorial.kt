package com.example.hanoipuzlle
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class Tutorial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)

        val game = GameLogic()
        game.winCondition(false)
        println(game.canChange(2,2))
        game.changeState(2,2)


    }
}