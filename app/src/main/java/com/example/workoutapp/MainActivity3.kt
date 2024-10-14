package com.example.workoutapp

import android.os.Bundle
import android.widget.Adapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity3 : AppCompatActivity() {

    lateinit var adapter: MyRecyclerViewAdapter
    lateinit var view: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        view = findViewById<RecyclerView>(R.id.RecyclerView)
        view.layoutManager = GridLayoutManager(this, 2)
        AdapterInit()

    }
    fun AdapterInit() {
        adapter = MyRecyclerViewAdapter(getList())
        view.adapter = adapter

    }
    fun getList() : ArrayList<ListViewModel> {
        var items =  ArrayList<ListViewModel>()
        items.add(ListViewModel("Title 1" , "Description 1"))
        items.add(ListViewModel("Title 2" , "Description 2"))
        items.add(ListViewModel("Title 3" , "Description 3"))
        items.add(ListViewModel("Title 4" , "Description 4"))
        return items


    }
}