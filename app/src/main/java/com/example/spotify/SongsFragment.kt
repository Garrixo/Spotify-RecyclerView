package com.example.spotify

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.icu.text.CaseMap.Title
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SongsFragment(val idPlaylist:Int) : Fragment() {
    var Titulos = mutableListOf(
        "Exitos España","Pop con Ñ", "Pop Clásico", "Today's Top Hits","Pop Internacional",
        "Flamenco Pop"
    )

    var Autores = mutableListOf(
        "Prueba","Prueba", "Prueba", "Prueba","Prueba",
        "Prueba"
    )

    var Imagenes = mutableListOf(
        "https://i.scdn.co/image/ab67706f00000002caba3d271a22a158b3cb63b4","https://i.scdn.co/image/ab67706f00000002493e37362b49e10297cb6b74", "https://i.scdn.co/image/ab67706f00000002a0d62c8e677a3d69a82ec4fa", "https://i.scdn.co/image/ab67616d0000b273674ee85ea544f17b5726c54b","https://i.scdn.co/image/ab67706f00000002ddc9dd3c97091ccc4b3fa7e0",
        "https://i.scdn.co/image/ab67706f00000003ac4cf07fc92aa7b62abb7d8b"
    )
    var nombrePlaylist:String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {


        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (idPlaylist == 0){
            nombrePlaylist = "Exitos España"
            Titulos.clear()
            Titulos.add("AHORA QUÉ")
            Titulos.add("Shakira: BZRP Music Sesion, Vol,53")
            Titulos.add("Yandel 150")

            Autores.clear()

            Autores.add("Quevedo")
            Autores.add("Bizarrap,Shakira")
            Autores.add("Yandel, Feid")


            Imagenes.clear()

            Imagenes.add("https://cdn.discordapp.com/attachments/985442052600889344/1067173368266236076/8083d7696ed5d4a291e0c0c7e2b9652e.png")
            Imagenes.add("https://cdn.discordapp.com/attachments/985442052600889344/1067173620784300032/10599633.png")
            Imagenes.add("https://cdn.discordapp.com/attachments/985442052600889344/1067173610118193242/06766c806324ecbf5b8d69a6f4aae58c.png")

        } else if (idPlaylist == 1){
            nombrePlaylist = "Pop con Ñ"
            Titulos.clear()
            Titulos.add("Shakira: BZRP Music Sesion, Vol,53")
            Titulos.add("5 SENTIOS")
            Titulos.add("ME MATA(S)")


            Autores.clear()
            Autores.add("Bizarrap, Shakira")
            Autores.add("India Martinez, Andy Rivera")
            Autores.add("Noan, Alex Wall")


            Imagenes.clear()

            Imagenes.add("https://cdn.discordapp.com/attachments/985442052600889344/1067174016617545890/10599633.png")
            Imagenes.add("https://cdn.discordapp.com/attachments/985442052600889344/1067174174226919434/eed7a84c-38f5-47eb-8bb4-acd2c5a14a29.png")
            Imagenes.add("https://cdn.discordapp.com/attachments/985442052600889344/1067174245869813781/51cKTPqut0L.png")

        } else if (idPlaylist == 2){
            nombrePlaylist = "Pop Clásico"
            Titulos.clear()
            Titulos.add("506")
            Titulos.add("Porfa no te vayas")
            Titulos.add("Quién diría")


            Autores.clear()
            Autores.add("Morat, Juanes")
            Autores.add("Beret, Morat")
            Autores.add("DePol")


            Imagenes.clear()

            Imagenes.add("https://cdn.discordapp.com/attachments/985442052600889344/1067174377612910773/Z.png")
            Imagenes.add("https://cdn.discordapp.com/attachments/985442052600889344/1067174642600640532/ab67616d0000b2734cac4c4431908529b744ec9b.png")
            Imagenes.add("https://cdn.discordapp.com/attachments/985442052600889344/1067174674863247471/Z.png")
        } else if (idPlaylist == 3){
            nombrePlaylist = "Today's Top Hits"

            Titulos.clear()
            Titulos.add("Flowers")
            Titulos.add("Kill Bill")
            Titulos.add("Creepin'(with The Weeknd & 21 Savage)")


            Autores.clear()
            Autores.add("Miley Cyrus")
            Autores.add("SZA")
            Autores.add("Metro Boomin, The Weeknd, 21 Savage")


            Imagenes.clear()
            Imagenes.add("https://cdn.discordapp.com/attachments/985442052600889344/1067175065499750540/ab67616d0000b273f429549123dbe8552764ba1d.png")
            Imagenes.add("https://cdn.discordapp.com/attachments/985442052600889344/1067175427283636405/SZA-1.png")
            Imagenes.add("https://cdn.discordapp.com/attachments/985442052600889344/1067175458434719824/3d4aa285b052f6933fdf6a23e2f3626a.png")
        } else if (idPlaylist == 4){
            nombrePlaylist = "Pop Internacional"

            Titulos.clear()
            Titulos.add("SANP")
            Titulos.add("Calm Down(with Selena Gomez)")
            Titulos.add("As it was")
            Titulos.add("Another Love")

            Autores.clear()
            Autores.add("Rosa Linn")
            Autores.add("Rema, Selena Gome")
            Autores.add("Harry Styles")
            Autores.add("Tom Odell")

            Imagenes.clear()
            Imagenes.add("https://cdn.discordapp.com/attachments/985442052600889344/1067175731500695642/ab67616d0000b2731391b1fdb63da53e5b112224.png")
            Imagenes.add("https://cdn.discordapp.com/attachments/985442052600889344/1067176039933030480/maxresdefault.png")
            Imagenes.add("https://cdn.discordapp.com/attachments/985442052600889344/1067176284943290428/01653041095.png")
            Imagenes.add("https://cdn.discordapp.com/attachments/985442052600889344/1067180476583915580/ab67616d0000b2731917a0f3f4152622a040913f.png")
        } else if (idPlaylist == 5){
            nombrePlaylist = "Flamenco Pop"

            Titulos.clear()
            Titulos.add("Corazón de Melón")
            Titulos.add("Las Cosas Pequeñitas")
            Titulos.add("Me Encanta(feat. Daviles de Novelda)")


            Autores.clear()
            Autores.add("Marta Santos")
            Autores.add("Marta Santos")
            Autores.add("Nyno Vargas, Daviles de Novelda")

            Imagenes.clear()

            Imagenes.add("https://cdn.discordapp.com/attachments/985442052600889344/1067176420385751220/maxresdefault.png")
            Imagenes.add("https://cdn.discordapp.com/attachments/985442052600889344/1067176551927521320/ab67616d0000b273ece18c124b6d6e8ca75521da.png")
            Imagenes.add("https://cdn.discordapp.com/attachments/985442052600889344/1067176655342272532/ab67616d0000b27371665c99173c446ce577d840.png")
        }


        val actionBar = (activity as AppCompatActivity).supportActionBar
        val inflater = LayoutInflater.from(context)
        val customView = inflater.inflate(R.layout.action_bar_title, null)
        val textView = customView.findViewById<TextView>(R.id.action_bar_title)
        textView.text = nombrePlaylist
        actionBar?.setBackgroundDrawable(
            ColorDrawable(Color.parseColor("#282828"))
        )
        actionBar?.setCustomView(customView)
        actionBar?.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM)
        Log.i("PruebadeFuego","llega aqui y la variable nombrePlaylist es: $nombrePlaylist")


        val view = inflater.inflate(R.layout.fragment_songs, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view_songs)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = MyAdapterSongs(Titulos,Autores ,Imagenes){


            Log.v("miapp", "Pulso mediante el listener ")
        }
        return view

    }


}