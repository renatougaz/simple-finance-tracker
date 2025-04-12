package com.renatougaz.simplefinancetracker.ui.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DetailsViewModel : ViewModel() {

    val floatInputString = MutableLiveData<String>().apply {
        value = "" // Initial value
    }

    // Backing property for the processed float value
    private val _processedValue = MutableLiveData<Float>().apply {
        value = 0.0f
    }
    // Public immutable LiveData for the processed float value
    val processedValue: LiveData<Float> = _processedValue



    fun processInput() {
        // Attempt to convert the input string to a Float
        val inputValue = floatInputString.value?.toFloatOrNull() ?: 0.0f
        // Perform some calculation (example: add 10)
        _processedValue.value = inputValue + 10
        // At this point, floatInputString's value remains as the user entered it.
    }
//    private val _currentWorth = MutableLiveData<Float>().apply {
//        value = 0.0f
//    }
//    val currentWorth: LiveData<Float> = _currentWorth
}