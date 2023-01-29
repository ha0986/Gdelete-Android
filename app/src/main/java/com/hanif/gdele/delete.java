package com.hanif.gdele;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
            webview.url="https://mail.google.com/mail/u/0/?tab=rm&ogbl#search/larger%3A2M";
            Intent myIntent = new Intent(delete.this, webview.class);
            startActivity(myIntent);
        });


        button2.setOnClickListener(v -> {
            webview.url="https://mail.google.com/mail/u/0/?tab=rm&ogbl#search/larger%3A5M";
            Intent myIntent = new Intent(delete.this, webview.class);
            startActivity(myIntent);
        });

        button3.setOnClickListener(v -> {
            webview.url="https://mail.google.com/mail/u/0/?tab=rm&ogbl#search/larger%3A10M";
            Intent myIntent = new Intent(delete.this, webview.class);
            startActivity(myIntent);
        });

        button4.setOnClickListener(v -> {
            webview.url="https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox";
            Intent myIntent = new Intent(delete.this, webview.class);
            startActivity(myIntent);
        });
    }
}