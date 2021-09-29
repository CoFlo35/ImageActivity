package edu.temple.androidlabsubmission_3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(val items:ArrayList<ImageObject>):RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    //Inflate the view to be places into the RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.grid_item_view,parent,false)
        return ViewHolder(view)
    }

    //Bind the image Resource and Description from the specified index of the ArrayList to the
    //specified picture on the layout
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(items.get(position).resourceID)
        holder.description = items.get(position).description

    }

    //simply return the number of items of the ArrayList of images
    override fun getItemCount(): Int {
        return items.size
    }

    //create the ViewHolder to be used by the Adapter
    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val image: ImageView = itemView.findViewById(R.id.gridImageView)
        lateinit var description:String
    }
}