package com.example.cookingmama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)




        val buttonClick = findViewById<Button>(R.id.login_button)
        buttonClick.setOnClickListener {
            val intent = Intent(this, ListingActivity::class.java)
            startActivity(intent)
        }
    }
}