package com.example.myalifmobi.presintation.auth.signin

import dagger.Module
import dagger.hilt.InstallIn
import org.orbitmvi.orbit.ContainerHost

sealed interface SignInContract {

    interface ViewModel : ContainerHost<UIState, SideEffect> {
        fun onEventDispatcher(intent: Intent)
    }

    interface UIState {
        object Error:UIState
        object NotConnectionStat:UIState
        class Massage(var massage: String) : UIState

    }

    interface SideEffect {
        data class Toast(val message:String):SideEffect

    }

    interface Intent {
        object SmsCode:Intent
        object SignUp:Intent
        object PinCode:Intent
        data class Repo(val phone:String,val password:String):Intent
    }

    interface Direction {

        suspend fun openSignUp( phone:String)
        suspend fun openPinCode()
    }

}