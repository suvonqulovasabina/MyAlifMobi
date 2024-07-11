package com.example.myalifmobi.damin

import com.example.myalifmobi.data.sourse.remote.reques.SignInData
import com.example.myalifmobi.data.sourse.remote.reques.SignUpData
import com.example.myalifmobi.data.sourse.remote.respons.MyToken
import com.example.myalifmobi.data.sourse.remote.respons.SingInToken
import com.example.myalifmobi.presintation.auth.signin.SignIn
import com.example.myalifmobi.presintation.auth.singUp.SignUp
import kotlinx.coroutines.flow.Flow

interface AppRepository {

    fun signUp(data: SignUpData):Flow<Result<MyToken>>
    fun signIn(data:SignInData):Flow<Result<MyToken>>


}