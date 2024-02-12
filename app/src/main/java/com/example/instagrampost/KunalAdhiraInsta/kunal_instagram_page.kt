package com.example.instagrampost.KunalAdhiraInsta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.instagrampost.R

class kunal_instagram_page : AppCompatActivity() {

    lateinit var save:ImageButton
    lateinit var like:ImageButton
    lateinit var follow:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kunal_instagram_page)

        save = findViewById(R.id.kunal_savebutton)
        like = findViewById(R.id.kunal_likebutton)
        follow = findViewById(R.id.kunal_follow)


        follow.setOnClickListener(){
            var Unfollow=follow.text.toString()
            if (Unfollow=="Unfollow"){
                follow.setText("Follow")
            }
            else{
                follow.setText("Unfollow")
            }
        }
    }
}