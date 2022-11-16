package com.android.kotlinmvvmlearning.ui.auth


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.android.kotlinmvvmlearning.R
import com.android.kotlinmvvmlearning.databinding.ActivityLoginBinding

import com.android.kotlinmvvmlearning.utils.toast

class LoginActivity : AppCompatActivity() ,AuthListner{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        val viewModel = ViewModelProviders.of(this).get(AuthViewModel::class.java)
        binding.viewmodel= viewModel
        viewModel.authListner = this

    }

    override fun onStarted() {

        toast("Login Started")
    }

    override fun onSuccess() {
        toast("Login Success")
    }

    override fun onFailure(message: String) {
        toast("Login Failed")
    }
}