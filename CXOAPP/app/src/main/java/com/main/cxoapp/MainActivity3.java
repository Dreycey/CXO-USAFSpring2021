package com.main.cxoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // go to nudging survey
        Button pulsevisitbtn = (Button) findViewById(R.id.pulsebtn);
        pulsevisitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pulseURL = "https://www.surveymonkey.com/r/29YTSGT";
                Uri webadd = Uri.parse(pulseURL);
                Intent pulseIntent = new Intent(Intent.ACTION_VIEW, webadd);
                startActivity(pulseIntent);
                if (pulseIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(pulseIntent);
                }
            }
        });
    }
}