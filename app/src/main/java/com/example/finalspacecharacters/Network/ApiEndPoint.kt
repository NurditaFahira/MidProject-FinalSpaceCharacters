package com.example.finalspacecharacters.Network

import com.example.finalspacecharacters.DataKarakter
import retrofit2.Call
import retrofit2.http.GET

interface api {

    @GET("api/v0/character")
    fun getDataKarakter() : Call<DataKarakter>

}