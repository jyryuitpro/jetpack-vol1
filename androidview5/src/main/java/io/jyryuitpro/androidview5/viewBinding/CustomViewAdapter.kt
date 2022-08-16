package io.jyryuitpro.androidview5.viewBinding

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.jyryuitpro.androidview5.databinding.TextRowItemBinding

class CustomViewAdapter(private val dataSet: ArrayList<String>) : RecyclerView.Adapter<CustomViewAdapter.ViewHolder>() {

    class ViewHolder(binding: TextRowItemBinding) : RecyclerView.ViewHolder(binding.root) {

        val myText: TextView = binding.myText
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = TextRowItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.myText.text = dataSet[position]
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}