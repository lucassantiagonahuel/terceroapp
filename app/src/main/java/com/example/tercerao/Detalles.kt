package com.example.tercerao

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalles.*

class Detalles : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles)

        val canciones = intent.getSerializableExtra("can") as Canciones
        adtvTitulo.text=getString(R.string.titulo,canciones.titulo)
        adtvInterprete.text=getString(R.string.interprete,canciones.interprete)
        adtvGenero.text=getString(R.string.genero,canciones.genero)
        adtvCalificacion.text=getString(R.string.calificacion,canciones.calificacion)
        adtvDuracion.text=getString(R.string.duracion,canciones.duracion)
        adtvFecha.text=getString(R.string.fecha,canciones.fecha)
    }
}
