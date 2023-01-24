package com.example.spotify



import android.graphics.Color
import android.graphics.drawable.ColorDrawable
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
import com.google.gson.Gson
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.nio.channels.AsynchronousFileChannel.open

class PlaylistFragment : Fragment() {

    var Titulos = listOf(
        "Exitos España","Pop con Ñ", "Pop Clásico", "Today's Top Hits","Pop Internacional",
        "Flamenco Pop"
    )

    var Seguidores = listOf(
        "2.135.132 SEGUIDORES","135.132 SEGUIDORES", "2.132 SEGUIDORES", "34.342.231 SEGUIDORES","1.635.132 SEGUIDORES",
        "6.135.132 SEGUIDORES"
    )

    var Imagenes = listOf(
        "https://i.scdn.co/image/ab67706f00000002caba3d271a22a158b3cb63b4","https://i.scdn.co/image/ab67706f00000002493e37362b49e10297cb6b74", "https://i.scdn.co/image/ab67706f00000002a0d62c8e677a3d69a82ec4fa", "https://i.scdn.co/image/ab67616d0000b273674ee85ea544f17b5726c54b","https://i.scdn.co/image/ab67706f00000002ddc9dd3c97091ccc4b3fa7e0",
        "https://i.scdn.co/image/ab67706f00000003ac4cf07fc92aa7b62abb7d8b"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        arguments?.let {
        }
    }

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MyAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?



    ): View? {

       /* val json = readJsonFromFile("spotify.json")
        val users = Gson().fromJson(json, UserResponse::class.java)
        Log.i("MainActivity", users.data.toString())*/


        val actionBar = (activity as AppCompatActivity).supportActionBar
        val inflater = LayoutInflater.from(context)
        val customView = inflater.inflate(R.layout.action_bar_title, null)
        val textView = customView.findViewById<TextView>(R.id.action_bar_title)
        textView.text = "Playlist populares"
        actionBar?.setBackgroundDrawable(
            ColorDrawable(Color.parseColor("#282828")))
        actionBar?.setCustomView(customView)
        actionBar?.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM)



        val view = inflater.inflate(R.layout.fragment_playlist, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = GridLayoutManager(context, 2)
        recyclerView.adapter = MyAdapter(Titulos,Seguidores,Imagenes){

            goToFragment(SongsFragment(it))

            Log.v("miapp", "Pulso mediante el listener ")
        }
        return view
    }

    fun goToFragment(fragment: Fragment) {
        activity?.let { it.supportFragmentManager.beginTransaction().replace(R.id.mainContainer, fragment).addToBackStack(null).commit()}
    }
}

    /*private fun readJsonFromFile(fileName: String): String {
        var json = ""
        try {
            val bufferedReader = BufferedReader(
                InputStreamReader(assets.open(fileName))
            )
            val paramsBuilder = StringBuilder()
            var line: String? = bufferedReader.readLine()
            while (line != null) {
                paramsBuilder.append(line)
                line = bufferedReader.readLine()
            }
            json = paramsBuilder.toString()
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return json
    }*/


