package com.example.melistore.datasource

import com.example.melistore.model.Products
import retrofit2.http.GET

interface RestDataSource {
    @GET("sites/MCO")
    suspend fun getProductList(): List<Products>

}