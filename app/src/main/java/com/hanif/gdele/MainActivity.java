package com.hanif.gdele;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent myIntent = new Intent(MainActivity.this, start.class);
        startActivity(myIntent);

        MobileAds.initialize(this, initializationStatus -> {
        });
    }
}