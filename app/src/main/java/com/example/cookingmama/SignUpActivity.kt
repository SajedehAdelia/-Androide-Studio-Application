package com.example.cookingmama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.cookingmama.databinding.ActivityLoginBinding
import com.example.cookingmama.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding:ActivitySignUpBinding
    private lateinit var firebaseAuth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseAuth = FirebaseAuth.getInstance()


        binding.textView.setOnClickListener{
            val intent = Intent( this, LoginActivity::class.java)
            startActivity(intent)
        }
        binding.button.setOnClickListener{
            val email = binding.emailET.text.toString()
            val pass = binding.passET.text.toString()
            val confirmPass = binding.confirmPassET.text.toString()

            if(email.isNotEmpty() && pass.isNotEmpty() && confirmPass.inNotEmpty()){
                if(pass == confirmPass){

                    firebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener{

                        if(it.isSuccessful){
                            val intent = Intent( this, LoginActivity::class.java)
                            startActivity(intent)
                        }else{
                            Toast.makeText(this, it.exception.toString() , Toast.LENGTH_SHORT).show()

                        }
                    }
                } else{
                    Toast.makeText(this, "password is not matching" , Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "Empty Fields are not allowed !!" , Toast.LENGTH_SHORT).show()

            }

        }
    }
}