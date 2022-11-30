package com.example.cookingmama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException

class ListingActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listing)
    }

    val client = OkHttpClient()

    val request = Request.Builder()
        .url("https://api.spoonacular.com/recipes/random?number=30")
        .get()
        .build()

    val response = client.newCall(request).execute()

}
