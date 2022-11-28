package com.example.appactividad242;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton ibtn1 = (ImageButton) findViewById(R.id.ibtn1);
        ImageButton ibtn2 = (ImageButton) findViewById(R.id.ibtn2);
        ibtn1.setOnClickListener(this);
        ibtn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.ibtn1:

                Intent i1 = new Intent(this, Actividad_1.class);
                startActivity(i1);

                break;
            case R.id.ibtn2:
                Intent i2 = new Intent(this, Actividad_2.class);
                startActivity(i2);
                break;

        }

    }
}