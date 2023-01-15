package com.example.miprimeraaplicacion.Menuejemplovariables

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.miprimeraaplicacion.Menuejemplovariables.ejemplos.ejemplovariable1
import com.example.miprimeraaplicacion.Menuejemplovariables.ejemplos.ejemplovariable2
import com.example.miprimeraaplicacion.R

class menuEjemplosVariables : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_ejemplos_variables)


    }

    fun ejemplo1(view:View){
        Toast.makeText(this, "toast para cambio...", Toast.LENGTH_SHORT).show()
    val intent = Intent(this, ejemplovariable1::class.java)
        startActivity(intent)
    }

    fun ejemplo2(view:View){
        Toast.makeText(this, "toast para cambio...", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, ejemplovariable2::class.java)
        startActivity(intent)
    }

    fun atrasMenuEjemploVariables(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


}