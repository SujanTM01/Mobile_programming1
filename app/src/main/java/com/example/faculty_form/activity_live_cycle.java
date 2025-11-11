package com.example.faculty_form;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class activity_live_cycle extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class_one);
        Log.d("cycle test","Activity create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("cycle test","Activity create");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("cycle test","Activity create");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("cycle test","Activity create");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("cycle test","Activity create");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("cycle test","Activity create");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("cycle test","Activity create");

    }
}
