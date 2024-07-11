package com.example.myalifmobi.presintation.auth.singUp

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myalifmobi.damin.AppRepository
import com.example.myalifmobi.data.sourse.remote.reques.SignUpData
import com.example.myalifmobi.utils.NetworkStatusValidator
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.viewmodel.container
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val direction: SignUpDirection,
    private val repository: AppRepository,
    private val networkStatusValidator: NetworkStatusValidator
) : SignUpContract.ViewModel, ViewModel() {


    @SuppressLint("BinaryOperationInTimber")
    override fun onEventDispatcher(intent: SignUpContract.Intent) = intent {
        when (intent) {
            is SignUpContract.Intent.OpenSmsCode -> {
                if (networkStatusValidator.hasNetwork) {
                    repository.signUp(
                        SignUpData(
                            phone = intent.phone,
                            password = intent.password,
                            firstname = intent.firstName,
                            lastname = intent.lastName,
                            bornData = intent.bronData,
                            gender = intent.gendr
                        )
                    )
                        .onEach { it ->
                            it.onSuccess {
                                direction.openPinCode(intent.phone)
                            }.onFailure { it ->
                                Timber.tag("TTT").d("response message -> " + it.message)
                                Timber.tag("TTT").d("response messaage ->" + it.message)
                            }
                        }.launchIn(viewModelScope)
                }
            }
        }
    }

    override val container = container<SignUpContract.UIState, SignUpContract.SideEffect>(
        SignUpContract.UIState.Massage("Error")
    )
}