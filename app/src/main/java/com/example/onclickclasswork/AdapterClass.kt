package com.example.onclickclasswork

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.itemsvalues.view.*

class AdapterClass(private var recycleItems: List<MemberClass>, val clickListener: onClick):
    RecyclerView.Adapter<AdapterClass.adapterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapterViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.itemsvalues,parent, false)
        return adapterViewHolder(itemView)
    }

    override fun getItemCount() = recycleItems.size

    override fun onBindViewHolder(holder: adapterViewHolder, position: Int) {
        holder.initialClick(recycleItems.get(position), clickListener)

    }

    inner class adapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var holdImages : ImageView = itemView.iv_myImages
        var holdText : TextView = itemView.tv_title

        fun initialClick(data: MemberClass, action: onClick){
            holdImages.setImageResource(data.myImages)
            holdText.text = data.title

           itemView.setOnClickListener{
               action.click(data)
           }
        }
    }

    interface onClick{
        fun click(data: MemberClass)

    }

}