package com.ms.sendbundle_data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class nextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);


        Intent fromActivityMain;
        fromActivityMain = getIntent();
        String title = fromActivityMain.getStringExtra("title");
        String studentName = fromActivityMain.getStringExtra("studentName");
        int rollNo = fromActivityMain.getIntExtra("rollNo", 0);

        TextView studentInfo;
        studentInfo = findViewById(R.id.studentInfo);
        studentInfo.setText("Roll No: " +rollNo + ", Name: " +studentName);
        getSupportActionBar().setTitle(title);

    }
}