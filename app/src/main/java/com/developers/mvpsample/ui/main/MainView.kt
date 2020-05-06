package com.developers.mvpsample.ui.main

import com.developers.mvpsample.data.Result

interface MainView {

    fun showLoading()

    fun showData(movieResult: List<Result>)

    fun showError(error: String)

    fun hideLoading()
}