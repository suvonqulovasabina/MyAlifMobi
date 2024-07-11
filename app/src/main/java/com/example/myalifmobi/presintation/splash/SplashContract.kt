package com.example.myalifmobi.presintation.splash

import org.orbitmvi.orbit.ContainerHost

sealed interface SplashContract {
    interface ViewModel : ContainerHost<UIState, SideEffect> {
        fun onEvenDispatcher(intent: Intent)
    }


    interface UIState {
        object Error : UIState
        object EmptyState : UIState
        object NotConnectionState : UIState
        class Massage(var massage: String) : UIState

    }

    interface SideEffect {
        data class Toast(val massage: String) : SideEffect
    }

    interface Intent {
        object SingIn : Intent
        object PinCode : Intent
        object Pay:Intent
    }

    interface Direction {
        suspend fun openSingIn(open: () -> Unit)
        suspend fun openPinCode(open: () -> Unit)

    }

    suspend fun openSingIn(open: () -> Unit)
    suspend fun openPinCode(open: () -> Unit)
}