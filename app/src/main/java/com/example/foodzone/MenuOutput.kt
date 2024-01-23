package com.example.foodzone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

//import kotlinx.android.synthetic.main.activity_menu_output.viewOrder

class MenuOutput : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_output)

        val viewOrder = findViewById<TextView>(R.id.viewOrder)
        val orderOfCustomer = intent.getStringExtra(MenuInput.KEY)

        viewOrder.text = orderOfCustomer.toString()
    }
}