package com.example.instagrampost.KunalAdhiraInsta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.instagrampost.R

class KunalInsta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kunal_insta)
        val mylist = findViewById<ListView>(R.id.kunal_listview)
        val myapti = kunal_instagram_adapterclass(this,Get_kunal_data_list())

        mylist.adapter=myapti
    }

    private fun Get_kunal_data_list(): ArrayList<kunal_instagram_modleclass> {
        val list = ArrayList<kunal_instagram_modleclass>()
        val page1 = kunal_instagram_modleclass(R.drawable.images2,"page 1","page 1",R.drawable.imag3,"238","op","100","2")
        val page2 = kunal_instagram_modleclass(R.drawable.images4,"page 2","page 2",R.drawable.images5,"238","op","100","2")
        val page3 = kunal_instagram_modleclass(R.drawable.imag6,"page 3","page 3",R.drawable.imag7,"238","op","100","2")
        val page4 = kunal_instagram_modleclass(R.drawable.image8,"page 4","page 4",R.drawable.image9,"238","op","100","2")
        val page5 = kunal_instagram_modleclass(R.drawable.imag10,"page 5","page 5",R.drawable.images11,"238","op","100","2")
        val page6 = kunal_instagram_modleclass(R.drawable.imag7,"page 6","page 6",R.drawable.imag19,"238","op","100","2")
        val page7 = kunal_instagram_modleclass(R.drawable.images2,"page 7","page 7",R.drawable.imag17,"238","op","100","2")
        val page8 = kunal_instagram_modleclass(R.drawable.image9,"page 8","page 8",R.drawable.imag16,"238","op","100","2")
        val page9 = kunal_instagram_modleclass(R.drawable.imag3,"page 9","page 9",R.drawable.image8,"238","op","100","2")

        list.add(page1)
        list.add(page2)
        list.add(page3)
        list.add(page4)
        list.add(page5)
        list.add(page6)
        list.add(page7)
        list.add(page8)
        list.add(page9)

        return list

    }
}