package com.example.miprimeraaplicacion.Menuejemplovariables.ejemplos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.miprimeraaplicacion.Menuejemplovariables.menuEjemplosVariables
import com.example.miprimeraaplicacion.R

class ejemplovariable2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplovariable2)
        var base = 1
        var altura = 2
        var resultadoTriangulo = (base * altura )/2
        var resultadoTextView = findViewById<TextView>(R.id.resultadoTriangulo)
        resultadoTextView.text = resultadoTriangulo.toString()
    }

    fun atrasEjemploVariables2(view: View) {
        val intent = Intent(this, menuEjemplosVariables::class.java)
        startActivity(intent)
    }
}