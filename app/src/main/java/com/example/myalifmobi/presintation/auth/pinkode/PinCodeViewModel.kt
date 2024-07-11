package com.example.myalifmobi.presintation.auth.pinkode

import androidx.lifecycle.ViewModel
import com.example.myalifmobi.utils.NetworkStatusValidator
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

class PinCodeViewModel @Inject constructor(private val direction : PinCodeDirection,
    private val networkStatusValidator: NetworkStatusValidator):PinCodeContract.ViewModel,
    ViewModel() {
    override fun onEventDispatcher(intent: PinCodeContract.Intent) = intent{
        when(intent){
            PinCodeContract.Intent.OpenMainScreen ->{
                if (networkStatusValidator.hasNetwork){
                    direction.openManiScreen {

                    }
                }
            }
        }
    }

    override val container= container<PinCodeContract.UIState, PinCodeContract.SideEffect>(PinCodeContract.UIState.Massage("error"))
}