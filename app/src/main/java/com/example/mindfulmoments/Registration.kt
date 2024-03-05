package com.example.mindfulmoments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider

class Registration : Fragment() {
    private lateinit var viewModel: RegistrationViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.registration_fragment, container, false)

        viewModel = ViewModelProvider(this).get(RegistrationViewModel::class.java)

        view.findViewById<Button>(R.id.buttonLogin).setOnClickListener {
            viewModel.username.value = view.findViewById<EditText>(R.id.editTextUsername).text.toString()
            viewModel.password.value = view.findViewById<EditText>(R.id.editTextPassword).text.toString()

            if (viewModel.loginUser()) {
                // Данные верные, выполнить вход пользователя
                // Например, переход на другой экран или выполнение действий по входу
            } else {
                Toast.makeText(requireContext(), "Неверное имя пользователя или пароль", Toast.LENGTH_SHORT).show()
            }
        }

        view.findViewById<Button>(R.id.buttonRegister).setOnClickListener {
            viewModel.username.value = view.findViewById<EditText>(R.id.editTextUsername).text.toString()
            viewModel.password.value = view.findViewById<EditText>(R.id.editTextPassword).text.toString()

            if (viewModel.registerUser()) {
                Toast.makeText(requireContext(), "Регистрация прошла успешно", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "Ошибка при регистрации", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }

    companion object {
        // Остальной код оставляем без изменений
    }
}