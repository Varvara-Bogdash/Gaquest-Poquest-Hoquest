package com.example.gaquest_poquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Objects;

public class EndActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        int countClickAdKe = Integer.parseInt(Objects.requireNonNull(getIntent().getExtras()).getString("countClickAdKe"));
        int countClickImp = Integer.parseInt(Objects.requireNonNull(getIntent().getExtras()).getString("countClickImp"));
        int countClickKru = Integer.parseInt(Objects.requireNonNull(getIntent().getExtras()).getString("countClickKru"));
        int countClickChit = Integer.parseInt(Objects.requireNonNull(getIntent().getExtras()).getString("countClickChit"));
        int variantOfButton = Integer.parseInt(Objects.requireNonNull(getIntent().getExtras()).getString("variantOfButton"));

    }

    public void start(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}