package com.example.myalifmobi.presintation.auth.pinkode

import com.example.myalifmobi.presintation.auth.smsCode.SmsCodeContract
import org.orbitmvi.orbit.ContainerHost

sealed interface PinCodeContract {

interface ViewModel:ContainerHost<UIState,SideEffect>{
    fun onEventDispatcher(intent:Intent)
}

    interface UIState{
        object NotConnectionStat:UIState
        class Massage(val massage: String) : UIState
    }
    interface SideEffect{
        class Toast(massage: String):SideEffect
    }
    interface Intent{
        object OpenMainScreen:Intent
    }
    interface Direction{
        suspend fun openManiScreen(open:()->Unit)
    }
}