package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    Button EBoton;
    EditText LEntrada;
    TextView LESalida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LESalida = findViewById(R.id.LESalida);
        EBoton = findViewById(R.id.EBoton);
        LEntrada = findViewById(R.id.LEntrada);


        EBoton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        LESalida.setText("Tu nombre es: "+LEntrada.getText());
                        LEntrada.setText("\n Introduce otro nombre");
                    }
                }
        );



    }







}