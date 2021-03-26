package com.main.cxoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // pulsing
        Button pulsebtn = (Button) findViewById(R.id.pulsebtn);
        pulsebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pulseIntent = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(pulseIntent);
            }
        });

        // pulsing
        Button nudgebtn = (Button) findViewById(R.id.nudgebtn);
        nudgebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nudgeIntent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(nudgeIntent);
            }
        });

    }
}