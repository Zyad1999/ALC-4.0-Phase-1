package com.example.android.alc40;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class
ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView web = findViewById(R.id.web);

        web.setWebChromeClient(new WebChromeClient());
        web.getSettings().setJavaScriptEnabled(true);

        web.setWebViewClient(new WebViewClient() {

            @Override
            public void onReceivedSslError (WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });

        web.loadUrl("https://andela.com/alc/");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int Id = item.getItemId();

        if(Id == android.R.id.home)
            this.finish();

        return super.onOptionsItemSelected(item);
    }
}
