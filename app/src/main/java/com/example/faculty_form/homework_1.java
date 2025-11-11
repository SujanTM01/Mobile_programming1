package com.example.faculty_form;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class homework_1 extends Activity {
    Button btn1;   EditText num1Edit, num2Edit;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework_1);
        btn1 = findViewById(R.id.click_button1);
        num1Edit = findViewById(R.id.num1);
        num2Edit = findViewById(R.id.num2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1, num2;
                num1 = Integer.parseInt(num1Edit.getText().toString());
                num2 = Integer.parseInt(num2Edit.getText().toString());
//
                Toast.makeText(getApplicationContext(),"Data successfully pass",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(homework_1.this, homework_2.class);
                intent.putExtra("num1",num1);
                intent.putExtra("num2",num2);
                startActivity(intent);

            }
        });
    }
}
