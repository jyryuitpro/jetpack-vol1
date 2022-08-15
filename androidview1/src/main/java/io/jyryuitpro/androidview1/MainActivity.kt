package io.jyryuitpro.androidview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

// findViewById
// Kotlin Extensions
    // 성능이슈

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val btn1: Button = findViewById(R.id.btn1)
//        val btn2: Button = findViewById(R.id.btn2)
//        val btn3: Button = findViewById(R.id.btn3)

//        btn1.text = "abcd"
//        btn2.text = "abcd"
//        btn3.text = "abcd"

        // Kotlin Extentions
        btn1.text = "abcd"
        btn2.text = "abcd"
        btn3.text = "abcd"

        // java.lang.NullPointerException: Attempt to invoke virtual method 'void android.widget.Button.setText(java.lang.CharSequence)' on a null object reference
        // secondBtn.text = "abcd"
    }
}