package io.jyryuitpro.androidlivedata1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.MutableLiveData

// LiveData
// 데이터를 관찰해줄 수 있는 친구(LifeCycle과 결합해서)
class MainActivity : AppCompatActivity() {

    private var testMutableLiveData = MutableLiveData(0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnArea).setOnClickListener {
            testMutableLiveData.value = testMutableLiveData.value!!.plus(1)
        }

        // 관찰
        testMutableLiveData.observe(this, {
            Log.d("testMutableLiveData", testMutableLiveData.value.toString())
            findViewById<TextView>(R.id.textArea).text = testMutableLiveData.value.toString()
        })
    }
}