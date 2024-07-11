package com.example.myalifmobi.presintation.splash

import com.example.myalifmobi.presintation.auth.pinkode.PinCode
import com.example.myalifmobi.presintation.auth.signin.SignIn
import com.example.myalifmobi.presintation.pay.Pay
import com.example.myalifmobi.utils.navigation.AppNavigator
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SplashDirection @Inject constructor(private val navigator: AppNavigator) : SplashContract.Direction {
    override suspend fun openSingIn(open: () -> Unit) {
        navigator.replace(SignIn())
    }

    override suspend fun openPinCode(open: () -> Unit) {
        navigator.replace(PinCode())
    }



}