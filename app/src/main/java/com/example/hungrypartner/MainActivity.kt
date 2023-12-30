package com.example.hungrypartner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var txtResult: TextView
    lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2 = findViewById(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this, ScreenActivity2::class.java)
            startActivity(intent)
        }
    }
}
