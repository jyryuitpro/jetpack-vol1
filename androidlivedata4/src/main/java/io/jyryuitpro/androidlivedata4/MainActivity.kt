package io.jyryuitpro.androidlivedata4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import io.jyryuitpro.androidlivedata4.databinding.ActivityMainBinding

// Fragment LiveData / viewLifecyclerOwner

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        binding.btn1.setOnClickListener {
            val transaction1 = manager.beginTransaction()
            val fragment1 = BlankFragment1()
            transaction1.replace(R.id.framArea, fragment1)
            transaction1.addToBackStack(null)
            transaction1.commit()
        }

        binding.btn2.setOnClickListener {
            val transaction2 = manager.beginTransaction()
            val fragment2 = BlankFragment2()
            transaction2.replace(R.id.framArea, fragment2)
            transaction2.addToBackStack(null)
            transaction2.commit()
        }
    }
}