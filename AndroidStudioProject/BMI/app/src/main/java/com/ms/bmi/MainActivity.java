package com.ms.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText edtWeight, edtHeightFt, edtHeightIn;
        Button btnCalculate;
        TextView txtResult;
        LinearLayout llMain;

        edtWeight = findViewById(R.id.edtWeight);
        edtHeightFt = findViewById(R.id.edtHeightFt);
        edtHeightIn = findViewById(R.id.edtHeightIn);
        btnCalculate = findViewById(R.id.btnCalculate);
        txtResult = findViewById(R.id.txtResult);
        llMain = findViewById(R.id.llMain);


        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt = Integer.parseInt(edtWeight.getText().toString());
                int ft = Integer.parseInt(edtHeightFt.getText().toString());
                int  inch = Integer.parseInt(edtHeightIn.getText().toString());


                int totalIn = ft*12 + inch;

                double totalCm = totalIn*2.53;
                double totalMtr = totalCm/100;

                double bmi = wt/(totalMtr*totalMtr);
                if(bmi > 25){
                    txtResult.setText("You are over weighted");
                    llMain.setBackgroundColor(getResources().getColor(R.color.over_wt));

                }
                else if (bmi < 18){
                    txtResult.setText("You are under weighted");
                    llMain.setBackgroundColor(getResources().getColor(R.color.under_wt));
                }
                else
                {
                    txtResult.setText("You are healthy");
                    llMain.setBackgroundColor(getResources().getColor(R.color.healthy));

                }
            }
        });
    }
}