package com.example.cookingmama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cookingmama.databinding.ActivityLoginBinding
import com.example.cookingmama.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding:ActivityLoginBinding
    private lateinit var firebaseAuth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseAuth = FirebaseAuth.getInstance()

        val buttonClick = findViewById<Button>(R.id.signUp_button)
        buttonClick.setOnClickListener {
            val intent = Intent(this, ListingActivity::class.java)
            startActivity(intent)


        }
    }
}