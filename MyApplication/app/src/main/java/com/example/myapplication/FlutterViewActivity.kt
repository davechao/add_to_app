package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_flutter_view.*

class FlutterViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flutter_view)

        val layoutManager = LinearLayoutManager(this)
        val myAdapter = MyAdapter()
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = myAdapter
    }
}