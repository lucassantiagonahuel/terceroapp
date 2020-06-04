package com.example.tercerao

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        amRvCanciones.layoutManager = LinearLayoutManager(this)
        amRvCanciones.adapter = AdaptadorCanciones(generarDatosPrueba(),this)

    }

    private fun generarDatosPrueba() : ArrayList<Canciones>{
       var lista = ArrayList<Canciones>()
        lista.add(Canciones(R.drawable.gulp,"Gulp","Patricio Rey Y Sus Redonditos De Ricota", "Rock",4.3,39,"1985" ))
        lista.add(Canciones(R.drawable.oktubre,"Oktubre","Patricio Rey Y Sus Redonditos De Ricota", "Rock",5.0,41,"1986" ))
        lista.add(Canciones(R.drawable.bang,"¡Bang!¡Bang!Estas Liquidado","Patricio Rey Y Sus Redonditos De Ricota", "Rock",3.3,32,"1989" ))
        lista.add(Canciones(R.drawable.lobo,"Lobo Suelto,Cordero Atado Vol.1","Patricio Rey Y Sus Redonditos De Ricota", "Rock",4.3,41,"1993" ))
        lista.add(Canciones(R.drawable.cordero,"Lobo Suelto Cordero Atado Vol.2","Patricio Rey Y Sus Redonditos De Ricota", "Rock",4.3,41,"1993" ))
        lista.add(Canciones(R.drawable.luzbelito,"Luzbelito","Patricio Rey Y Sus Redonditos De Ricota", "Rock",4.3,56,"1996" ))
        lista.add(Canciones(R.drawable.bondi,"Ultimo Bondi A Finisterre","Patricio Rey Y Sus Redonditos De Ricota", "Rock",4.3,44,"1998" ))
        lista.add(Canciones(R.drawable.momo,"Momo Sampler","Patricio Rey Y Sus Redonditos De Ricota", "Rock",4.3,48,"2000" ))

        return lista
    }
}
