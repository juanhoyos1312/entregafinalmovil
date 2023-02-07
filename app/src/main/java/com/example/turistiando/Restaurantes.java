package com.example.turistiando;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Restaurantes extends AppCompatActivity {

    ArrayList<Restaurante> listaR = new ArrayList<>();

    RecyclerView listaLogicaR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        listaLogicaR = findViewById(R.id.reciclando);
        listaLogicaR.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        crearListaRestaurantes();
        AdaptadorR adaptadorR = new AdaptadorR(listaR);
        listaLogicaR.setAdapter(adaptadorR);
    }

    public void crearListaRestaurantes(){

        listaR.add(new Restaurante(R.drawable.restaurante1,"Restaurante La barra","En el parque principal"));
        listaR.add(new Restaurante(R.drawable.restaurante2,"La terraza","Palmas del llano"));
        listaR.add(new Restaurante(R.drawable.restaurante3,"La sazon de mi abuela","Al frente de la escuelita principal"));
        listaR.add(new Restaurante(R.drawable.restaurante4,"Sazon cocinada y ahumada","Entrando de girardota"));
    }

}
