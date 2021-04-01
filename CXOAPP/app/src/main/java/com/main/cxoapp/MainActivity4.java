package com.main.cxoapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        // DigiLearn
        Button digilearnbtn = (Button) findViewById(R.id.button);
        digilearnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String digilearnURL = "https://github.com/Dreycey/CXO-webpage/wiki/DIGILEARN";
                Uri webadd = Uri.parse(digilearnURL);
                Intent digilearnIntent = new Intent(Intent.ACTION_VIEW, webadd);
                startActivity(digilearnIntent);
                if (digilearnIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(digilearnIntent);
                }
            }
        });

        // DigiTest
        Button digitestbtn = (Button) findViewById(R.id.button3);
        digitestbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String digitestURL = "https://www.surveymonkey.com/r/QKBH9QX";
                Uri webadd = Uri.parse(digitestURL);
                Intent digitestIntent = new Intent(Intent.ACTION_VIEW, webadd);
                startActivity(digitestIntent);
                if (digitestIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(digitestIntent);
                }
            }
        });

        // Video Training
        Button vidtrainbtn = (Button) findViewById(R.id.button4);
        vidtrainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String vidtrainURL = "https://www.youtube.com/watch?v=Mv1hbAF5pg8";
                Uri webadd = Uri.parse(vidtrainURL);
                Intent vidtrainIntent = new Intent(Intent.ACTION_VIEW, webadd);
                startActivity(vidtrainIntent);
                if (vidtrainIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(vidtrainIntent);
                }
            }
        });

        // DLT Manual
        Button dtlmanbtn = (Button) findViewById(R.id.button5);
        dtlmanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dtlmanURL = "https://github.com/Dreycey/CXO-webpage/wiki/Digital-Literacy-Training-Manual";
                Uri webadd = Uri.parse(dtlmanURL);
                Intent dtlmanIntent = new Intent(Intent.ACTION_VIEW, webadd);
                startActivity(dtlmanIntent);
                if (dtlmanIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(dtlmanIntent);
                }
            }
        });

    }
}