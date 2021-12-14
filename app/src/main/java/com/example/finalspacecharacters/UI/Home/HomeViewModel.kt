package com.example.finalspacecharacters.UI.Home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.example.finalspacecharacters.Adapter.HomeAdapter
import com.example.finalspacecharacters.DataKarakter
import com.example.finalspacecharacters.DataKarakterItem
import com.example.finalspacecharacters.Network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeViewModel : ViewModel() {

    init{
        Log.d("HomeViewModel", "Created")
    }

    var listKarakter : ArrayList<DataKarakterItem> = arrayListOf()

    fun getDataFromApi(recyclerView: RecyclerView){
        RetrofitClient.instance.getDataKarakter().enqueue(object : Callback<DataKarakter>{
            override fun onResponse(call: Call<DataKarakter>, response: Response<DataKarakter>) {
                val data = response.body()

                recyclerView.adapter = HomeAdapter(data as ArrayList<DataKarakterItem>)
            }

            override fun onFailure(call: Call<DataKarakter>, t: Throwable) {
                Log.d("HomeViewModel", "onFailure")
                t.printStackTrace()
            }

        })
    }
}