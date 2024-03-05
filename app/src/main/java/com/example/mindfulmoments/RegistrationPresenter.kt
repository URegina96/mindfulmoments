package com.example.mindfulmoments

class RegistrationPresenter(private val useCase: RegistrationUseCase) {
    fun onRegisterClicked(username: String, password: String) {
        if (useCase.registerUser(username, password)) {
            // Успешная регистрация
        } else {
            // Ошибка при регистрации
        }
    }

    fun onLoginClicked(username: String, password: String) {
        if (useCase.loginUser(username, password)) {
            // Успешный вход
        } else {
            // Неверный логин или пароль
        }
    }
}