package com.hanif.talkingTom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Button web = findViewById(R.id.web);
        Button more = findViewById(R.id.more);
        ImageButton youTube = findViewById(R.id.youTube);



        web.setOnClickListener(v -> {
            Intent myIntent = new Intent(start.this, webview.class);
            startActivity(myIntent);
        });

        more.setOnClickListener(v -> {
            Intent myIntent = new Intent(start.this, more.class);
            startActivity(myIntent);
        });

        youTube.setOnClickListener(v -> {

        });
    }
}