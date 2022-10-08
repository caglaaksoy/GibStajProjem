package com.caglaaksoy.gibgib;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
public class SifremiUnuttumActivity extends AppCompatActivity {
    private WebView webView;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sifremi_unuttum);

        // E-devlet web sitesini açmak için webview ayarları yapılır.
        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient()); //Webview javascript kodlarını çalıştıracak şekilde set edilir.
        progressDialog = ProgressDialog.show(this, "E-devlet", "Sayfa Yükleniyor...", true);
        //progressDialog ile kullanıcıya bilgi veren bir mesaj gösterilir.
        webView.setWebViewClient(new WebViewClient() {
            public void onReceivedClientCertRequest(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(getApplicationContext(), "Sayfa Yüklenemedi!", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (progressDialog.isShowing())
                    progressDialog.dismiss();
            }
        });
        webView.loadUrl("https://giris.turkiye.gov.tr/Giris/");
    }
}

// giriş sonrası url yakala