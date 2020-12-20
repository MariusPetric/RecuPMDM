package com.example.recu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    companion object {
        const val PARAM1 = "Click hecho"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.TextoAmostrar)
        val button1 = findViewById<Button>(android.R.id.button1)
        val button2 = findViewById<Button>(android.R.id.button2)
        val button3 = findViewById<Button>(android.R.id.button3)
        val texto = intent.getStringExtra(PARAM1)
    }








}