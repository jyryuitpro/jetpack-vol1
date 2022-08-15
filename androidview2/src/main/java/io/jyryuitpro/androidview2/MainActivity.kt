package io.jyryuitpro.androidview2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.jyryuitpro.androidview2.databinding.ActivityMainBinding

// ViewBinding
    // Activity
    // Fragment
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.testText.text = "이거는 변경된 텍스트"
        binding.testText.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}