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

        list.add(myuser1)
        return list

    }
}