package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int [] contAr = new int [1];

    TextView LSalida;
    Button BContador;
    TextView LContador;
    Button LReset;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LSalida = findViewById(R.id.LSalida);
        BContador = findViewById(R.id.BContador);
        LContador = findViewById(R.id.LContador);
        LReset = findViewById(R.id.LReset);

        BContador.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        LSalida.setText("Botón pulsado manín");
                        contAr[0]++;
                        LContador.setText(String.valueOf(contAr[0]));
                    }
                }
        );

        LReset.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        contAr[0]=0;
                        LContador.setText(String.valueOf(contAr[0]));
                        LSalida.setText("Hola Mundo de Nuevo");
                    }
                }
        );

        //Distinta forma
        /*
        Maneja Manejador = new Maneja (LSalida);
        BContador.setOnClickListener(Manejador);
        */




    }




}