package com.example.photoloader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    private lateinit var image:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image = findViewById(R.id.imageView)

        loadImage()

    }

    private fun loadImage() {
        Glide
            .with(this)
            .load("https://i.dummyjson.com/data/products/30/2.jpg")
            .into(image)
    }

}