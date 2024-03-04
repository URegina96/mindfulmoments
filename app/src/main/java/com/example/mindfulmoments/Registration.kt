package com.example.mindfulmoments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Registration : Fragment() {
    private var username: String? = null
    private var password: String? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.registration_fragment, container, false)

        view.findViewById<Button>(R.id.buttonLogin).setOnClickListener {
            val enteredUsername = view.findViewById<EditText>(R.id.editTextUsername).text.toString()
            val enteredPassword = view.findViewById<EditText>(R.id.editTextPassword).text.toString()

            if (enteredUsername == username && enteredPassword == password) {
                // Данные верные, выполнить вход пользователя
                // Например, переход на другой экран или выполнение действий по входу
            } else {
                Toast.makeText(requireContext(), "Неверное имя пользователя или пароль", Toast.LENGTH_SHORT).show()
            }
        }

        view.findViewById<Button>(R.id.buttonRegister).setOnClickListener {
            username = view.findViewById<EditText>(R.id.editTextUsername).text.toString()
            password = view.findViewById<EditText>(R.id.editTextPassword).text.toString()
            // Можно здесь сохранить данные пользователя в SharedPreferences или базу данных
            // Например, использовать SharedPreferences для сохранения username и password
            Toast.makeText(requireContext(), "Регистрация прошла успешно", Toast.LENGTH_SHORT).show()
        }

        return view
    }

    companion object {
        // Остальной код оставляем без изменений
    }
}