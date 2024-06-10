package com.jf.webservices

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class DogViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val ivDog = view.findViewById<ImageView>(R.id.ivDog)

    fun bind(image:String){
        Picasso.get().load(image).into(ivDog)
    }
}