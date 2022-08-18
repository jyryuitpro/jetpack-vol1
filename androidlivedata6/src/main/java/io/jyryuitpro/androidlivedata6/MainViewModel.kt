package io.jyryuitpro.androidlivedata6

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    // Transformations
    
    private var _mutableCount = MutableLiveData(0)
    val liveCount: LiveData<Int>
        get() = _mutableCount

    fun setLiveDataValue(count: Int) {
        _mutableCount.value = count
    }
}