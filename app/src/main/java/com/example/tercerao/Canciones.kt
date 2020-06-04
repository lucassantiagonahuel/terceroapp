package com.example.tercerao

import java.io.Serializable


data class Canciones(
 var idImagen: Int,
 var titulo: String,
 var interprete: String,
 var genero: String,
 var calificacion: Double,
 var duracion: Int,
 var fecha: String
): Serializable