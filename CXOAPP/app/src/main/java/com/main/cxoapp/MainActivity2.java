package com.main.cxoapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.main.cxoapp.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // go to nudging survey
        Button nudgevisitbtn = (Button) findViewById(R.id.nudgebtn);
        nudgevisitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nudgeURL = "https://www.surveymonkey.com/r/29SW5DL";;
                Uri webadd = Uri.parse(nudgeURL);
                Intent nudgeIntent = new Intent(Intent.ACTION_VIEW, webadd);
                if (nudgeIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(nudgeIntent);
                }
            }
        });

    }
}