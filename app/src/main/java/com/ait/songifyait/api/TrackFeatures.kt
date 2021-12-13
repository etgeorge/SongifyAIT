package com.ait.songifyait.api

import com.ait.songifyait.data.AudioFeatures
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path


interface TrackFeatures {
    @GET("audio-features/{id}")
    fun getTrackFeatures(@Header("Authorization") token: String?,
                         @Path("id") id: String?): Call<AudioFeatures>

}