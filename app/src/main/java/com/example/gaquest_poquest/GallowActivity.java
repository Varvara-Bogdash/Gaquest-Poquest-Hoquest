package com.example.gaquest_poquest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;

public class GallowActivity extends AppCompatActivity {
TextView textView;
int variantOfButton;
     int countAdKe;
     int countImp;
     int countKru;
     int countChit;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallow);
        textView = findViewById(R.id.textView3);
        variantOfButton = Integer.parseInt(Objects.requireNonNull(getIntent().getExtras()).getString("variantOfButton"));
        countAdKe = Integer.parseInt(Objects.requireNonNull(getIntent().getExtras()).getString("countClickAdKe"));
        countImp = Integer.parseInt(Objects.requireNonNull(getIntent().getExtras()).getString("countClickImp"));
        countKru = Integer.parseInt(Objects.requireNonNull(getIntent().getExtras()).getString("countClickKru"));
        countChit = Integer.parseInt(Objects.requireNonNull(getIntent().getExtras()).getString("countClickChit"));
        switch (variantOfButton){
    case 1: textView.setText("Оборонительное заклинание"); break;
    case 2: textView.setText("Круцио"); break;
    case 3: textView.setText("Империус"); break;
    case 4: textView.setText("Адава кедавра"); break;
}
    }

    public void missLevel(View view) {
        Intent intent = new Intent(this, FinishActivity.class);
        intent.putExtra("variantOfButton", variantOfButton);
        intent.putExtra("countClickKru", countKru);
        intent.putExtra("countClickAdKe", countAdKe);
        intent.putExtra("countClickImp", countImp);
        intent.putExtra("countClickChit", countChit);
        startActivity(intent);

    }
}