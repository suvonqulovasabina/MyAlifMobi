package com.example.myalifmobi.data.sourse.remote.reques

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MySharedPreference @Inject constructor(private  var pref: SharedPreferences) {


    fun setSignUp(token: String) {
        pref.edit().putString("SuToken", token).apply()
    }

    fun getTokenSignUp(): String? = pref.getString("SuToken", "token")



    fun setLoginToken(token: String){
        pref.edit().putString("tokenLogin", token).apply()
    }
    fun getTokenLogin(): String? = pref.getString("tokenLogin", "token")



    fun setBack(data:Boolean){
        pref.edit().putBoolean("set",false).apply()
    }
    fun getBack():Boolean{
       return pref.getBoolean("set",false)
    }
}