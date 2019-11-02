package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val redButton = findViewById<TextView>(R.id.red_button)
        val greenButton = findViewById<TextView>(R.id.green_button)
        val yellowButton = findViewById<TextView>(R.id.yellow_button)
        val r1 = findViewById<TextView>(R.id.r1)
        val r2 = findViewById<TextView>(R.id.r2)
        val r3 = findViewById<TextView>(R.id.r3)
        val r4 = findViewById<TextView>(R.id.r4)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> = listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText, rootConstraintLayout, redButton, greenButton, yellowButton, r1, r2, r3, r4)

        for (item in clickableViews) { item.setOnClickListener { makeColored(it) } }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.one)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.liyu)
            R.id.box_three_text -> view.setBackgroundResource(R.drawable.two)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.three)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.four)

            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)

            R.id.r1 -> view.setBackgroundResource(random())
            R.id.r2 -> view.setBackgroundResource(random())
            R.id.r3 -> view.setBackgroundResource(random())
            R.id.r4 -> view.setBackgroundResource(random())

            else -> view.setBackgroundResource(R.drawable.bg)
        }
    }

    private fun random() : Int {
        val randomInt = (1..6).random()

        val random = when  (randomInt) {
            1 -> R.color.my_green
            2 -> R.color.my_orange
            3 -> R.color.my_yellow
            4 -> R.color.my_blue
            5 -> R.color.my_purple
            else -> R.color.my_red
        }

        return random
    }
}
