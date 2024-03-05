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

    private lateinit var presenter: RegistrationPresenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.registration_fragment, container, false)
        val useCase = RegistrationUseCaseImpl()
        presenter = RegistrationPresenter(useCase)

        view.findViewById<Button>(R.id.buttonLogin).setOnClickListener {
            val enteredUsername = view.findViewById<EditText>(R.id.editTextUsername).text.toString()
            val enteredPassword = view.findViewById<EditText>(R.id.editTextPassword).text.toString()

            presenter.onLoginClicked(enteredUsername, enteredPassword)
        }

        view.findViewById<Button>(R.id.buttonRegister).setOnClickListener {
            val enteredUsername = view.findViewById<EditText>(R.id.editTextUsername).text.toString()
            val enteredPassword = view.findViewById<EditText>(R.id.editTextPassword).text.toString()

            presenter.onRegisterClicked(enteredUsername, enteredPassword)
        }

        return view
    }

    companion object {
        // Остальной код оставляем без изменений
    }
}
