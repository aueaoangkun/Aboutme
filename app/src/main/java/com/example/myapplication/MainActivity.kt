package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonDatail = findViewById<Button>(R.id.buttonDetail)
        buttonDatail.setOnClickListener { view ->
            Toast.makeText(this,"Button Clicked",
                Toast.LENGTH_LONG).show()

            val intent = Intent( this,
                PhotoActivity::class.java)
            startActivity(intent)
        }
    }
}