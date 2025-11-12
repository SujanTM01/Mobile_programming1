package com.example.faculty_form;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CalculationActivity extends AppCompatActivity {
    EditText num1, num2;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        btnSubmit = findViewById(R.id.btnSubmit);

        SharedPreferences prefs = getSharedPreferences("MyData", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        btnSubmit.setOnClickListener(v -> {
            try {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int sum = n1 + n2;

                editor.putInt("calculated_value", sum);
                editor.apply();
                finish(); // return to main screen
            } catch (Exception e) {
                Toast.makeText(this, "Please enter valid numbers!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
