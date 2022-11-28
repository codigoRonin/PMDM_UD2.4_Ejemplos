package com.example.appradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup miGrupo = (RadioGroup)findViewById(R.id.opciones_sexo);
        miGrupo.clearCheck();
        miGrupo.check(R.id.radio_femenino);

        // Se recoje el dato
        int idMarcado = miGrupo.getCheckedRadioButtonId();

        if (idMarcado == R.id.radio_masculino)
            Toast.makeText(this, "Masculino", Toast.LENGTH_SHORT).show();

        else
            Toast.makeText(this, "Femenino", Toast.LENGTH_SHORT).show();

        // Escuchamos el evento
        miGrupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId){
                    case R.id.radio_masculino:
                        Toast.makeText(MainActivity.this, "Masculino", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio_femenino:
                        Toast.makeText(MainActivity.this, "Femenino", Toast.LENGTH_SHORT).show();
                        break;
                }
                //Código para realizar
            }
        });

        Switch pulsador = (Switch) findViewById(R.id.miswitch);
        pulsador.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean pulsado) {
                if (pulsado) {
                    Toast.makeText(MainActivity.this, "Activado", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "Desactivado", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

}