package com.example.myalifmobi.di

import com.example.myalifmobi.presintation.auth.signin.SignInContract
import com.example.myalifmobi.presintation.auth.signin.SingInDirection
import com.example.myalifmobi.presintation.auth.singUp.SignUpContract
import com.example.myalifmobi.presintation.auth.singUp.SignUpDirection
import com.example.myalifmobi.presintation.pay.PayContract
import com.example.myalifmobi.presintation.pay.PayDirection
import com.example.myalifmobi.presintation.splash.SplashContract
import com.example.myalifmobi.presintation.splash.SplashDirection
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent



@Module
@InstallIn(SingletonComponent::class)
interface DirectionModule {
    @Binds
    fun bindSplashDirection(direction: SplashDirection): SplashContract.Direction

    @Binds
    fun bindSigInDirection(direction: SingInDirection): SignInContract.Direction

    @Binds
    fun bindSingUpDirection(direction:SignUpDirection):SignUpContract.Direction

    @Binds
    fun bindPayDirection(direction:PayDirection):PayContract.Direction
}