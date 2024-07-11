package com.example.myalifmobi.presintation.auth.smsCode

import com.example.myalifmobi.presintation.auth.pinkode.PinCode
import com.example.myalifmobi.presintation.main.MainScreen
import com.example.myalifmobi.utils.navigation.AppNavigator
import javax.inject.Inject

class SmsCodeDirection  @Inject constructor(private val appNavigator: AppNavigator, ):SmsCodeContract.Direction{
    override suspend fun openMain(open: () -> Unit) {
        appNavigator.replace(PinCode())
    }
}