package com.example.spotify

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MyAdapterSongs(private val Titulos: List<String>, private val Autor: List<String>, private val Imagenes: List<String>, val function:(Int) -> Unit) : RecyclerView.Adapter<MyAdapterSongs.MainViewHolder>() {

    var liked =  false

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.canciones, parent, false)
        return MainViewHolder(v)

    }
    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val aut = Autor.get(position)
        val tit = Titulos.get(position)
        val img = Imagenes.get(position)
        tit?.let { holder.bindItems(it,aut,img) }

        var btLike = holder.v.findViewById<ImageView>(R.id.btLike)

        btLike.setOnClickListener {
            if (!liked) {
                btLike.setImageResource(R.drawable.dark_like)
                liked = true
            } else {
                btLike.setImageResource(R.drawable.light_like)
                liked = false
            }
        }
    }
    override fun getItemCount(): Int {
        return Titulos.size
    }
    inner class MainViewHolder(var v: View) : RecyclerView.ViewHolder(v) {
        fun bindItems(tit: String, aut:String, img:String) {
            v.findViewById<TextView>(R.id.txtTituloCancion).text = tit
            v.findViewById<TextView>(R.id.txtAutor).text = aut

            Picasso.get().setLoggingEnabled(true)
            Picasso.get().load(img).into(v.findViewById<ImageView>(R.id.imgDisco));
        }
    }
}