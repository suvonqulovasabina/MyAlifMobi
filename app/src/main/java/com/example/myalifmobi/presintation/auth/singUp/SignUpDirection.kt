package com.example.myalifmobi.presintation.auth.singUp

import com.example.myalifmobi.presintation.auth.smsCode.SmsCode
import com.example.myalifmobi.utils.navigation.AppNavigator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SignUpDirection @Inject constructor(private val navigator: AppNavigator):SignUpContract.Direction {

    override suspend fun openPinCode(phone: String) {
        navigator.replace(SmsCode(phone))
    }
}