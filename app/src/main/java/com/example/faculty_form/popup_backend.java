package com.example.faculty_form;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class popup_backend extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_menu);

        txt1 = findViewById(R.id.popup1);

        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMenu(view);
            }
        });
    }

    public void showMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.getMenuInflater().inflate(R.menu.sujan_dai, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        if (item.getItemId() == R.id.edit12) {
            txt1.setText("Edit clicked");
            return true;
        } else if (item.getItemId() == R.id.Del1) {
            txt1.setText("Delete clicked");
            return true;
        } else if (item.getItemId() == R.id.cpy1) {
            txt1.setText("Copy clicked");
            return true;
        }
        return false;
    }
}
