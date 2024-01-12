package com.ms.basicsyntax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnAdd.setOnClickListener {
            if(edtId1.text.toString() != "" && !edtId2.text.toString().equals("")){
                val num1 = edtId1.text.toString().toInt()
                val num2 = edtId2.text.toString().toInt()

                val sum = num1+num2
                Toast.makeText(this, "Sum is: $sum", Toast.LENGTH_LONG)
                txtSum.text = "Sum is: $sum"
            }

        }


    }
}