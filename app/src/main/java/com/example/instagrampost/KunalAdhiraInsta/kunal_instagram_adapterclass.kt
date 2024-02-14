package com.example.instagrampost.KunalAdhiraInsta

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.instagrampost.R

class kunal_instagram_adapterclass(var activity:Activity,var kunallist:ArrayList<kunal_instagram_modleclass>):BaseAdapter() {
    override fun getCount(): Int {
        return kunallist.size
    }

    override fun getItem(position: Int): Any {
        return kunallist[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View?
        var viewHolder:ViewHolder?
        if (convertView==null){
            val myinflate = activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = myinflate.inflate(R.layout.activity_kunal_instagram_page,null)
            viewHolder = ViewHolder(view)
            view?.tag = viewHolder
        }else{
            view=convertView
            viewHolder=view.tag as ViewHolder
        }
        var myitemlist = kunallist[position]
        viewHolder.logo?.setBackgroundResource(myitemlist.kunal_userimage)
        viewHolder.image?.setBackgroundResource(myitemlist.kunal_postimage)
        viewHolder.username?.setText(myitemlist.kunal_username)
        viewHolder.song?.setText(myitemlist.kunal_songname)
        viewHolder.likecount?.setText(myitemlist.kunal_likes_count)
        viewHolder.commet?.setText(myitemlist.kunal_comment)
        viewHolder.commetcount?.setText(myitemlist.kunal_comment_count)
        viewHolder.day?.setText(myitemlist.kunal_days_count)
        return view as View

    }
    private class ViewHolder(row:View){
        var username = row.findViewById<TextView>(R.id.Kunal_username)
        var song = row.findViewById<TextView>(R.id.kunal_music)
        var logo = row.findViewById<TextView>(R.id.kulogo)
        var image = row.findViewById<TextView>(R.id.kunal_reel_image)
        var likecount = row.findViewById<TextView>(R.id.kunal_like_count)
        var commet = row.findViewById<TextView>(R.id.kunal_commet_show_text)
        var commetcount = row.findViewById<TextView>(R.id.kunal_commet_count)
        var day = row.findViewById<TextView>(R.id.kunal_image_days)
    }
}