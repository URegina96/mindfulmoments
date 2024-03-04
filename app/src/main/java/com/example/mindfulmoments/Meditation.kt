package com.example.mindfulmoments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class Meditation : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttomMindfulBreathingMeditation).setOnClickListener{
            val url="https://www.youtube.com/watch?v=AeMg5dNSM58"
            val intent =Intent(Intent.ACTION_VIEW,Uri.parse(url))
            startActivity(intent)
        }
        view.findViewById<Button>(R.id.buttomBodyScanMeditation).setOnClickListener {
            val url ="https://www.youtube.com/watch?v=d21O7Al50WI"
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        view.findViewById<Button>(R.id.buttonLovingKindnessEditation).setOnClickListener {
            val url ="https://www.youtube.com/watch?v=nsGnb5bL0nA"
            val intent=Intent(Intent.ACTION_VIEW,Uri.parse(url))
            startActivity(intent)
        }
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Раздуваем макет для этого фрагмента
        return inflater.inflate(R.layout.meditation_fragment, container, false)
    }

    companion object {
        // Остальной код оставляем без изменений
    }
}
