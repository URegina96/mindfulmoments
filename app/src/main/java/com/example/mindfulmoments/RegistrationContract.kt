package com.example.mindfulmoments

interface RegistrationContract {
    interface View {
        fun showLoginSuccess()
        fun showLoginError()
        fun showRegistrationSuccess()
    }

    interface Presenter {
        fun onLoginButtonClicked(username: String, password: String)
        fun onRegisterButtonClicked(username: String, password: String)
    }

    interface Model {
        fun loginUser(username: String, password: String): Boolean
        fun registerUser(username: String, password: String): Boolean
    }
}