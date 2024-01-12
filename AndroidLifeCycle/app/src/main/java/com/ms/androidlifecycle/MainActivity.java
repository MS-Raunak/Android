package com.ms.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("My Test Application", "In onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("My Test Application", "In onStart");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("My Test Application", "In onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("My Test Application", "In onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("My Test Application", "In onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("My Test Application", "In onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("My Test Application", "In onRestart");
    }
}