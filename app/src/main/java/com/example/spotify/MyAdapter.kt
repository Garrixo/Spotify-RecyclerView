package com.example.spotify

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MyAdapter(private val Titulos: List<String>, private val seguidores: List<String>,private val imagenes: List<String>, val function:(Int) -> Unit) : RecyclerView.Adapter<MyAdapter.MainViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.playlist, parent, false)
        return MainViewHolder(v)
    }
    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val seg = seguidores.get(position)
        val tit = Titulos.get(position)
        val img = imagenes.get(position)
        tit?.let { holder.bindItems(it,seg,img) }


        holder.itemView.setOnClickListener{
            function(position)
        }
    }
    override fun getItemCount(): Int {
        return Titulos.size
    }
    inner class MainViewHolder(var v: View) : RecyclerView.ViewHolder(v) {
        fun bindItems(tit: String, seg:String, img:String) {
            v.findViewById<TextView>(R.id.txtTitulo).text = tit
            v.findViewById<TextView>(R.id.txtSeguidores).text = seg
            Picasso.get().setLoggingEnabled(true)
            Picasso.get().load(img).into(v.findViewById<ImageView>(R.id.myImg));
        }
    }
}