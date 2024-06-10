package com.jf.webservices

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Url

interface APIService {
    @GET
    suspend fun obtenerPerros(@Url url:String): Response<ModeloPerro>
}