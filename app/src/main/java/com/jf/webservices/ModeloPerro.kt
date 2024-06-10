package com.jf.webservices

import com.google.gson.annotations.SerializedName

data class ModeloPerro (
    @SerializedName("status") var status: String,
    @SerializedName("message") var images: List<String>,
)