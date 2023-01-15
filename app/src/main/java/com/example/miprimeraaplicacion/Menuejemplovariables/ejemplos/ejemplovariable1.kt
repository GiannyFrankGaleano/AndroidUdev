package com.example.miprimeraaplicacion.Menuejemplovariables.ejemplos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.miprimeraaplicacion.Menuejemplovariables.menuEjemplosVariables
import com.example.miprimeraaplicacion.R

class ejemplovariable1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplovariable1)
        var num1 = 1
        var num2 = 2
        var suma = num1 + num2
        var resultadoTextView = findViewById<TextView>(R.id.resultadoEjemplo1)
        resultadoTextView.text = suma.toString()
    }

    fun atrasEjemploVariables1(view: View) {
        val intent = Intent(this, menuEjemplosVariables::class.java)
        startActivity(intent)
    }
}