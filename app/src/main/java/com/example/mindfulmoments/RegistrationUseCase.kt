package com.example.mindfulmoments

interface RegistrationUseCase {
    fun registerUser(username: String, password: String): Boolean
    fun loginUser(username: String, password: String): Boolean
}