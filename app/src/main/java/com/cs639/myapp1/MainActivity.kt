package com.cs639.myapp1

import android.widget.TextView
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloTextView = findViewById<TextView>(R.id.helloTextView)
        val yourName = "Manikanta" // Declare and assign a variable

        helloTextView.text = "Hello Android $yourName!"
    }
}