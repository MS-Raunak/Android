package com.ms.sendbundle_data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnNext;
        // store button id in btnNext variable created by Button Object
        btnNext = findViewById(R.id.btnNext);

        Intent iNext; // Intent is a navigation method

        // Navigate action from mainActivity to nextActivity
        iNext = new Intent(MainActivity.this, nextActivity.class);
        iNext.putExtra("title", "Home");
        iNext.putExtra("studentName", "Rahul");
        iNext.putExtra("rollNo", 10);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(iNext);  // start activity
            }
        });
    }
}