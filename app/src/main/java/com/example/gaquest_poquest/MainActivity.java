package com.example.gaquest_poquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void garryButton(View view) {
        String textName = "Гарри Поттер";
Intent intent = new Intent(this, StartActivity1.class);
        intent.putExtra("name", textName);
startActivity(intent);
    }

    public void ronButton(View view) {
        String textName = "Рон Уизли";
        Intent intent = new Intent(this, StartActivity1.class);
        intent.putExtra("name", textName);
        startActivity(intent);
    }

    public void germiButton(View view) {
        String textName = "Гермиона Грейнджер";
        Intent intent = new Intent(this, StartActivity1.class);
        intent.putExtra("name", textName);
        startActivity(intent);
    }
}