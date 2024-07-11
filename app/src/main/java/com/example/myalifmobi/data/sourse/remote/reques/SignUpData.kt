package com.example.myalifmobi.data.sourse.remote.reques

import com.google.gson.annotations.SerializedName

data class SignUpData(
    @SerializedName("phone") val phone: String,
    @SerializedName("password") val password: String,
    @SerializedName("first-name") val firstname: String,
    @SerializedName("last-name") val lastname: String,
    @SerializedName("born-date") val bornData: String,
    @SerializedName("gender") val gender: String
)

/**
 *   "phone": "+998993946280",
 *     "password": "qwerty",
 *     "first-name": "Muhammadali",
 *     "last-name": "Rahimberganov",
 *     "born-date": "969822000000",
 *     "gender": "0"
 */











