package com.example.recyclerview_calender

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/*
class MyAdapter3 {

}*/
private class MyAdapter3(data: Array<String>) : RecyclerView.Adapter<MyAdapter3.holder?>() {
    //1 and 5 alt + ent
    var data: Array<String> //2 and 3 generate gatter setter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): holder { //6
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.row_list, parent, false)
        return holder(view)
    }

    override fun onBindViewHolder(holder: holder, position: Int) { //7
        holder.textView.text = data[position]
    }

    override fun getItemCount(): Int { //8
        return data.size
    }

    internal inner class holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //4
        var textView: TextView

        init {
            textView = itemView.findViewById(R.id.row_tv) //rowxml
        }
    }

    init { //3
        this.data = data
    }
}