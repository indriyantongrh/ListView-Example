package com.example.dicoding_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar

class Catalog : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalog)

        if (supportActionBar != null){
            (supportActionBar as ActionBar).title = "Google Pixel"
        }


    }
}
