package com.ms.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnNextS;
        btnNextS = findViewById(R.id.btnNextS);

        Intent iNextS;
        iNextS = new Intent(secondActivity.this, thirdActivity.class);

        btnNextS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(iNextS);

            }
        });
    }
}