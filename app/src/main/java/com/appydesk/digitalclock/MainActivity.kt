package com.appydesk.digitalclock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.webkit.WebSettings.FORCE_DARK_ON
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextClock
import androidx.webkit.WebSettingsCompat

class MainActivity : AppCompatActivity() {

    lateinit var textClock:TextClock
    lateinit var textdateid:TextClock
    lateinit var textampmClock:TextClock

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        webView=findViewById(R.id.webView)


        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)



    }
}