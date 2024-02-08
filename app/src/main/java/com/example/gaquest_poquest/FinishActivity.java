package com.example.gaquest_poquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Objects;

public class FinishActivity extends AppCompatActivity {
    private int variantOfButton;
    private int countClickAdKe;
    private int countClickImp;
    private int countClickKru;
    private int countClickChit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        variantOfButton = Integer.parseInt(Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).getString("variantOfButton")));
        countClickAdKe = Integer.parseInt(Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).getString("countClickAdKe")));
        countClickImp = Integer.parseInt(Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).getString("countClickImp")));
        countClickKru = Integer.parseInt(Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).getString("countClickKru")));
        countClickChit = Integer.parseInt(Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).getString("countClickChit")));

    }

    public void start(View view) {
        Intent intent = new Intent(this, FinishFightActivity.class);
        intent.putExtra("variantOfButton", variantOfButton);
        intent.putExtra("countClickKru", countClickKru);
        intent.putExtra("countClickAdKe", countClickAdKe);
        intent.putExtra("countClickImp", countClickImp);
        intent.putExtra("countClickChit", countClickChit);
        startActivity(intent);
    }
}