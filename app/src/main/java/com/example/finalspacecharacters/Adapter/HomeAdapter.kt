package com.example.finalspacecharacters.Adapter

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finalspacecharacters.DataKarakterItem
import com.example.finalspacecharacters.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_home.view.*

class HomeAdapter (private val lisKarakter: ArrayList<DataKarakterItem>, val listener : OnItemClickListener) : RecyclerView.Adapter<HomeAdapter.Homeholder>(){

    interface OnItemClickListener{
        fun onClick(karakter : DataKarakterItem)
    }

    class Homeholder(itemview : View) : RecyclerView.ViewHolder(itemview){
        fun bind(karakter : DataKarakterItem, listener : OnItemClickListener){
            with(itemView){

                Picasso.get()
                    .load(karakter.img_url)
                    .into(karakter_img)

                nametv.text = karakter.name
                speciestv.text = "Species : " + karakter.species

                itemView.setOnClickListener{
                    //pindah fragment
                    listener.onClick(karakter)
                }
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeAdapter.Homeholder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false)
        return Homeholder(view)
    }

    override fun onBindViewHolder(holder: Homeholder, position: Int) {
        holder.bind(lisKarakter[position], listener)

    }

    override fun getItemCount(): Int {
        return lisKarakter.size
    }

}