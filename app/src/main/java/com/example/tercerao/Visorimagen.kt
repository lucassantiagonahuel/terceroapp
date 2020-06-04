package com.example.tercerao

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_visorimagen.*

class Visorimagen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visorimagen)

        val canciones = intent.getSerializableExtra("can") as Canciones
        aviIvcanciones.setImageResource(canciones.idImagen)
    }
}
