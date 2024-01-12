package com.ms.intentpassing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        iNext.setOnClickListener(){
            val iNext = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(iNext)
        }
    }
}