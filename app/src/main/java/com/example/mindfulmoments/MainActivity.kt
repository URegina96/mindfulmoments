package com.example.mindfulmoments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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

        val buttonMeditation=findViewById<Button>(R.id.buttonMeditation)
        buttonMeditation.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerMeditation,Meditation())
                .addToBackStack(null)
                .commit()
        }
        val buttonNatureSounds=findViewById<Button>(R.id.buttonNatureSounds)
        buttonNatureSounds.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerNatureSounds,NatureSounds())
                .addToBackStack(null)
                .commit()
        }
        val buttonGratitudeJournal=findViewById<Button>(R.id.buttonGratitudeJournal)
        buttonGratitudeJournal.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerGratitudeJournal,GratitudeJournal())
                .addToBackStack(null)
                .commit()
        }
    }
}