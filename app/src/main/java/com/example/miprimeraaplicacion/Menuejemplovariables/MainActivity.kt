package com.example.miprimeraaplicacion.Menuejemplovariables

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.miprimeraaplicacion.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ejemploVariables(view: View){

        Toast.makeText(this, "redireccionando...", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, menuEjemplosVariables::class.java)
        startActivity(intent)
    }
}