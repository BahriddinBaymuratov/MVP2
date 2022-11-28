package com.example.mvp2.presenter

import com.example.mvp2.model.Image

interface MainView {
    fun apiImagesSuccess(images: List<Image>)
    fun apiImageFailure(error: String)
}