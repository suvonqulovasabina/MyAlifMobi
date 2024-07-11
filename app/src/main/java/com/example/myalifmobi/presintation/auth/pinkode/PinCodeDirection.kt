package com.example.myalifmobi.presintation.auth.pinkode

import com.example.myalifmobi.presintation.main.MainScreen
import com.example.myalifmobi.utils.navigation.AppNavigator
import kotlinx.coroutines.MainScope
import javax.inject.Inject

class PinCodeDirection @Inject constructor(private val appNavigator: AppNavigator):PinCodeContract.Direction {

    override suspend fun openManiScreen(open: () -> Unit) {
        appNavigator.replace(MainScreen())
    }
}