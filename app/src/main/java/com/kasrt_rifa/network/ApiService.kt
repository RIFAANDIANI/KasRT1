package com.kasrt_rifa.network

import com.kasrt_rifa.model.ResponseUser
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET(".")
    fun getUsers(): Call<ResponseUser>
    @GET(".")
    fun getPemanfaatan(): Call<ResponseUser>

}