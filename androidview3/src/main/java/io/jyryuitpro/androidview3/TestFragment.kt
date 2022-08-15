package io.jyryuitpro.androidview3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import io.jyryuitpro.androidview3.databinding.FragmentTestBinding

class TestFragment : Fragment() {

    lateinit var binding: FragmentTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_test, container, false)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_test, container, false)
        binding.fragmentText.text = "변경된 텍스트"
        return binding.root
    }
}