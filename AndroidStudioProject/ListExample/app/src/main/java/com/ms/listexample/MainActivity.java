package com.ms.listexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
//    int[] arrNo = new int[]{1,2,3,4,5}; // fixed array
    ArrayList<String> arrNames = new ArrayList<>(); // not fixed(Unlimited size array)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       listView = findViewById(R.id.listView);

        arrNames.add("Ram");
        arrNames.add("Ramesh");
        arrNames.add("Ramu");
        arrNames.add("Ranjan");
        arrNames.add("Rajan");
        arrNames.add("Rahul");
        arrNames.add("Ram");
        arrNames.add("Ramesh");
        arrNames.add("Ramu");
        arrNames.add("Ranjan");
        arrNames.add("Rajan");
        arrNames.add("Rahul");
        arrNames.add("Ram");
        arrNames.add("Ramesh");
        arrNames.add("Ramu");
        arrNames.add("Ranjan");
        arrNames.add("Rajan");
        arrNames.add("Rahul");
        arrNames.add("Ram");
        arrNames.add("Ramesh");
        arrNames.add("Ramu");
        arrNames.add("Ranjan");
        arrNames.add("Rajan");
        arrNames.add("Rahul");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrNames);
        // we can also write MyActivity.this or only this on place of getApplicationContext() in above expression
        listView.setAdapter(adapter);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
               if (position == 0)
               {
                   Toast.makeText(MainActivity.this,"Clicked on first item", Toast.LENGTH_SHORT);
               }
           }
       });

    }
}