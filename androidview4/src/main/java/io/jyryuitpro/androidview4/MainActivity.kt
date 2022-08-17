package io.jyryuitpro.androidview4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import io.jyryuitpro.androidview4.databinding.ActivityMainBinding

// DataBinding
// 이름처럼, 뭔가 데이터를 어쩌고 저쩌고 해줄 수 없을까?(연결)
// 핵심: 데이터 결합
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var testCount = 34

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // 기존의 방법
        // binding.test.text = "바뀐 텍스트"

        // 데이터 결합
        val person = Person("류지영", 34)
        binding.user = person
    }

    fun myClick(view: View) {
        Log.d("MainActivity", "onClick")
        testCount++
        val person = Person("류지영", testCount)
        binding.user = person
    }
}