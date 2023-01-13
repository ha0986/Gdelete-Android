package com.hanif.talkingTom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class webview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);


        WebView view = findViewById(R.id.webView);
        view.getSettings().getUserAgentString();
        String newUserAgent;
        String ua = view.getSettings().getUserAgentString();
        String androidOSString = view.getSettings().getUserAgentString().substring(ua.indexOf("("), ua.indexOf(")") + 1);
        newUserAgent = view.getSettings().getUserAgentString().replace(androidOSString, "(X11; Linux x86_64)");

        view.getSettings().setUserAgentString(newUserAgent);
        view.getSettings().setUseWideViewPort(true);
        view.getSettings().setLoadWithOverviewMode(true);
        view.loadUrl("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");

    }

}