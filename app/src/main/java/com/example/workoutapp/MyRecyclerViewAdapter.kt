package com.example.workoutapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MyRecyclerViewAdapter:
    RecyclerView.Adapter<MyRecyclerViewAdapter.MyRecyclerViewViewHolder>() {

    class MyRecyclerViewViewHolder(view: View): RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyRecyclerViewViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_resycler_view, parent, false)
        return MyRecyclerViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: MyRecyclerViewViewHolder, position: Int) {

    }
}