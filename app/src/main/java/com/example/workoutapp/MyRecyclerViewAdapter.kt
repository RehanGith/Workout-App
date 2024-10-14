package com.example.workoutapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MyRecyclerViewAdapter(var list: ArrayList<ListViewModel>):
    RecyclerView.Adapter<MyRecyclerViewAdapter.MyRecyclerViewViewHolder>() {

    class MyRecyclerViewViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var name: TextView
        var description: TextView
        init {
            name = view.findViewById<TextView>(R.id.tvName)
            description = view.findViewById(R.id.tvDesc)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyRecyclerViewViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_resycler_view, parent, false)
        return MyRecyclerViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyRecyclerViewViewHolder, position: Int) {
        var item:ListViewModel = list[position]
        holder.name.text = item.title
        holder.description.text = item.desc
    }
}