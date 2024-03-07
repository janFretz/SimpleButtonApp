package com.example.simplebuttonapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.simplebuttonapp.databinding.ActivityProductBinding

class ProductActivity : ComponentActivity() {

    private lateinit var binding: ActivityProductBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProductBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}