package io.jyryuitpro.androidview6.dataBinding

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import io.jyryuitpro.androidview6.R
import io.jyryuitpro.androidview6.databinding.TextRowItemBinding

class CustomDataAdapter(private val dataSet: ArrayList<String>) : RecyclerView.Adapter<CustomDataAdapter.ViewHolder>() {

    class ViewHolder(binding: TextRowItemBinding) : RecyclerView.ViewHolder(binding.root) {

        val myText: TextView = binding.myText
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = DataBindingUtil.inflate<TextRowItemBinding>(LayoutInflater.from(parent.context), R.layout.text_row_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.myText.text = dataSet[position]
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}