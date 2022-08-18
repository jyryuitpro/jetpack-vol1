package io.jyryuitpro.androidviewmodel5

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel(num: Int) : ViewModel() {

    init {
        Log.d("MainViewModel", num.toString())
    }

    // Repository
    // 네트워크 통신을 하거나

    // Local DB
    // Room SQLite
}