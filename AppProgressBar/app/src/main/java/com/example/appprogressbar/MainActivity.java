package com.example.appprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar pro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        pro = findViewById(R.id.progressBar2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pro.setVisibility(View.VISIBLE);
               esperar(10000);
            }
        });

    }
    /**
     * Espera  los milisegundos indicados
     * @param milisegundos
     */
    public void esperar(int milisegundos) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                // acciones que se ejecutan tras los milisegundos
                alFinalizar();
            }
        }, milisegundos);
    }

    /**
     * Finaliza la aplicación
     */
    public void alFinalizar() {
        pro.setVisibility(View.INVISIBLE);
    }
}