package com.udacity.shoestore.screens.shoelist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoeViewModel : ViewModel() {

    private val _shoes = MutableLiveData<MutableList<Shoe>>()
    val shoes : LiveData<MutableList<Shoe>>
        get() = _shoes

    init {
        _shoes.value = mutableListOf()
    }

    fun addShoe(shoe: Shoe) {
        val currentList = _shoes.value ?: mutableListOf()
        currentList.add(shoe)
        _shoes.value = currentList
    }

    override fun onCleared() {
        super.onCleared()
    }
}