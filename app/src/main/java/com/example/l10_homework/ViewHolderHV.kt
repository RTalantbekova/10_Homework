package com.example.l10_homework

import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_horizontal.view.*
import kotlinx.android.synthetic.main.rv_vertical.view.*

class ViewHolderHV(view: View) : RecyclerView.ViewHolder(view) {
    fun bind (item : String) {
        itemView.text.text = item
    }
}

class ViewHolderVertical(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(item: PhotoList) {
        itemView.tvName.text = item.name
        itemView.tvVersion.text = item.version
        itemView.etDate.text = item.date
        itemView.imgBigAndr.setImageDrawable(ContextCompat.getDrawable(itemView.context, item.imageSh))
    }
}