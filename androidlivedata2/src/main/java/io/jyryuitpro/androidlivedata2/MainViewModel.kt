package io.jyryuitpro.androidlivedata2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var testMutableLiveData = MutableLiveData(0)

    // MutableLiveData <-> LiveData

    fun plusLiveDataValue() {
        testMutableLiveData.value = testMutableLiveData.value!!.plus(1)
    }
}