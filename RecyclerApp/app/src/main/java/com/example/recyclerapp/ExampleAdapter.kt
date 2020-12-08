package com.example.recyclerapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.example_item.view.*

class ExampleAdapter (private val exampleList:List<ExampleItem>):RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>(){
    //writing our viewholder
    class ExampleViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        //define and declare the objects in your  itemview class
        //imageView
        val imageView:ImageView=itemView.image_view
        //textview
        val textView:TextView=itemView.text_view_1
        val textView2:TextView=itemView.text_view_2
    }
//it will inflate the recycler item view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.example_item,parent,false)
        return ExampleViewHolder(itemView )
}

    //set the size of the data we expect,item recycling will stop when the list is at end
    override fun getItemCount()=exampleList.size




//bind data to the objects in your recycled item
    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
//declare our list item plus the live data class
    val currentItem=exampleList[position]

    //bind data
    // for the image
    holder.imageView.setImageResource(currentItem.imageresource)
    //for text
    holder.textView.text=(currentItem.productName)
    holder.textView2.text=(currentItem.productPrice)
}

}

