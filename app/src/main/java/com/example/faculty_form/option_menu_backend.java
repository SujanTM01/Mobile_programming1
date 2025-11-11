package com.example.faculty_form;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class option_menu_backend extends AppCompatActivity {
    TextView txt1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_menu);
        txt1 = findViewById(R.id.txtV1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.sujan_dai,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.edit12){
            Toast.makeText(getApplicationContext(),"Edit clicked!!",Toast.LENGTH_SHORT).show();
        } else if (id==R.id.Del1) {
            Toast.makeText(getApplicationContext(),"Delete clicked!!",Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(getApplicationContext(),"copy clicked",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
