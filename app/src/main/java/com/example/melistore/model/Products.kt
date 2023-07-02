package com.example.melistore.model

import com.google.gson.annotations.SerializedName


data class Products(
@SerializedName("id") val id : String,
@SerializedName("name") val name : String,
@SerializedName("categories") val currency: List<Categories>
)
