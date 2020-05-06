package com.developers.mvpsample.ui.main

interface Presenter<V>{

    fun attachView(view:V)

    fun detachView()

}