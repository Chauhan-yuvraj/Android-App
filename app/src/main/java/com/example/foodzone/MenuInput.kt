package com.example.foodzone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MenuInput : AppCompatActivity() {

    // Creating a Key
    companion object{
        const val KEY = "com.example.foodzone.MenuInput.KEY"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_input)
        val order1 = findViewById<EditText>(R.id.order1)
        val order2 = findViewById<EditText>(R.id.order2)
        val order3 = findViewById<EditText>(R.id.order3)
        val order4 = findViewById<EditText>(R.id.order4)
        val order5 = findViewById<EditText>(R.id.order5)
        val order  = findViewById<Button>(R.id.order)
        val home   = findViewById<Button>(R.id.home)
        order.setOnClickListener {
            val orderPlaced = order1.text.toString() + " " + order2.text.toString() + " " + order3.text.toString()+" "+order4.text.toString()+" "+order5.text.toString()

            intent = Intent(this , MenuOutput::class.java)
            intent.putExtra(KEY, orderPlaced)
            startActivity(intent)
        }
        home.setOnClickListener {
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}