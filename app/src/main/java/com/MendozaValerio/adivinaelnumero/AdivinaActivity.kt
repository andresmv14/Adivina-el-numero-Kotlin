package com.MendozaValerio.adivinaelnumero

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.random.Random

class AdivinaActivity : AppCompatActivity() {
    lateinit var etNumero:EditText
    lateinit var btnComprobar:Button
    var numero:Int =0
    var respuestaCorrecta = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adivina)
        initUi()


        btnComprobar.setOnClickListener{
            val strRespuesta = etNumero.text.toString()
            if(strRespuesta.equals("")){
                Toast.makeText(this,"Dejaste el campo vacio", Toast.LENGTH_LONG).show()
            }else if(strRespuesta.toInt()>10){
                Toast.makeText(this,"Ingresa un numero entre el 0 y el 10",Toast.LENGTH_LONG).show()
            }
            else{
                    if(numero ==strRespuesta.toInt()) {
                        var mediaPlayer: MediaPlayer?= MediaPlayer.create(this, R.raw.correcto)
                        mediaPlayer?.start() // no need to call prepare(); create() does that for you
                        generaNumero()
                    }else {
                        var mediaPlayer: MediaPlayer?= MediaPlayer.create(this, R.raw.incorrecto)
                        mediaPlayer?.start() // no need to call prepare(); create() does that for you

                    }


            }
        }
    }
    fun initUi(){
        etNumero = findViewById(R.id.etNumero)
        btnComprobar = findViewById(R.id.btnComprobar)
        generaNumero()

    }
    fun generaNumero(){
        numero = Random.nextInt(0,10)

        etNumero.text.clear()
    }
}