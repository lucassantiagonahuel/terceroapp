package com.example.tercerao

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.elementos_lista_canciones.view.*


class  AdaptadorCanciones(private var  lista:ArrayList<Canciones>,private  var  contexto:Context): RecyclerView.Adapter<AdaptadorCanciones.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      return ViewHolder(
              LayoutInflater.from(parent.context).inflate(
                  R.layout.elementos_lista_canciones,
                  parent,
                  false
              ), contexto
        )
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      holder.bind(lista[position])
    }

    class ViewHolder(private var vista: View, private var contexto: Context) : RecyclerView.ViewHolder(vista) {
        fun bind(canciones: Canciones) {
            vista.elcivcanciones.setImageResource(canciones.idImagen)
            vista.elctvtitulo.text=canciones.titulo
            vista.elctvdescripcion.text=canciones.genero
            vista.elcrating.rating=canciones.calificacion.toFloat()

            vista.elcivcanciones.setOnClickListener {
                contexto.startActivity(Intent(contexto, Visorimagen ::class.java).putExtra("can",canciones))
            }
            vista.setOnClickListener {
                contexto.startActivity(Intent(contexto, Detalles ::class.java).putExtra("can",canciones))
            }


            }
        }
    }


