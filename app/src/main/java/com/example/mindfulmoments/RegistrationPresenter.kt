package com.example.mindfulmoments

class RegistrationPresenter(private val view: RegistrationContract.View, private val model: RegistrationContract.Model) : RegistrationContract.Presenter {

    override fun onLoginButtonClicked(username: String, password: String) {
        if (model.loginUser(username, password)) {
            view.showLoginSuccess()
        } else {
            view.showLoginError()
        }
    }

    override fun onRegisterButtonClicked(username: String, password: String) {
        if (model.registerUser(username, password)) {
            view.showRegistrationSuccess()
        }
    }
}