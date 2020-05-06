package com.developers.mvpsample.ui.main

interface MainMvpPresenter<V : MainView> : Presenter<V> {

    fun searchMovieQuery(query: String, key: String)

}