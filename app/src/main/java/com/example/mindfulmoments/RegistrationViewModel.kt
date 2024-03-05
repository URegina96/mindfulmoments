package com.example.mindfulmoments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RegistrationViewModel : ViewModel() {
    var username: MutableLiveData<String> = MutableLiveData()
    var password: MutableLiveData<String> = MutableLiveData()

    fun loginUser(): Boolean {
        // Логика проверки данных пользователя
        return true // Для примера всегда возвращает true
    }

    fun registerUser(): Boolean {
        // Логика регистрации пользователя
        return true // Для примера всегда возвращает true
    }
}