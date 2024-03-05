package com.example.mindfulmoments

class RegistrationModel : RegistrationContract.Model {

    private var username: String? = null
    private var password: String? = null

    override fun loginUser(username: String, password: String): Boolean {
        if (username == this.username && password == this.password) {
            return true
        }
        return false
    }

    override fun registerUser(username: String, password: String): Boolean {
        this.username = username
        this.password = password
        return true
    }
}