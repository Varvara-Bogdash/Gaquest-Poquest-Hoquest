package com.example.gaquest_poquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Objects;

public class StartActivity1 extends AppCompatActivity {
String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start1);
    }

    public void start(View view) {
        name = Objects.requireNonNull(getIntent().getExtras()).getString("name");
        Intent intent = new Intent(this, LevelActivity1.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }
}