package com.hanif.talkingTom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class delete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        Button button1= findViewById(R.id.button);
        Button button2= findViewById(R.id.button2);
        Button button3= findViewById(R.id.button3);
        Button button4= findViewById(R.id.button4);



        button1.setOnClickListener(v -> {
            webview.url="";
        });


        button2.setOnClickListener(v -> {
            webview.url="";
        });

        button3.setOnClickListener(v -> {
            webview.url="";
        });

        button4.setOnClickListener(v -> {
            webview.url="https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox";
        });
    }
}