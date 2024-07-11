package com.example.myalifmobi.presintation.auth.singUp

import org.orbitmvi.orbit.ContainerHost

sealed interface SignUpContract {
    interface ViewModel:ContainerHost<UIState,SideEffect>{
        fun onEventDispatcher(intent:Intent)

    }
    interface UIState{
        object Error:UIState
        object NotConnection:UIState
        class Massage(var massage: String) : UIState

    }
    interface SideEffect{
        data class Toast(var massage:String):SideEffect

    }
    interface Intent{

        class OpenSmsCode(var phone:String,var password:String,var firstName:String,var lastName:String,var bronData:String,var gendr:String):Intent
    }
  sealed  interface Direction{
        suspend fun openPinCode(phone:String)
    }

}