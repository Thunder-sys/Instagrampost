package com.example.instagrampost.ShakshiInsta

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.instagrampost.R
import com.example.instagrampost.Yash.MyAdapterInsta

class s_ins_Adapterclass(var context: Context,var sitem:ArrayList<s_ins_modelclass>):BaseAdapter() {
    override fun getCount(): Int {
        return sitem.size
    }

    override fun getItem(position: Int): Any {
        return sitem[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View?
        var viewHolder: ViewHolder?


        if (convertView == null) {
            var myinflaot =
                context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = myinflaot.inflate(R.layout.s_i_itemview, null)
            viewHolder = ViewHolder(view)
            view?.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        var sitemm = sitem[position]
        viewHolder.img?.setImageResource(sitemm.i_imag)
        viewHolder.imag?.setImageResource(sitemm.i_mainimg)
        viewHolder.comment?.text = sitemm.i_ncomm
        viewHolder.like?.text = sitemm.i_nlik
        viewHolder.wiew?.text = sitemm.i_nview

        return view as View
    }


    private class ViewHolder(row:View){
        var img=row.findViewById<ImageView>(R.id.profile)
        var imag=row.findViewById<ImageView>(R.id.Image)
        var comment=row.findViewById<TextView>(R.id.ncomment)
        var like=row.findViewById<TextView>(R.id.ncomment)
        var wiew=row.findViewById<TextView>(R.id.view)
    }



   }