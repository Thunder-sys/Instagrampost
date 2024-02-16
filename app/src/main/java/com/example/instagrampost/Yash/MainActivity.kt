package com.example.instagrampost.Yash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import com.example.instagrampost.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Declare List
        var listvirr=findViewById<ListView>(R.id.listvieer)

        var myadapti=MyAdapterInsta(this,getMyDataop())


        listvirr.adapter=myadapti

    }

    private fun getMyDataop(): ArrayList<MyInstaModel> {
        var list=ArrayList<MyInstaModel>()
        var myuser1=MyInstaModel(R.drawable.images2,R.drawable.images2,"My First User","Ham Vatan","230 likes","277 comments","120","2 days ago")
        var myuser2=MyInstaModel(R.drawable.images2,R.drawable.images2,"My First User","Ham Vatan","230 likes","277 comments","120","2 days ago")
        var myuser3=MyInstaModel(R.drawable.images2,R.drawable.images2,"My First User","Ham Vatan","230 likes","277 comments","120","2 days ago")
        var myuser4=MyInstaModel(R.drawable.images2,R.drawable.images2,"My First User","Ham Vatan","230 likes","277 comments","120","2 days ago")
        var myuser5=MyInstaModel(R.drawable.images2,R.drawable.images2,"My First User","Ham Vatan","230 likes","277 comments","120","2 days ago")
        var myuser6=MyInstaModel(R.drawable.images2,R.drawable.images2,"My First User","Ham Vatan","230 likes","277 comments","120","2 days ago")
        var myuser7=MyInstaModel(R.drawable.images2,R.drawable.images2,"My First User","Ham Vatan","230 likes","277 comments","120","2 days ago")

        list.add(myuser1)
        list.add(myuser2)
        list.add(myuser4)
        list.add(myuser3)
        list.add(myuser5)
        list.add(myuser6)
        list.add(myuser7)
        return list

    }
}