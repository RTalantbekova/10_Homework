package com.example.l10_homework

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class HorizontalAdapter (private val array : ArrayList<String>) : RecyclerView.Adapter<ViewHolderHV>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderHV {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_horizontal, parent, false)
        val holder = ViewHolderHV(view)
        return holder
    }

    override fun getItemCount(): Int {
        return array.size
    }

    override fun onBindViewHolder(holder: ViewHolderHV, position: Int) {
        val item = array[position]
        holder.bind(item)
    }
}

class VerticalAdapter (private val array : ArrayList<PhotoList>) : RecyclerView.Adapter<ViewHolderVertical>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderVertical {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_vertical, parent, false)
        val holder = ViewHolderVertical(view)
        return holder
    }

    override fun getItemCount(): Int {
        return array.size
    }

    override fun onBindViewHolder(holder: ViewHolderVertical, position: Int) {
        val item = array[position]
        holder.bind(item)
    }

}