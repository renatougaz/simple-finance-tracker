package com.example.simplefinancetracker.ui.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DetailsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text


    private val _currentDebt = MutableLiveData<Float>().apply {
        value = 0.0f
    }
    val currentDebt: LiveData<Float> = _currentDebt
}