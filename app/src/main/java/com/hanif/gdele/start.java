package com.hanif.gdele;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.ads.interstitial.InterstitialAd;

public class start extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Button web = findViewById(R.id.web);
        Button more = findViewById(R.id.more);
        Button rate= findViewById(R.id.rateUs);
        ImageButton youTube = findViewById(R.id.youTube);

        loadinter();

        web.setOnClickListener(v -> {
            Intent myIntent = new Intent(start.this, delete.class);
            startActivity(myIntent);
        });

        more.setOnClickListener(v -> {
            Intent myIntent = new Intent(start.this, more.class);
            startActivity(myIntent);
        });

        youTube.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/shorts/w0cIpvN26RA?feature=share"));
            startActivity(browserIntent);
        });

        rate.setOnClickListener(v ->{
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.hanif.gdele"));
            startActivity(browserIntent);
        });

    }


    public void loadinter() {

    }
}