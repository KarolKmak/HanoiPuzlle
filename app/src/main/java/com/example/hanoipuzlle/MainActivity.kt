package com.example.hanoipuzlle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTutorial: Button = findViewById(R.id.btn_tutorial)
        btnTutorial.setOnClickListener {
            val intent = Intent(this@MainActivity, Tutorial::class.java)
            startActivity(intent)
        }

        val btnPuzzle: Button = findViewById(R.id.btn_puzzle)
        btnPuzzle.setOnClickListener {
            //ToDo zmienić na właściwe
            val intent = Intent(this@MainActivity, Tutorial::class.java)
            startActivity(intent)
        }

        val btnEndurance: Button = findViewById(R.id.btn_endurance)
        btnEndurance.setOnClickListener {
            //ToDo zmienić na właściwe
            val intent = Intent(this@MainActivity, Tutorial::class.java)
            startActivity(intent)
        }
    }

    fun quitApp(view: View) {
        this@MainActivity.finishAffinity()
        exitProcess(0)
    }
}