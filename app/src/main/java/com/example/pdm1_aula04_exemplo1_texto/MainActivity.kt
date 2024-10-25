package com.example.pdm1_aula04_exemplo1_texto

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referenciando o TextView e o Button
        val textView: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener { // Definindo o evento de clique do botão
            textView.text = "Prof. José Paulo" // Alterando o texto do TextView
        }
    }
}