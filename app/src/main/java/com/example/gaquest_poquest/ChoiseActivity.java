package com.example.gaquest_poquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Objects;

public class ChoiseActivity extends AppCompatActivity {
int variantOfButton;
int countAdKe;
int countImp;
int countKru;
int countChit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choise);
        countAdKe = getIntent().getExtras().getInt("countClickAdKe");
        countImp = getIntent().getExtras().getInt("countClickImp");
        countKru = getIntent().getExtras().getInt("countClickKru");
        countChit = getIntent().getExtras().getInt("countClickChit");
    }

    public void addChit(View view) {
        variantOfButton = 1;
        Intent intent = new Intent(this, FinishActivity.class);
        intent.putExtra("variantOfButton", variantOfButton);
        intent.putExtra("countClickKru", countKru);
        intent.putExtra("countClickAdKe", countAdKe);
        intent.putExtra("countClickImp", countImp);
        intent.putExtra("countClickChit", countChit);
        startActivity(intent);
    }

    public void miss(View view) {
        Intent intent = new Intent(this, GallowActivity.class);
        startActivity(intent);

    }

    public void addKru(View view) {
        variantOfButton = 2;
        Intent intent = new Intent(this, GallowActivity.class);
        intent.putExtra("variantOfButton", variantOfButton);
        startActivity(intent);

    }

    public void addImp(View view) {
        variantOfButton = 3;
        Intent intent = new Intent(this, GallowActivity.class);
        intent.putExtra("variantOfButton", variantOfButton);
        startActivity(intent);

    }

    public void addAdKe(View view) {
        variantOfButton = 4;
        Intent intent = new Intent(this, FinishActivity.class);
        intent.putExtra("variantOfButton", variantOfButton);
        startActivity(intent);

    }
}