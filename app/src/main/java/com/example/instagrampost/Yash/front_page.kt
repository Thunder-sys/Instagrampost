package com.example.instagrampost.Yash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.instagrampost.KhushiInsta.KhushiInsta
import com.example.instagrampost.KunalAdhiraInsta.KunalInsta
import com.example.instagrampost.R
import com.example.instagrampost.ShakshiInsta.ShakshiInsta

class front_page : AppCompatActivity() {
    lateinit var shakshi:Button
    lateinit var khushi:Button
    lateinit var kunal:Button
    lateinit var yash:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_front_page)

        shakshi = findViewById(R.id.shakshi)
        khushi = findViewById(R.id.Khushi)
        kunal = findViewById(R.id.Kunal)
        yash = findViewById(R.id.Yash)

        shakshi.setOnClickListener(){
            var intent = Intent(this,ShakshiInsta::class.java)
            startActivity(intent)
        }
        khushi.setOnClickListener(){
            var intent = Intent(this,KhushiInsta::class.java)
            startActivity(intent)
        }
        kunal.setOnClickListener(){
            var intent = Intent(this,KunalInsta::class.java)
            startActivity(intent)
        }
        yash.setOnClickListener(){
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}