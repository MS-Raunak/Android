package com.ms.spinner_or_dropdown;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    AutoCompleteTextView actxtView;

    ArrayList<String> arrIds = new ArrayList<>(); //  For Spinner
    ArrayList<String> arrLanguages = new ArrayList<>(); // For AutoComplete Text

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//     access id of spinner and AutoCompleteTextView
        spinner = findViewById(R.id.spinner);
        actxtView = findViewById(R.id.actxtView);

//        spinner
        arrIds.add("Aadhar Card");
        arrIds.add("PAN Card");
        arrIds.add("Voter ID Card");
        arrIds.add("Driving License Card");
        arrIds.add("Ration Card");
        arrIds.add("Xth Score Card");
        arrIds.add("XIIth Card");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this,  android.R.layout.simple_spinner_dropdown_item, arrIds);
        spinner.setAdapter(spinnerAdapter);


//        AutoCompleteTextView
        arrLanguages.add("C");
        arrLanguages.add("C++");
        arrLanguages.add("Java");
        arrLanguages.add("Python");
        arrLanguages.add("C#");
        arrLanguages.add("Javascript");
        arrLanguages.add("React");

        ArrayAdapter<String> autoAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrLanguages);
        actxtView.setAdapter(autoAdapter);
        actxtView.setThreshold(1);

    }
}



