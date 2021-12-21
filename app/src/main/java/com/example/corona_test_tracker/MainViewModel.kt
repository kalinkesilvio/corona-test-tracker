package com.example.corona_test_tracker

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _oneWayBindingValue: MutableLiveData<Int> =
        MutableLiveData(7);

    val oneWayBindingValue: LiveData<Int>
        get() = _oneWayBindingValue;
}