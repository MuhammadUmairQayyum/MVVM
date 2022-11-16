package com.android.kotlinmvvmlearning.ui.auth

interface AuthListner {
    fun onStarted()
    fun onSuccess()
    fun onFailure(message: String)
}