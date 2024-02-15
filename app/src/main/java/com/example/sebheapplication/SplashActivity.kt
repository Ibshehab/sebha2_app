package com.example.myislamicappppp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.sebha_app.HomeActivity
 import com.example.sebheapplication.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
  lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

 Handler(mainLooper).postDelayed({
            val intent=Intent(this@SplashActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()

        },3000)
    }
}