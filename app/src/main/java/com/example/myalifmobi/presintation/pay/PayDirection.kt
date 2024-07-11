package com.example.myalifmobi.presintation.pay

import com.example.myalifmobi.data.sourse.remote.reques.AlifLacation
import com.example.myalifmobi.presintation.bottomSheet.BottomSheet
import com.example.myalifmobi.utils.navigation.AppNavigator
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PayDirection @Inject constructor(private val appNavigator: AppNavigator):PayContract.Direction {
    override suspend fun openMain(alifLacation: AlifLacation) {
        appNavigator.replace(BottomSheet(alifLacation))
    }
}