package com.triare.p061basketballscorecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var countA = 0
    var countB = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textPointA = findViewById<TextView>(R.id.txtPoint)
        val textPointB = findViewById<TextView>(R.id.txtPoint1)

        val buttonPointA1 = findViewById<Button>(R.id.btnPointA1)
        val buttonPointA2 = findViewById<Button>(R.id.btnPointA2)
        val buttonPointA3 = findViewById<Button>(R.id.btnPointA3)
        val buttonPointB1 = findViewById<Button>(R.id.btnPointB1)
        val buttonPointB2 = findViewById<Button>(R.id.btnPointB2)
        val buttonPointB3 = findViewById<Button>(R.id.btnPointB3)

        val buttonReset = findViewById<Button>(R.id.reset)

        buttonPointA1.setOnClickListener{
            countA += 1
            textPointA.text = countA.toString()}
        buttonPointA2.setOnClickListener{
            countA += 2
            textPointA.text = countA.toString()
        }
        buttonPointA3.setOnClickListener{
            countA += 3
            textPointA.text = countA.toString() }
        buttonPointB1.setOnClickListener{
            countB += 1
            textPointB.text = countB.toString()}
        buttonPointB2.setOnClickListener{
            countB += 2
            textPointB.text = countB.toString() }
        buttonPointB3.setOnClickListener{
            countB += 3
            textPointB.text = countB.toString()}

        buttonReset.setOnClickListener{
            countA = 0
            textPointA.text = countA.toString()
            countB = 0
            textPointB.text = countB.toString()}


    }


}