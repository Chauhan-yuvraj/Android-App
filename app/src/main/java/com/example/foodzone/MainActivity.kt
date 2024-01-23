package com.example.foodzone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scrollViewBtn = findViewById<Button>(R.id.scrollView)
        val ImplicitIntentBnt = findViewById<Button>(R.id.implicitIntent)
        val WebView = findViewById<Button>(R.id.WebView)
        val menu = findViewById<Button>(R.id.menu)
        val splashScreen = findViewById<Button>(R.id.splashscreen)
        val signup = findViewById<Button>(R.id.signup)

        scrollViewBtn.setOnClickListener {
            // Open a new activity
            intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }

        ImplicitIntentBnt.setOnClickListener {
            intent = Intent(applicationContext , ImplicitIntent::class.java)
            startActivity(intent)
        }
        WebView.setOnClickListener {
            intent = Intent(applicationContext,Web_view::class.java)
            startActivity(intent)
        }

        menu.setOnClickListener {
            intent = Intent(applicationContext , MenuInput::class.java)
            startActivity(intent)
        }
        splashScreen.setOnClickListener {
            intent = Intent(applicationContext , SplashScreen::class.java)
            startActivity(intent)
        }
        signup.setOnClickListener {
            intent = Intent(applicationContext , SignUp::class.java)
            startActivity(intent)
        }
    }
}