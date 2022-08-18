package io.jyryuitpro.androidviewmodel4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import io.jyryuitpro.androidviewmodel4.databinding.ActivityMainBinding

// ViewModel -> Activity/Fragment 공유
// Why -> Activiy의 값을 Fragment에서 사용하고 싶거나
// Fragment에서 값을 ViewModel의 값으로 사용하기 위해서

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.resultArea.text = viewModel.getCount().toString()

        binding.plus.setOnClickListener {
            viewModel.plus()
            binding.resultArea.text = viewModel.getCount().toString()
        }

        binding.minus.setOnClickListener {
            binding.resultArea.text = viewModel.getCount().toString()
        }

        val manager = supportFragmentManager

        binding.showFragment.setOnClickListener {
            val transaction = manager.beginTransaction()
            val fragment = TestFragment()
            transaction.replace(R.id.frameArea, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}