package com.example.myalifmobi.presintation.pay

import com.example.myalifmobi.data.sourse.remote.reques.AlifLacation
import org.orbitmvi.orbit.ContainerHost

sealed interface PayContract {
    interface ViewModel: ContainerHost<UIState, SideEffect> {
        fun onEventDispatcher(intent: Intent)
    }


    interface UIState{
        object NotConnection:UIState
        object Error:UIState
        class Massage(val massage: String) : UIState
    }
    interface SideEffect{
        data class Toast(val massage:String):SideEffect
        data class BottomSheet(val alifLacation: AlifLacation):SideEffect
    }
    interface Intent{
        class OpenPinCOde( val alifLacation: AlifLacation) : Intent
    }

    interface Direction{

        suspend fun openMain(alifLacation: AlifLacation)
    }


}