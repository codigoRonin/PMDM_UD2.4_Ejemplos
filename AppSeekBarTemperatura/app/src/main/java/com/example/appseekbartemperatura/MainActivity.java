package com.example.appseekbartemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView miTxt = (TextView) findViewById(R.id.miTxt);
        SeekBar miControl = (SeekBar) findViewById(R.id.miBarra);
        miControl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //Código para cambio de valor
                switch (progress){
                    case 0:
                        miTxt.setText("Helado");
                        miTxt.setTextColor(Color.parseColor("#FF29B6F6"));
                        break;
                    case 1:
                        miTxt.setText("Frio");
                        miTxt.setTextColor(Color.parseColor("#FF26C6DA"));
                        break;
                    case 2:
                        miTxt.setText("Agradabe");
                        miTxt.setTextColor(Color.parseColor("#FFFFCA28"));
                        break;
                    case 3:
                        miTxt.setText("Calor");
                        miTxt.setTextColor(Color.parseColor("#FFFFA726"));
                        break;
                    case 4:
                        miTxt.setText("Sofocante");
                        miTxt.setTextColor(Color.parseColor("#FFFF7043"));
                        break;

                }
            }
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Código para inicio de cambio
            }
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Código para final de cambio
            }
        });
    }

}

