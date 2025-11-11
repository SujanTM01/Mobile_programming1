package com.example.faculty_form;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class context_menu_backend extends AppCompatActivity {
    TextView txt12;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contex_menu);
        txt12 = findViewById(R.id.context_menu1);
        registerForContextMenu(txt12);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.sujan_dai,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
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
