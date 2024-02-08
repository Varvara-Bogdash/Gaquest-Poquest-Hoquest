package com.example.gaquest_poquest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class FinishFightActivity extends AppCompatActivity {

    ImageView imageView;
    Boolean winOrNot;
    TextView textViewHero;
    TextView textViewDementor;
    TextView textViewFight;
    Button buttonKruc;
    Button buttonImp;
    Button buttonAdKe;
    Button buttonChit;
    int straightHero;
    int healthHero;
    int countClickImp;
    int countClickKru;
    int countClickAdKe;
    int countClickChit;
    int countOfSmell = 10;
    int countOfPut = 10;
    int countOfTransform = 10;
    int healthDementor = 100;
    int variantOfButton;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_fight);
        imageView = findViewById(R.id.imageView4);
        textViewDementor = findViewById(R.id.textViewDementor);
        textViewHero = findViewById(R.id.textViewHero);
        buttonKruc = findViewById(R.id.buttonKrucio);
        buttonImp = findViewById(R.id.buttonImperio);
        buttonAdKe = findViewById(R.id.buttonAdavaKedavra);
        buttonChit = findViewById(R.id.buttonChit);
        textViewFight = findViewById(R.id.textViewFight);
       variantOfButton = Integer.parseInt(Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).getString("variantOfButton")));
        switch (variantOfButton){
            case 1: countClickChit += 3; break;
            case 2: countClickKru += 3; break;
            case 3: countClickImp += 3; break;
            case 4: countClickAdKe += 3; break;
        }



        imageView.setImageResource(R.drawable.garry_fight);
                straightHero = 90;
                healthHero = 100;
        countClickAdKe = Integer.parseInt(Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).getString("countClickAdKe")));
        countClickImp = Integer.parseInt(Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).getString("countClickImp")));
        countClickKru = Integer.parseInt(Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).getString("countClickKru")));
        countClickChit = Integer.parseInt(Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).getString("countClickChit")));
                textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - "+countClickKru+", адава кедавра - "+countClickAdKe+", империус - "+countClickImp+", оборонительное заклинание - "+countClickChit+"; здоровье - 100/100;)");
            }


    @SuppressLint("SetTextI18n")
    public void krucio(View view) throws InterruptedException {
        if (countClickKru == 1) {
            buttonKruc.setEnabled(false);
            textViewFight.append("Вы применили усиление круцио.");
            healthDementor -= 20;
            dementorFight();
            countClickKru = 0;
                    textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
            if (healthDementor <= 0){
                textViewFight.setText("Гарри Поттер победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                winOrNot = true;
                Intent intent = new Intent(this, EndActivity.class);
                intent.putExtra("countClickKru", countClickKru);
                intent.putExtra("countClickAdKe", countClickAdKe);
                intent.putExtra("countClickImp", countClickImp);
                intent.putExtra("countClickChit", countClickChit);
                startActivity(intent);
            }else if (healthHero <= 0){
                textViewFight.setText("Вы поиграли в игре! Для того, чтобы начать заново, нажмите любую кнопку.");
                winOrNot = false;
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }

        }else {
            countClickKru -= 1;
            textViewFight.append("Вы применили усиление круцио.");
            healthDementor -= 20;
            dementorFight();
                    textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - "+countClickKru+", адава кедавра - "+countClickAdKe+", империус - "+countClickImp+", оборонительное заклинание - "+countClickChit+"; здоровье - "+healthHero+"/100;)");
            if (healthDementor <= 0){
                textViewFight.setText("Гарри Поттер победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                winOrNot = true;
                Intent intent = new Intent(this, EndActivity.class);
                intent.putExtra("countClickKru", countClickKru);
                intent.putExtra("countClickAdKe", countClickAdKe);
                intent.putExtra("countClickImp", countClickImp);
                intent.putExtra("countClickChit", countClickChit);
                startActivity(intent);
            }else if (healthHero <= 0){
                textViewFight.setText("Вы поиграли в игре! Для того, чтобы начать заново, нажмите любую кнопку.");
                winOrNot = false;
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }
        }
    }

    @SuppressLint("SetTextI18n")
    public void imperius(View view) throws InterruptedException {
        if (countClickImp == 1) {
            buttonImp.setEnabled(false);
            textViewFight.append("Вы применили усиление империо.");
            healthDementor -= 20;
            dementorFight();
            countClickImp = 0;
                    textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
            if (healthDementor <= 0){
                textViewFight.setText("Гарри Поттер победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                winOrNot = true;
                Intent intent = new Intent(this, EndActivity.class);
                intent.putExtra("countClickKru", countClickKru);
                intent.putExtra("countClickAdKe", countClickAdKe);
                intent.putExtra("countClickImp", countClickImp);
                intent.putExtra("countClickChit", countClickChit);
                startActivity(intent);
            }else if (healthHero <= 0){
                textViewFight.setText("Вы поиграли в игре! Для того, чтобы начать заново, нажмите любую кнопку.");
                winOrNot = false;
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }

        } else {
            countClickImp -= 1;
            textViewFight.append("Вы применили усиление империо.");
            healthDementor -= 20;
            dementorFight();
                    textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
            if (healthDementor <= 0){
                textViewFight.setText("Гарри Поттер победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                winOrNot = true;
                Intent intent = new Intent(this, EndActivity.class);
                intent.putExtra("countClickKru", countClickKru);
                intent.putExtra("countClickAdKe", countClickAdKe);
                intent.putExtra("countClickImp", countClickImp);
                intent.putExtra("countClickChit", countClickChit);
                startActivity(intent);
            }else if (healthHero <= 0){
                textViewFight.setText("Вы поиграли в игре! Для того, чтобы начать заново, нажмите любую кнопку.");
                winOrNot = false;
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }
        }
    }

    @SuppressLint("SetTextI18n")
    public void adavaKedavra(View view) throws InterruptedException {
        if (countClickAdKe == 1){
            buttonAdKe.setEnabled(false);
            textViewFight.append("Вы применили усиление адава кедавра.  ");
            healthDementor -= 20;
            dementorFight();
            countClickAdKe = 0;
                    textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
            if (healthDementor <= 0){
                textViewFight.setText("Гарри Поттер победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                winOrNot = true;
                Intent intent = new Intent(this, EndActivity.class);
                intent.putExtra("countClickKru", countClickKru);
                intent.putExtra("countClickAdKe", countClickAdKe);
                intent.putExtra("countClickImp", countClickImp);
                intent.putExtra("countClickChit", countClickChit);
                startActivity(intent);
            }else if (healthHero <= 0){
                textViewFight.setText("Вы поиграли в игре! Для того, чтобы начать заново, нажмите любую кнопку.");
                winOrNot = false;
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }

        }else {
            countClickAdKe -= 1;
            textViewFight.append("Вы применили усиление адава кедавра. ");
            healthDementor -= 20;
            dementorFight();
                    textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
            if (healthDementor <= 0){
                textViewFight.setText("Гарри Поттер победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                winOrNot = true;
                Intent intent = new Intent(this, EndActivity.class);
                intent.putExtra("countClickKru", countClickKru);
                intent.putExtra("countClickAdKe", countClickAdKe);
                intent.putExtra("countClickImp", countClickImp);
                intent.putExtra("countClickChit", countClickChit);
                startActivity(intent);
            }else if (healthHero == 0){
                textViewFight.setText("Вы поиграли в игре! Для того, чтобы начать заново, нажмите любую кнопку.");
                winOrNot = false;
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }
        }

    }

    @SuppressLint("SetTextI18n")
    public void chit(View view) throws InterruptedException {
        if (countClickChit == 1){
            buttonChit.setEnabled(false);
            textViewFight.append("Вы применили усиление оборонительное заклинание. ");
            dementorFight();
            healthHero += 15;
            countClickChit = 0;
                    textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
            if (healthDementor <= 0){
                textViewFight.setText("Гарри Поттер победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                winOrNot = true;
                Intent intent = new Intent(this, EndActivity.class);
                intent.putExtra("countClickKru", countClickKru);
                intent.putExtra("countClickAdKe", countClickAdKe);
                intent.putExtra("countClickImp", countClickImp);
                intent.putExtra("countClickChit", countClickChit);
                startActivity(intent);
            }else if (healthHero <= 0){
                textViewFight.setText("Вы поиграли в игре! Для того, чтобы начать заново, нажмите любую кнопку.");
                winOrNot = false;
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }
        }else {
            countClickChit -= 1;
            textViewFight.append("Вы применили усиление оборонительное заклинание. ");
            dementorFight();
            healthHero += 10;
                    textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
            if (healthDementor <= 0){
                textViewFight.setText("Гарри Поттер победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                winOrNot = true;
                Intent intent = new Intent(this, EndActivity.class);
                intent.putExtra("countClickKru", countClickKru);
                intent.putExtra("countClickAdKe", countClickAdKe);
                intent.putExtra("countClickImp", countClickImp);
                intent.putExtra("countClickChit", countClickChit);
                startActivity(intent);
            }else if (healthHero <= 0){
                textViewFight.setText("Вы поиграли в игре! Для того, чтобы начать заново, нажмите любую кнопку.");
                winOrNot = false;
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private void dementorFight() {
        int random = ((int) (Math.random() * 3));
        if (random == 0){
            healthHero= healthHero - 20;
            countOfSmell = countOfSmell - 1;
            textViewFight.append("Волан-де-Морт учуял страх.  ");
            textViewDementor.setText("Волан-де-Морт (сила - 100/100; усиления(каждое уменьшает здоровье на 20): чует страх - "+countOfSmell+", забирает эмоции - "+countOfPut+", адава кедавра - "+countOfTransform+";) здоровье - "+healthDementor+"/100;");
        } else {
            if (random == 1){
                healthHero= healthHero - 20;
                countOfPut = countOfPut - 1;
                textViewFight.append("Волан-де-Морт забрал эмоции.  ");
                textViewDementor.setText("Волан-де-Морт (сила - 100/100; усиления(каждое уменьшает здоровье на 20): чует страх - "+countOfSmell+", забирает эмоции - "+countOfPut+", адава кедавра - "+countOfTransform+";) здоровье - "+healthDementor+"/100;");

            }else {
                healthHero= healthHero - 20;
                countOfTransform = countOfTransform - 1;
                textViewFight.append("Волан-де-Морт использовал адава кедавра.  ");
                textViewDementor.setText("Волан-де-Морт (сила - 100/100; усиления(каждое уменьшает здоровье на 20): чует страх - "+countOfSmell+", забирает эмоции - "+countOfPut+", адава кедавра - "+countOfTransform+";) здоровье - "+healthDementor+"/100;");

            }
        }
    }
}