package com.bignerdranch.android.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import java.util.UUID;

public class HelpWebPage extends AppCompatActivity {
    private WebView mWebView;

    public static Intent newIntent(Context packageContext, String targetURL) {
        Intent intent = new Intent(packageContext, HelpWebPage.class);
        intent.putExtra("TARGET URL", targetURL);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpwebpage);

        mWebView = (WebView) findViewById(R.id.webview);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("https://www.usc.edu.au");
    }
}
