package com.example.faculty_form;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class lab6_popup_backend extends AppCompatActivity {
    TextView txt12;
    SharedPreferences prefs;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab6_popup);

        txt12 = findViewById(R.id.popup43);
        prefs = getSharedPreferences("MyData", MODE_PRIVATE);

        txt12.setOnClickListener(v -> showPopupMenu());
    }

    private void showPopupMenu() {
        PopupMenu popupMenu = new PopupMenu(this, txt12);
        popupMenu.getMenuInflater().inflate(R.menu.lab6_menu, popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(item -> {
            int id = item.getItemId();

            if (id == R.id.cal1) {
                Intent intent = new Intent(lab6_popup_backend.this, CalculationActivity.class);
                startActivity(intent);
            } else if (id == R.id.otp1) {
                Intent intent = new Intent(lab6_popup_backend.this, lab6_popup_output.class);
                startActivity(intent);
            }
            return true;
        });

        popupMenu.show();
    }
}
