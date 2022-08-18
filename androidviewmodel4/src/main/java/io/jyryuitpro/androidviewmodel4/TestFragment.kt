package io.jyryuitpro.androidviewmodel4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import io.jyryuitpro.androidviewmodel4.databinding.FragmentTestBinding

class TestFragment : Fragment() {

    private lateinit var binding: FragmentTestBinding
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_test, container, false)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_test, container, false)

        binding.fragmentTest.text = viewModel.getCount().toString()

        return binding.root
    }
}