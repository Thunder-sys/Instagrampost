package com.example.instagrampost.ShakshiInsta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.instagrampost.R

class ShakshiInsta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shakshi_insta)

        var inlist=findViewById<ListView>(R.id.mlist)

        var inadapter=s_ins_Adapterclass(this,getMyData())
        inlist.adapter=inadapter
    }

    private fun getMyData(): ArrayList<s_ins_modelclass> {
        var inslist=ArrayList<s_ins_modelclass>()
        var i1=s_ins_modelclass(R.drawable.download1,"super",R.drawable.download1)
        var i2=s_ins_modelclass(R.drawable.download1,"super",R.drawable.imag18)
        var i3=s_ins_modelclass(R.drawable.download1,"super",R.drawable.images4)
        var i4=s_ins_modelclass(R.drawable.download1,"super",R.drawable.images2)

        inslist.add(i1)
        inslist.add(i2)
        inslist.add(i3)
        inslist.add(i4)
        return inslist

    }


}