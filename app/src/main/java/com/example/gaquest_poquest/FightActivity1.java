package com.example.gaquest_poquest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class FightActivity1 extends AppCompatActivity {
ImageView imageView;
String name1;
TextView textViewHero;
TextView textViewDementor;
TextView textViewFight;
Button buttonKruc;
Button buttonImp;
Button buttonAdKe;
Button buttonChit;
int straightHero;
int healthHero;
int countOfKru;
int countOfImp;
int countOfAdKe;
int chit;
int countClick = 0;
int straightDementor = 20;
int healthDementor = 50;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight1);
        imageView = findViewById(R.id.imageView4);
        textViewDementor = findViewById(R.id.textViewDementor);
        textViewHero = findViewById(R.id.textViewHero);
        buttonKruc = findViewById(R.id.buttonKrucio);
        buttonImp = findViewById(R.id.buttonImperio);
        buttonAdKe = findViewById(R.id.buttonAdavaKedavra);
        buttonChit = findViewById(R.id.buttonChit);
        textViewFight = findViewById(R.id.textViewFight);


        name1 = Objects.requireNonNull(getIntent().getExtras()).getString("name");
        if (Objects.equals(name1, "Гермиона Грейнджер")) {
            imageView.setImageResource(R.drawable.germi_fight);
            straightHero = 80;
            healthHero = 100;
            countOfKru = 3;
            countOfAdKe = 5;
            countOfImp = 4;
            chit = 1;
            textViewHero.setText("Гермиона Грейнджер (сила - 80/100; усиления: круциатус - 3, адава кедавра - 5, империус - 4, оборонительное заклинание - 1; здоровье - 100/100;)");
        } else {
            if (Objects.equals(name1, "Рон Уизли")) {
                imageView.setImageResource(R.drawable.ron_fight);
                straightHero = 70;
                healthHero = 100;
                countOfKru = 1;
                countOfAdKe = 10;
                countOfImp = 2;
                chit = 3;
                textViewHero.setText("Рон Уизли (сила - 70/100; усиления: круциатус - 1, адава кедавра - 10, империус - 2, оборонительное заклинание - 3; здоровье - 100/100;)");
            } else {
                imageView.setImageResource(R.drawable.garry_fight);
                straightHero = 90;
                healthHero = 100;
                countOfKru = 2;
                countOfAdKe = 3;
                countOfImp = 1;
                chit = 5;
                textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - 2, адава кедавра - 3, империус - 1, оборонительное заклинание - 5; здоровье - 100/100;)");
            }
        }

    }

    @SuppressLint("SetTextI18n")
    public void krucio(View view) throws InterruptedException {
if ((countClick) == countOfKru - 1){
    buttonKruc.setEnabled(false);
    textViewFight.append("Вы применили усиление круцио. Осталось - 0 раз. ");
    healthDementor -= 10;
    textViewDementor.setText("Дементор (сила - 20/100; усиления(каждое уменьшает здоровье на 10): чует страх - 5, забирает эмоции - 5, превращается в человека - 5, оборонительное заклинание - 5; здоровье - " + healthDementor +"/100;");
    countClick = 0;
       }else {
countClick += 1;
textViewFight.append("Вы применили усиление круцио. Осталось - " + (countOfKru - countClick) + " раз. ");
    healthDementor -= 10;
    textViewDementor.setText("Дементор (сила - 20/100; усиления(каждое уменьшает здоровье на 10): чует страх - 5, забирает эмоции - 5, превращается в человека - 5, оборонительное заклинание - 5; здоровье - " + healthDementor +"/100;");
    buttonAdKe.setEnabled(false);
    Thread.sleep(5000);  // пауза на 5 секунд
    buttonAdKe.setEnabled(true);
  }
    }

    @SuppressLint("SetTextI18n")
    public void imperius(View view) throws InterruptedException {
        if ((countClick) == countOfImp - 1) {
            buttonImp.setEnabled(false);
            textViewFight.append("Вы применили усиление империо. Осталось - 0 раз");
            healthDementor -= 10;
            textViewDementor.setText("Дементор (сила - 20/100; усиления(каждое уменьшает здоровье на 10): чует страх - 5, забирает эмоции - 5, превращается в человека - 5, оборонительное заклинание - 5; здоровье - " + healthDementor +"/100;");
            countClick = 0;
        } else {
            countClick += 1;
            textViewFight.append("Вы применили усиление империо. Осталось - " + (countOfImp - countClick) + " раз. ");
            healthDementor -= 10;
            textViewDementor.setText("Дементор (сила - 20/100; усиления(каждое уменьшает здоровье на 10): чует страх - 5, забирает эмоции - 5, превращается в человека - 5, оборонительное заклинание - 5; здоровье - " + healthDementor +"/100;");
            buttonAdKe.setEnabled(false);
            Thread.sleep(5000);  // пауза на 5 секунд
            buttonAdKe.setEnabled(true);
        }
    }

    @SuppressLint("SetTextI18n")
    public void adavaKedavra(View view) throws InterruptedException {
            if ((countClick) == countOfAdKe - 1){
                buttonAdKe.setEnabled(false);
                textViewFight.append("Вы применили усиление адава кедавра. Осталось - 0 раз");
                healthDementor -= 10;
                textViewDementor.setText("Дементор (сила - 20/100; усиления(каждое уменьшает здоровье на 10): чует страх - 5, забирает эмоции - 5, превращается в человека - 5, оборонительное заклинание - 5; здоровье - " + healthDementor +"/100;");
                countClick = 0;
            }else {
                countClick += 1;
                textViewFight.append("Вы применили усиление адава кедавра. Осталось - " + (countOfAdKe -countClick) + " раз. ");
                healthDementor -= 10;
                textViewDementor.setText("Дементор (сила - 20/100; усиления(каждое уменьшает здоровье на 10): чует страх - 5, забирает эмоции - 5, превращается в человека - 5, оборонительное заклинание - 5; здоровье - " + healthDementor +"/100;");
                buttonAdKe.setEnabled(false);
                Thread.sleep(5000);  // пауза на 5 секунд
                buttonAdKe.setEnabled(true);
            }

    }

    @SuppressLint("SetTextI18n")
    public void chit(View view) throws InterruptedException {
        if ((countClick) == chit - 1){
            buttonChit.setEnabled(false);
            textViewFight.append("Вы применили усиление оборонительное заклинание. Осталось - 0 раз. ");
            healthDementor -= 10;
            textViewDementor.setText("Дементор (сила - 20/100; усиления(каждое уменьшает здоровье на 10): чует страх - 5, забирает эмоции - 5, превращается в человека - 5, оборонительное заклинание - 5; здоровье - " + healthDementor +"/100;");
            countClick = 0;
        }else {
            countClick += 1;
            textViewFight.append("Вы применили усиление оборонительное заклинание. Осталось - " + (chit-countClick)  + " раз. ");
            healthDementor -= 10;
            textViewDementor.setText("Дементор (сила - 20/100; усиления(каждое уменьшает здоровье на 10): чует страх - 5, забирает эмоции - 5, превращается в человека - 5, оборонительное заклинание - 5; здоровье - " + healthDementor +"/100;");
            buttonChit.setEnabled(false);
            Thread.sleep(5000);  // пауза на 5 секунд
            buttonChit.setEnabled(true);
        }
    }
}