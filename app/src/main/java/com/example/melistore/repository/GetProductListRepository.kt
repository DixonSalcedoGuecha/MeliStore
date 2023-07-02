package com.example.melistore.repository

import androidx.lifecycle.LiveData
import com.example.melistore.model.Products

interface GetProductListRepository {
    suspend fun getListProduct(): List<Products>
}