package com.example.myalifmobi.presintation.auth.smsCode

import android.content.Intent
import com.example.myalifmobi.presintation.auth.singUp.SignUpContract
import org.orbitmvi.orbit.ContainerHost

sealed interface SmsCodeContract {

    interface ViewModel:ContainerHost<UIState,SideEffect>{
        fun onEventDispatcher(intent: Intent)
    }


    interface UIState{
        object NotConnection:UIState
        object Error:UIState
        class Massage(val massage: String) : UIState
    }
    interface SideEffect{
        data class Toast(val massage:String):SideEffect
    }
    interface Intent{
        object OpenPinCOde:Intent
    }

    interface Direction{

        suspend fun openMain(open:()->Unit)
    }
}