package com.example.session5

import android.app.Activity
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

lateinit var data : UserData
class  Adapter(val list : List<Int>, val act: Activity) : RecyclerView.Adapter<Adapter.VH>() {
    class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.itemView.setOnClickListener {
            data = list[position]
            val intent = Intent(act, MainActivity::class.java)
            act.startActivity(intent)

            holder.itemView.setOnClickListener {
                val inyent = Intent(act,MainActivity::class.java)
                act.startActivity(intent)
            }
        }
    }
}