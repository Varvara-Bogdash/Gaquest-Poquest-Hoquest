package com.example.gaquest_poquest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Objects;

public class LevelActivity9 extends AppCompatActivity {
    String name1;
    ImageView imageView;

    @SuppressLint({"SetTextI18n", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level9);
        imageView = findViewById(R.id.imageView2);
        name1 = Objects.requireNonNull(getIntent().getExtras()).getString("name");
        if (Objects.equals(name1, "Гермиона Грейнджер")) {
            imageView.setImageResource(R.drawable.narcissa);
        } else {
            if (Objects.equals(name1, "Рон Уизли")) {
                imageView.setImageResource(R.drawable.narcissa);
            } else {
                imageView.setImageResource(R.drawable.narcissa);
            }
        }
    }

    public void startFight(View view) {
        Intent intent = new Intent(this, FightActivity9.class);
        intent.putExtra("name", name1);
        startActivity(intent);
    }
}


