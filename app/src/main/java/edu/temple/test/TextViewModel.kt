package edu.temple.test

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextViewModel : ViewModel() {
    private val selectedSize : MutableLiveData<Float> by lazy {
        MutableLiveData<Float>()
    }

    fun getSize () : LiveData<Float> {
        return selectedSize
    }

    fun setSize (size: Float) {
        selectedSize.value = size
    }
}