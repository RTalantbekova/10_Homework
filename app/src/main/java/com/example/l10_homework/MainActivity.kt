package com.example.l10_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private  var recyclerViewHr : RecyclerView? = null
    private var recyclerViewVr : RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        showHorizontal()
        showVertical()

    }

    private fun initViews(){
        recyclerViewHr = findViewById(R.id.rvItemHoriz)
        recyclerViewVr = findViewById(R.id.rvItemVertic)
    }

    private fun showHorizontal(){
        val list = arrayListOf<String>()

        for (i in 1..10){
            list.add("Mini Android $i")
        }

        val adapter = HorizontalAdapter(list)
        recyclerViewHr?.adapter = adapter
    }

    private fun showVertical(){
        val list = arrayListOf<PhotoList>()
        for (i in 10..20){
            list.add(PhotoList(R.drawable.image,"Androids $i", "Version $i", "Date 01/01/20$i"))
        }

        val adapter = VerticalAdapter(list)
        recyclerViewVr?.adapter = adapter

    }
}