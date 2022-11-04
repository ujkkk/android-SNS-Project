package com.example.android_sns_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_sns_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding = ActivityMainBinding.inflate(layoutInflater)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        //setContentView(R.layout.activity_main)
    }
}