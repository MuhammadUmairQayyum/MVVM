package com.android.kotlinmvvmlearning.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel: ViewModel() {


    var email: String? = null
    var password: String?= null
    var authListner: AuthListner?= null

    fun onLoginButtonClick(view: View)
    {
        authListner?.onStarted();
        if(email.isNullOrEmpty() || password.isNullOrEmpty())
        {

            authListner?.onFailure("Failed")


            return
        }

        authListner?.onSuccess()
        //success
    }

}