package com.example.mvp2.network

import com.example.mvp2.model.ImageDTO
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiService {

    @Headers("Authorization: 563492ad6f91700001000001dc912faa4865445694b8ccc566067984")
    @GET("v1/curated")
    fun getAllImages(
        @Query("page") page: Int = 1,
        @Query("per_page") perPage: Int = 50
    ) :Call<ImageDTO>
}