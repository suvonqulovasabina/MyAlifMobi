package com.example.myalifmobi.presintation.auth.signin

import com.example.myalifmobi.presintation.auth.pinkode.PinCode
import com.example.myalifmobi.presintation.auth.singUp.SignUp
import com.example.myalifmobi.presintation.auth.smsCode.SmsCode
import com.example.myalifmobi.utils.navigation.AppNavigator
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SingInDirection @Inject constructor(private var navigator: AppNavigator) :
    SignInContract.Direction {

    override suspend fun openSignUp(phone:String) {
        navigator.replace(SignUp())
    }

    override suspend fun openPinCode() {
        navigator.replace(PinCode())
    }
}