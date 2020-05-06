package com.developers.mvpsample.data

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiInterface {

    @GET("movie")
    fun searchMovies(@Query("api_key") key: String,
                     @Query("query") query: String): Observable<MovieResult>

}