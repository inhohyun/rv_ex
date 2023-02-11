package com.inhohyun.jetpack_ex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RVAdapter(val items: MutableList<String>) : RecyclerView.Adapter<RVAdapter.ViewHolder>() {







    //
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItens(items[position]) //아이템 뷰바인딩

    }

    //전체 리사이클러뷰의 갯수
    override fun getItemCount(): Int {
        return items.size
    }



    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){


        fun bindItens(item : String){
            val rv_text = itemView.findViewById<TextView>(R.id.rvItem)
            rv_text.text = item
        }
    }

}