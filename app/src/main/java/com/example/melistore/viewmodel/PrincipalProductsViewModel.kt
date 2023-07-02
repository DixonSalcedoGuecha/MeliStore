package com.example.melistore.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.melistore.domain.GetProductRepositoryImp
import com.example.melistore.model.Products
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class PrincipalProductsViewModel @Inject constructor(
    val getProductRepositoryImp: GetProductRepositoryImp
) : ViewModel() {

    private val _listProduct =  MutableLiveData<List<Products>>()
    val listProduct : LiveData<List<Products>> = _listProduct


    suspend fun getProducts() {
        withContext(Dispatchers.IO) {
            _listProduct.postValue(getProductRepositoryImp.getListProduct())
        }

    }
}