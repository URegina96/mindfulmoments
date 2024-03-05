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
    private val model = RegistrationModel()
    private val view: RegistrationView by lazy { RegistrationView(requireContext()) }
    private val intent = RegistrationIntent()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.registration_fragment, container, false)

        view.findViewById<Button>(R.id.buttonLogin).setOnClickListener {
            val enteredUsername = view.findViewById<EditText>(R.id.editTextUsername).text.toString()
            val enteredPassword = view.findViewById<EditText>(R.id.editTextPassword).text.toString()

            if (model.username == enteredUsername && model.password == enteredPassword) {
                // Данные верные, выполнить вход пользователя
                // Например, переход на другой экран или выполнение действий по входу
            } else {
                view.showToast("Неверное имя пользователя или пароль")
            }
        }

        view.findViewById<Button>(R.id.buttonRegister).setOnClickListener {
            model.username = view.findViewById<EditText>(R.id.editTextUsername).text.toString()
            model.password = view.findViewById<EditText>(R.id.editTextPassword).text.toString()
            // Можно здесь сохранить данные пользователя в SharedPreferences или базу данных
            // Например, использовать SharedPreferences для сохранения username и password
            view.showToast("Регистрация прошла успешно")
        }

        return view
    }

    companion object {
        // Остальной код оставляем без изменений
    }
}

private fun View.showToast(s: String) {

}
