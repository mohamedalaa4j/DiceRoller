package com.mohamedalaa4j.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mohamedalaa4j.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnRoll?.text = "Let's Roll"
    }

    override fun onDestroy() {
        super.onDestroy()

        //A clean way to avoid memory leaks
        binding = null
    }
}