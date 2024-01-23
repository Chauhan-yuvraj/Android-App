package com.example.foodzone

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class Web_view : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        val webview = findViewById<WebView>(R.id.webview)
        webviewSetup(webview)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webviewSetup(webView: WebView){

        webView.webViewClient = WebViewClient()

        webView.apply {
            settings.safeBrowsingEnabled = true
            settings.javaScriptEnabled = true
//            settings.allowUniversalAccessFromFileURLs = true
            loadUrl("https://chauhan-yuvraj.github.io/cars/")
        }
    }
}