package com.jesslyntjiang.android.footballclub

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import org.jetbrains.anko.startActivity
import kotlinx.android.synthetic.main.item_list.view.*

class RecyclerViewAdapter (private val context: Context, private val items: List<Clubs>, private val listener : (Clubs) -> Unit )
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position], listener)
    }

    override fun getItemCount(): Int = items.size


    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){


        fun bindItem(items : Clubs, listener : (Clubs) -> Unit){
            itemView.name.text = items.name
            Glide.with(itemView.context).load(items.image).into(itemView.image)


            itemView.setOnClickListener{
                itemView.context.startActivity<DetailClubs>("image" to items.image,"name" to items.name,  "desc" to items.desc)
                listener(items)
            }
        }
    }
}