package io.jyryuitpro.androidviewmodel2

import android.util.Log
import androidx.lifecycle.ViewModel

// ViewModel에서 저렇게 아래와 같이 딸랑 변수하나만 만들어서
// 사용하지는 않고 LiveData(등등)을 이용해서 함께 씀

// 아래는 예제니깐, 참고해주세요~
class MainViewModel : ViewModel() {

    var countValue = 0

    init {
        Log.d("MainViewModel", "init")
    }

    fun plus() {
        countValue++
        Log.d("MainViewModel", "$countValue")
    }

    fun minus() {
        countValue--
        Log.d("MainViewModel", countValue.toString())
    }

    fun getCount(): Int {
        return countValue
    }
}