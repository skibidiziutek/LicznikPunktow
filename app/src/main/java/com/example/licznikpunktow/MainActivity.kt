package com.example.licznikpunktow

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var punktyA = 0
    private var punktyB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val widokPunktowA = findViewById<TextView>(R.id.scoreA)
        val widokPunktowB = findViewById<TextView>(R.id.scoreB)
        
        val przyciskA = findViewById<Button>(R.id.btnA)
        val przyciskB = findViewById<Button>(R.id.btnB)
        val przyciskReset = findViewById<Button>(R.id.btnReset)

        przyciskA.setOnClickListener {
            punktyA = punktyA + 1
            widokPunktowA.text = punktyA.toString()
        }

        przyciskB.setOnClickListener {
            punktyB = punktyB + 1
            widokPunktowB.text = punktyB.toString()
        }

        przyciskReset.setOnClickListener {
            punktyA = 0
            punktyB = 0
            widokPunktowA.text = "0"
            widokPunktowB.text = "0"
        }
    }
}