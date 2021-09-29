package edu.temple.androidlabsubmission_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //create ArrayList of images to be used
        val images: ArrayList<ImageObject> = setDataInList()

        //instantiate custom adapter
        val adapter = ImageAdapter(images)
        //instantiate a GridLayoutManager, span 2
        val gridLayout =GridLayoutManager(this,2)
        //set the GridLayoutManager to the recycerView
        my_recyclerView.layoutManager = gridLayout
        //set the adapter to the recyclerView
        my_recyclerView.adapter = adapter
    }

    public fun View.OnClickListener(){


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