package com.example.myalifmobi.presintation.splash

import androidx.lifecycle.ViewModel
import com.example.myalifmobi.data.sourse.remote.reques.MySharedPreference
import com.example.myalifmobi.presintation.auth.signin.SignInContract
import com.example.myalifmobi.utils.navigation.AppNavigator
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val direction: SplashDirection,
    private val mySharedPreference: MySharedPreference
) : SplashContract.ViewModel, ViewModel() {
    override fun onEvenDispatcher(intent: SplashContract.Intent) = intent {
        when (intent) {
            SplashContract.Intent.SingIn -> {
                if (mySharedPreference.getTokenLogin()=="token"&&mySharedPreference.getTokenSignUp()!="token"){
                    direction.openPinCode {

                    }
                }
                if (mySharedPreference.getTokenLogin()=="token"){
                    direction.openSingIn {}
                }

            }

            SplashContract.Intent.Pay -> {

            }
        }
    }

    override val container = container<SplashContract.UIState, SplashContract.SideEffect>(
        SplashContract.UIState.Massage("error")
    )

}