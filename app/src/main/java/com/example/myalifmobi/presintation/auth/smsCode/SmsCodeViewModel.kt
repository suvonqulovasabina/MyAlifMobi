package com.example.myalifmobi.presintation.auth.smsCode

import android.content.Intent
import androidx.lifecycle.ViewModel
import com.example.myalifmobi.utils.NetworkStatusValidator
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject
@HiltViewModel
class SmsCodeViewModel @Inject constructor(private val direction: SmsCodeDirection,
    private val networkStatusValidator: NetworkStatusValidator):SmsCodeContract.ViewModel,ViewModel() {

    override fun onEventDispatcher(intent: SmsCodeContract.Intent) = intent{
        when(intent){
            SmsCodeContract.Intent.OpenPinCOde->{
                if (networkStatusValidator.hasNetwork){
                    direction.openMain {

                    }
                }
            }
        }
    }

    override val container=container<SmsCodeContract.UIState, SmsCodeContract.SideEffect>(SmsCodeContract.UIState.Massage("error"))
}