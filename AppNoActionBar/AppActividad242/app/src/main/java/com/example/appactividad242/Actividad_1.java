package com.example.appactividad242;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
        EditText campoMensaje = (EditText) findViewById(R.id.campo_mensaje);


        campoMensaje.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                TextView contador = (TextView) findViewById(R.id.texto_contador);
                String tamanoString = String.valueOf(editable.length());
                contador.setText(tamanoString);
            }
        });


    }

    public void btn1(View view){
        Intent i= new Intent(this, MainActivity.class);
        startActivity(i);
    }
}