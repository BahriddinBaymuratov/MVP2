package com.example.mvp2.presenter

import android.graphics.pdf.PdfDocument

interface MainPresenter {
    fun getAllImages(page: Int = 1, perPage: Int = 50)
}