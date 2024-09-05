package com.udacity.shoestore.screens.shoelist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoeListViewModel : ViewModel() {

    private val _shoeList = MutableLiveData<MutableList<Shoe>>()
    val shoeList : LiveData<MutableList<Shoe>>
        get() = _shoeList


    init {
        _shoeList.value = mutableListOf(
            Shoe("Name1", 1.0, "Nike", "Black and cool", listOf("http://www.image.com"))
        )
    }

    override fun onCleared() {
        super.onCleared()
    }
}