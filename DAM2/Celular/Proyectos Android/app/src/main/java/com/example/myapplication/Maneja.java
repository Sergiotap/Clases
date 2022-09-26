package com.example.myapplication;

import android.view.View;
import android.widget.TextView;

public class Maneja implements View.OnClickListener{

    int cont = 0;
    TextView salida;

    public Maneja (TextView sal) {
        cont = 0;
        salida = sal;
    }

    @Override
    public void onClick(View view) {
        cont ++;
        salida.setText(String.valueOf(cont));
    }


}
