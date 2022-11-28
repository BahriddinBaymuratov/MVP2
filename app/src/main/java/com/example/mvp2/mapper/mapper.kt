package com.example.mvp2.mapper

import com.example.mvp2.model.Image
import com.example.mvp2.model.Photo

fun Photo.toImage(): Image {
    return Image(
        id = id,
        photographer = photographer,
        imageUrl = src.medium
    )
}