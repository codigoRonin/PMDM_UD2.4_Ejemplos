package com.example.appcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox miCheckBox = (CheckBox) findViewById(R.id.miCheckBox);
    /*    miCheckBox.setOnCheckedChangeListener(
                new CheckBox.OnCheckedChangeListener() {
                    public void onCheckedChanged(CompoundButton buttonView, boolean pulsado) {
                        if (pulsado) {
                            //Código para pulsado
                        } else {
                            //Código para no pulsado
                        }
                    }
                });*/
        miCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean pulsado) {
                if (pulsado) {
                    //Código para pulsado
                } else {
                    //Código para pulsado
                }
            }
        });

          }
}