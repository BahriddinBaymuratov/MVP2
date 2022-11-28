package com.example.mvp2.presenter

import com.example.mvp2.mapper.toImage
import com.example.mvp2.model.ImageDTO
import com.example.mvp2.network.RetroInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPresenterImpl(private val mainView: MainView) : MainPresenter {
    override fun getAllImages(page: Int, perPage: Int) {
        RetroInstance.retroInstance().getAllImages(page, perPage)
            .enqueue(object : Callback<ImageDTO> {
                override fun onResponse(call: Call<ImageDTO>, response: Response<ImageDTO>) {
                    if (response.isSuccessful) {
                        val photos = response.body()?.photos?.map { it.toImage() }
                        mainView.apiImagesSuccess(photos!!)
                    }
                }
                override fun onFailure(call: Call<ImageDTO>, t: Throwable) {
                    mainView.apiImageFailure(t.message!!)
                }
            })
    }
}