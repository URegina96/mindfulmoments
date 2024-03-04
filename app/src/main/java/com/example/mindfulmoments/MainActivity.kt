package com.example.mindfulmoments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageViewRegistration = findViewById<ImageView>(R.id.imageViewRegistration)

        imageViewRegistration.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerRegistration, Registration())
                .addToBackStack(null)
                .commit()
        }
    }
}