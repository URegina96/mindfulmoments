package com.example.mindfulmoments

import android.content.Context
import android.widget.Toast

class RegistrationView(val context: Context) {
    fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}