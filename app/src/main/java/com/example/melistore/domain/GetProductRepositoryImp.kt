package com.example.melistore.domain

import com.example.melistore.datasource.RestDataSource
import com.example.melistore.model.Products
import com.example.melistore.repository.GetProductListRepository
import javax.inject.Inject

class GetProductRepositoryImp @Inject constructor(
    private val dataSource: RestDataSource
) : GetProductListRepository  {
    override suspend fun getListProduct(): List<Products> {
        return dataSource.getProductList()
    }
}