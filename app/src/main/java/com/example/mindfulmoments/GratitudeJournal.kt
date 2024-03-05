package com.example.mindfulmoments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class GratitudeJournal : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Раздуваем макет для этого фрагмента
        return inflater.inflate(R.layout.gratitude_journal_fragment, container, false)
    }

    companion object {
        // Остальной код оставляем без изменений
    }
}
