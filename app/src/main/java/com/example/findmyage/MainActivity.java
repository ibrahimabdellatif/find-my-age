package com.example.findmyage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
EditText year;
EditText day;
EditText month;
TextView tvShowAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        year= (EditText)findViewById(R.id.atDOB);
        month = (EditText) findViewById(R.id.month);
        day = (EditText)findViewById(R.id.day);
        tvShowAge = (TextView)findViewById(R.id.tvShowAge);
    }

    public void buFindAge(View view) {
        int year1 = Integer.parseInt(year.getText().toString());
        int month1 = Integer.parseInt(month.getText().toString());
        int day1 = Integer.parseInt(day.getText().toString());
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month2 = calendar.get(Calendar.MONTH);
        int day2 = calendar.get(Calendar.DAY_OF_MONTH);
        int month3 = Math.abs(month2 - month1);
        int day3 = Math.abs(day2 - day1);
        int year2 = Math.abs(year - year1);
        tvShowAge.setText("Congratulations Your Age Is :\n "+ year2 +" Years\n And " + month3 + " Months\n And " + day3 + " Days" );
    }
}