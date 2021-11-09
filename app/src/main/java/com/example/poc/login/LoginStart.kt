package com.example.poc.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.poc.R


class LoginStart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_start)
        supportActionBar?.hide();

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this, SeconLogin::class.java)
            startActivity(intent)
        }
    }
}