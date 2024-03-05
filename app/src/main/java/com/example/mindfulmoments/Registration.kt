package com.example.mindfulmoments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Registration : Fragment(), RegistrationContract.View {

    private lateinit var presenter: RegistrationContract.Presenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.registration_fragment, container, false)

        val model = RegistrationModel()
        presenter = RegistrationPresenter(this, model)

        view.findViewById<Button>(R.id.buttonLogin).setOnClickListener {
            val enteredUsername = view.findViewById<EditText>(R.id.editTextUsername).text.toString()
            val enteredPassword = view.findViewById<EditText>(R.id.editTextPassword).text.toString()
            presenter.onLoginButtonClicked(enteredUsername, enteredPassword)
        }

        view.findViewById<Button>(R.id.buttonRegister).setOnClickListener {
            val username = view.findViewById<EditText>(R.id.editTextUsername).text.toString()
            val password = view.findViewById<EditText>(R.id.editTextPassword).text.toString()
            presenter.onRegisterButtonClicked(username, password)
        }

        return view
    }

    override fun showLoginSuccess() {
        // Действия при успешном входе
    }

    override fun showLoginError() {
        Toast.makeText(requireContext(), "Неверное имя пользователя или пароль", Toast.LENGTH_SHORT).show()
    }

    override fun showRegistrationSuccess() {
        Toast.makeText(requireContext(), "Регистрация прошла успешно", Toast.LENGTH_SHORT).show()
    }

    companion object {
        // Остальной код оставляем без изменений
    }
}