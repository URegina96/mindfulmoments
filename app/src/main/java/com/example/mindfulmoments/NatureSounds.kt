package com.example.mindfulmoments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class NatureSounds : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonSoothingSoundsOfRain).setOnClickListener{
            val url="https://www.youtube.com/watch?v=Zhq_ThHG2gA"
            val intent =Intent(Intent.ACTION_VIEW,Uri.parse(url))
            startActivity(intent)
        }
        view.findViewById<Button>(R.id.buttonTheEnticingSoundOfTheForest).setOnClickListener {
            val url="https://www.youtube.com/watch?v=DIEY2DIzJgs"
            val intent =Intent(Intent.ACTION_VIEW,Uri.parse(url))
            startActivity(intent)
        }
        view.findViewById<Button>(R.id.buttonAlluringSoundOfTheOcean).setOnClickListener {
            val url="https://www.youtube.com/watch?v=qTv8lRXM6Tw"
            val intent =Intent(Intent.ACTION_VIEW,Uri.parse(url))
            startActivity(intent)
        }
        view.findViewById<Button>(R.id.buttonSoundsOfASummerFire).setOnClickListener {
            val url="https://www.youtube.com/watch?v=7NrEbQtQiKk"
            val intent =Intent(Intent.ACTION_VIEW,Uri.parse(url))
            startActivity(intent)
        }
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Раздуваем макет для этого фрагмента
        return inflater.inflate(R.layout.nature_sounds_fragment, container, false)
    }

    companion object {
        // Остальной код оставляем без изменений
    }
}