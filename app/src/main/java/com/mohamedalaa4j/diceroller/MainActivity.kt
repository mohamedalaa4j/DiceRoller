package com.mohamedalaa4j.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mohamedalaa4j.diceroller.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnRoll?.text = getString(R.string.Lets_Roll)

        binding?.btnRoll?.setOnClickListener {
            rollDice()
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        //A clean way to avoid memory leaks
        binding = null
    }

    private fun rollDice() {

        val randomNumber = Random().nextInt(6) + 1
        val diceImage = when(randomNumber){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> {R.drawable.dice_6}
        }

        binding?.ivDice?.setImageResource(diceImage)
    }
}