package com.example.myhelloapp.service

import com.example.myhelloapp.data.LoginData
import com.example.myhelloapp.respon.LoginRespon
import com.example.myhelloapp.respon.UserRespon
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface UserService {
    @GET("users")
    fun getData() : Call<List<UserRespon>>

    @DELETE("users/{id}")
    fun delete(@Path("id") id : Int) : Call<UserRespon>
}