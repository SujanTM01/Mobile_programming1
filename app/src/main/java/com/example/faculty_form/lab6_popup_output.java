package com.example.faculty_form;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class lab6_popup_output extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab6_popup_output);
        txt = findViewById(R.id.lab6_pop1);
        SharedPreferences prefs = getSharedPreferences("MyData",MODE_PRIVATE);
        int result = prefs.getInt("calculated_value",-1);
        if (result != -1) {
            txt.setText(String.valueOf(result));
        } else {
            txt.setText("No calculation found!");
        }
    }
}
