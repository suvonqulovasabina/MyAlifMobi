package com.example.myalifmobi.damin

import com.example.myalifmobi.data.sourse.remote.api.ContactApi
import com.example.myalifmobi.data.sourse.remote.reques.MySharedPreference
import com.example.myalifmobi.data.sourse.remote.reques.SignInData
import com.example.myalifmobi.data.sourse.remote.reques.SignUpData
import com.example.myalifmobi.data.sourse.remote.respons.MyToken
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppRepositoryImpl @Inject constructor(private val api: ContactApi,private val mySharedPreference: MySharedPreference) : AppRepository {
    override fun signUp(data: SignUpData): Flow<Result<MyToken>> = callbackFlow {
        val result = api.signUp(data)
        if (result.isSuccessful) {
            trySend(Result.success(result.body()!!))
            mySharedPreference.setSignUp(result.body()!!.token)
        } else {

        }
        awaitClose()
    }

    override fun signIn(data: SignInData): Flow<Result<MyToken>> = callbackFlow {
        val result=api.signIn(data)
        if (result.isSuccessful){
            trySend(Result.success(result.body()!!))
            mySharedPreference.setLoginToken(result.body()!!.token)
        }
        awaitClose()
    }
}