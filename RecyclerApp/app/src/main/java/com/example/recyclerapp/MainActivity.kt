package com.example.recyclerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setting the list items for our recycler view
        val exampleList=generateDummylist(500)
        //setting the adapter and list that contains my recycle data
        recycler_view.adapter=ExampleAdapter(exampleList)
        //setting the layout orientation for my recycler view
        recycler_view.layoutManager=LinearLayoutManager(this)
        //setting size to data size
        recycler_view.setHasFixedSize(true)
    }
    //basically this is a function that i will use to generate item static



    private fun generateDummylist(size: Int):List<ExampleItem> {
val List= ArrayList<ExampleItem>()
    List.add(ExampleItem(R.drawable.ic_laptop_black_24dp,
    "Hp Notebook",
    "20,000KES"

        ))

        List.add(ExampleItem(
            R.drawable.ic_insert_emoticon_black_24dp,
            "EmojiApp","200KES"

        ))
        List.add(ExampleItem(R.drawable.ic_school_black_24dp,
        "Emobilis","40,000"))


    //finally return ur views
        return List
    }
}
