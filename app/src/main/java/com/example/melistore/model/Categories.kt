package com.example.melistore.model

import com.google.gson.annotations.SerializedName

data class Categories(
    @SerializedName("id") val id: String,
    @SerializedName("name") val name: String
)
