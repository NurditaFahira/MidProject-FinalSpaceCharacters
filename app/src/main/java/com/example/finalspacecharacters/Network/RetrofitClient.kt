package com.example.finalspacecharacters.Network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    val url_base = "https://finalspaceapi.com/"

    val instance : api by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(url_base)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(api::class.java)
    }
}