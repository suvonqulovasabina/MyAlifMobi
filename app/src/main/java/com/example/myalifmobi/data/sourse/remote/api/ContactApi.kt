package com.example.myalifmobi.data.sourse.remote.api

import com.example.myalifmobi.data.sourse.remote.reques.SignInData
import com.example.myalifmobi.data.sourse.remote.reques.SignUpData
import com.example.myalifmobi.data.sourse.remote.respons.MyToken
import com.example.myalifmobi.presintation.auth.singUp.SignUp
import kotlinx.coroutines.flow.Flow
import okhttp3.Response
import retrofit2.http.Body
import retrofit2.http.POST


interface ContactApi {

    @POST("v1/auth/sign-up")
    suspend fun signUp(@Body data: SignUpData): retrofit2.Response<MyToken>



    @POST("/v1/auth/sign-in")
    suspend fun signIn(@Body data: SignInData): retrofit2.Response<MyToken>

}