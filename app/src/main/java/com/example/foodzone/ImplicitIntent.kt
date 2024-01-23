package com.example.foodzone

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.cardview.widget.CardView

class ImplicitIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent)

        val google = findViewById<CardView>(R.id.google)
        val camera = findViewById<CardView>(R.id.camera)
        val gitHub = findViewById<CardView>(R.id.github)
        val home = findViewById<CardView>(R.id.home)


        google.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("www.google.com")
            startActivity(intent)
        }
        camera.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
        gitHub.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("www.github.com")
            startActivity(intent)
        }
        home.setOnClickListener {
            intent = Intent(applicationContext , MainActivity::class.java)
            startActivity(intent)
        }
    }
}