package edu.temple.androidlabsubmission_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class ImageActivity : AppCompatActivity() {
    //val displayText = findViewById<TextView>(R.id.my_displayTextView)
    //val displayImage = findViewById<ImageView>(R.id.my_displayImageView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //create ArrayList of images to be used
        val images: ArrayList<ImageObject> = setDataInList()

        //instantiate custom adapter
        val adapter = ImageAdapter(images)
        //instantiate a GridLayoutManager, span 3
        val gridLayout =GridLayoutManager(this,3)
        //set the GridLayoutManager to the recycerView
        my_recyclerView.layoutManager = gridLayout
        //set the adapter to the recyclerView
        my_recyclerView.adapter = adapter
        //create the onclickListner for the adapter
        adapter.setOnItemClickListener(object:ImageAdapter.onItemCickListener{
            //implement methods and override to dictate what happens
            override fun onItemClick(position: Int) {
                //grab both the local Text and Image display views and change their text and resource values
                //when the user clicks on an item
                val textView = findViewById<TextView>(R.id.my_displayTextView)
                val imageView = findViewById<ImageView>(R.id.my_displayImageView)
                textView.text = images.get(position).description
                imageView.setImageResource(images.get(position).resourceID)
            }

        })
    }




    private fun setDataInList(): ArrayList<ImageObject> {
        var items: ArrayList<ImageObject> = ArrayList()

        items.add(ImageObject(R.drawable.australia, "Australia"))
        items.add(ImageObject(R.drawable.brazil, "Brazil"))
        items.add(ImageObject(R.drawable.china, "China"))
        items.add(ImageObject(R.drawable.dubai, "Dubai"))
        items.add(ImageObject(R.drawable.egypt, "Egypt"))
        items.add(ImageObject(R.drawable.france, "France"))
        items.add(ImageObject(R.drawable.india, "India"))
        items.add(ImageObject(R.drawable.italy, "Italy"))
        items.add(ImageObject(R.drawable.new_york, "New York"))
        items.add(ImageObject(R.drawable.rome, "Rome"))
        items.add(ImageObject(R.drawable.russia, "Russia"))
        return items
    }
}