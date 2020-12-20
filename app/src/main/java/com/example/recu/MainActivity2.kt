package com.example.recu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    companion object {
        const val PARAM = "Hola"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val editText = findViewById<EditText>(R.id.editText)
        val textView = findViewById<TextView>(R.id.Textito)
        val buttonSe = findViewById<Button>(R.id.buttonSe)
        val texto = intent.getStringExtra(PARAM)

        texto?.let{
            textView.text =texto
        }
        editText.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {

                s?.let {
                    buttonSe.isEnabled = editText.length() >= 1
                }
            }
        })
        buttonSe.setOnClickListener{
            texto?.let{
                textView.text = dividirPalabra(it, editText.text.toString())
            }
        }
    }

    private fun dividirPalabra(texto:String, aux: String) : String{
        val x = aux.toInt()
        val lista = texto
        var salida = ""
        var cont = 0

        lista.forEach{
            salida += it
            cont++
            if(cont == x) {
                salida += " "
                cont=0
            }
        }

        return salida
    }
































    }
