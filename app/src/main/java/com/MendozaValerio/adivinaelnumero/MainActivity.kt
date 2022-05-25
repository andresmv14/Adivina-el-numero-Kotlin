package com.MendozaValerio.adivinaelnumero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnContinuar:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnContinuar = findViewById(R.id.btnContinuar)
        btnContinuar.setOnClickListener{
            val intentContinuar = Intent(this,AdivinaActivity::class.java)
            startActivity(intentContinuar)
        }

    }
}