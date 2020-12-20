package com.example.recu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = findViewById<TextView>(R.id.TextoAmostrar)
        val button1 = findViewById<Button>(android.R.id.button1)
        val button2 = findViewById<Button>(android.R.id.button2)
        val button3 = findViewById<Button>(android.R.id.button3)

        button1.setOnClickListener {
            text.append("Click hecho!!")
            button3.setEnabled(true)
        }
        button2.setOnClickListener{
            text.append(Random.nextInt(0, 10).toString()+" ")
        }
        button3.setOnClickListener {
            val texto = text.text
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(MainActivity2.PARAM, text.toString())
            startActivity(intent)
        }


    }
}