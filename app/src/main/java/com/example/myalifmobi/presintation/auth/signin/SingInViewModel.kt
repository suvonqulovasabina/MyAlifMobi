package com.example.myalifmobi.presintation.auth.signin

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myalifmobi.damin.AppRepository
import com.example.myalifmobi.data.sourse.remote.reques.SignInData
import com.example.myalifmobi.utils.NetworkStatusValidator
import com.example.myalifmobi.utils.navigation.AppNavigator
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject
@HiltViewModel
class  SingInViewModel @Inject constructor(
    private val direction: SingInDirection,
  private val networkStatusValidator: NetworkStatusValidator,
    private val appRepository: AppRepository
   ):SignInContract.ViewModel, ViewModel(){
    override fun onEventDispatcher(intent: SignInContract.Intent) = intent {
        when(intent){
         is SignInContract.Intent.Repo->{
             if (networkStatusValidator.hasNetwork){
                 appRepository.signIn(SignInData(intent.phone,intent.password)).onEach {
                     it.onSuccess {
                         direction.openPinCode()
                     }.onFailure {
                     }
                 }.launchIn(viewModelScope)

             }
          }
            SignInContract.Intent.SmsCode->{
                if (networkStatusValidator.hasNetwork){

                }
            }
            SignInContract.Intent.SignUp ->{
                if (networkStatusValidator.hasNetwork){
                    direction.openSignUp("s")
                }
            }
        }
    }

    override val container = container<SignInContract.UIState, SignInContract.SideEffect>(SignInContract.UIState.Massage("Error"))
}