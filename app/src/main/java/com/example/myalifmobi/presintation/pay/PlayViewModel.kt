package com.example.myalifmobi.presintation.pay

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.postSideEffect
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
class   PlayViewModel @Inject constructor(private val direction: PayDirection) :
    PayContract.ViewModel, ViewModel() {

    override fun onEventDispatcher(intent: PayContract.Intent) = intent {
        when (intent) {
            is PayContract.Intent.OpenPinCOde -> {
                postSideEffect(PayContract.SideEffect.BottomSheet(intent.alifLacation))
            }
        }
    }

    override val container =
        container<PayContract.UIState, PayContract.SideEffect>(PayContract.UIState.Massage("error"))

}