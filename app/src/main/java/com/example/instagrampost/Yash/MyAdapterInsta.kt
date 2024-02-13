package com.example.instagrampost.Yash

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.getSystemService
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.instagrampost.R

class MyAdapterInsta(var context: Activity,var myitem:ArrayList<MyInstaModel>):BaseAdapter() {
    override fun getCount(): Int {
        return myitem.size
    }

    override fun getItem(position: Int): Any {
        return myitem[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View?
        var viewHolder:ViewHolder?


        if (convertView==null){
            var myinflaot=context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view=myinflaot.inflate(R.layout.activity_kunal_instagram_page,null)
            viewHolder=ViewHolder(view)
            view?.tag =viewHolder
        }else{
            view=convertView
            viewHolder=view.tag as ViewHolder
        }
        var myitem=myitem[position]
        viewHolder.myinlogo?.setImageResource(myitem.imglogo)
        viewHolder.myinimage?.setImageResource(myitem.mainimg)
        viewHolder.myusername?.text=myitem.username
        viewHolder.mymusic?.text=myitem.song
        viewHolder.klike?.text=myitem.like
        viewHolder.commentt?.text=myitem.comment
        viewHolder.comment?.text=myitem.committime
        viewHolder.daysd?.text=myitem.commtime

        return view as View
    }
    private class ViewHolder(row:View){
        var myinlogo=row.findViewById<ImageView>(R.id.kulogo)
        var myinimage=row.findViewById<ImageView>(R.id.kunal_reel_image)
        var myusername=row.findViewById<TextView>(R.id.Kunal_username)
        var mymusic=row.findViewById<TextView>(R.id.kunal_music)
        var klike=row.findViewById<TextView>(R.id.kunal_like_count)
        var commentt=row.findViewById<TextView>(R.id.kunal_commet_show_text)
        var comment=row.findViewById<TextView>(R.id.kunal_commet_count)
        var daysd=row.findViewById<TextView>(R.id.kunal_image_days)
    }
}