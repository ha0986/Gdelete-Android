package com.hanif.talkingTom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.tv.AdRequest;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class start extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Button web = findViewById(R.id.web);
        Button more = findViewById(R.id.more);
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

        });


    }


    public void loadinter() {
        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this, "ca-app-pub-3940256099942544/1033173712", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {

                        mInterstitialAd = interstitialAd;
                        if (mInterstitialAd != null) {
                            mInterstitialAd.show(start.this);
                        } else {
                            Log.d("TAG", "The interstitial ad wasn't ready yet.");
                        }

                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {

                        mInterstitialAd = null;
                    }
                });
    }
}