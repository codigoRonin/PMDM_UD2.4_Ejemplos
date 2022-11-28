package com.example.appswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Switch miSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miSwitch= findViewById(R.id.miSwitch);

        miSwitch.toggle();
     //   miSwitch.toggle();

    }
}