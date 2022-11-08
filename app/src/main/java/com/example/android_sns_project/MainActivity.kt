package com.example.android_sns_project

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_sns_project.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private val Fragment_1 = 1
    val binding = ActivityMainBinding.inflate(layoutInflater)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        //setContentView(R.layout.activity_main)
    }


}