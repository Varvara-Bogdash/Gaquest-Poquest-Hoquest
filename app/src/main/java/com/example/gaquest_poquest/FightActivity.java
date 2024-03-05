package com.example.gaquest_poquest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class FightActivity extends AppCompatActivity {
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
int countOfSmell = 5;
int countOfPut = 5;
int countOfTransform = 5;
int healthDementor = 50;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight);
        imageView = findViewById(R.id.imageView4);
        textViewDementor = findViewById(R.id.textViewDementor);
        textViewHero = findViewById(R.id.textViewHero);
        buttonKruc = findViewById(R.id.buttonKrucio);
        buttonImp = findViewById(R.id.buttonImperio);
        buttonAdKe = findViewById(R.id.buttonAdavaKedavra);
        buttonChit = findViewById(R.id.buttonChit);
        textViewFight = findViewById(R.id.textViewFight);

        straightHero = 90;
        healthHero = 100;
        countClickKru = 2;
        countClickAdKe = 3;
        countClickImp = 1;
        countClickChit = 5;
        textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - 2, адава кедавра - 3, империус - 1, оборонительное заклинание - 5; здоровье - 100/100;)");
            }


    @SuppressLint("SetTextI18n")
    public void krucio(View view){
        if (countClickKru == 1) {
            buttonKruc.setEnabled(false);
            textViewFight.append("Вы применили усиление круцио.");
            healthDementor -= 10;
            dementorFight();
            countClickKru = 0;
                    textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
            if (healthDementor <= 0){
                textViewFight.setText("Гарри Поттер победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                winOrNot = true;
                Intent intent = new Intent(this, ChoiseActivity.class);
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
            healthDementor -= 10;
            dementorFight();
                    textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - "+countClickKru+", адава кедавра - "+countClickAdKe+", империус - "+countClickImp+", оборонительное заклинание - "+countClickChit+"; здоровье - "+healthHero+"/100;)");
            }
            if (healthDementor <= 0){
                textViewFight.setText("Гарри Поттер победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                winOrNot = true;
                Intent intent = new Intent(this, ChoiseActivity.class);
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


    @SuppressLint("SetTextI18n")
    public void imperius(View view){
        if (countClickImp == 1) {
            buttonImp.setEnabled(false);
            textViewFight.append("Вы применили усиление империо.");
            healthDementor -= 10;
            dementorFight();
            countClickImp = 0;
                    textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
            if (healthDementor <= 0){
                textViewFight.setText("Гарри Поттер победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                winOrNot = true;
                Intent intent = new Intent(this, ChoiseActivity.class);
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
            healthDementor -= 10;
            dementorFight();
                    textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
            if (healthDementor <= 0){
                textViewFight.setText("Гарри Поттер победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                winOrNot = true;
                Intent intent = new Intent(this, ChoiseActivity.class);
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
    public void adavaKedavra(View view){
            if (countClickAdKe == 1){
                buttonAdKe.setEnabled(false);
                textViewFight.append("Вы применили усиление адава кедавра.  ");
                healthDementor -= 10;
                dementorFight();
                countClickAdKe = 0;
                        textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
                if (healthDementor == 0){
                    textViewFight.setText("Гарри Поттер победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                    winOrNot = true;
                    Intent intent = new Intent(this, ChoiseActivity.class);
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
            }else {
                countClickAdKe -= 1;
                textViewFight.append("Вы применили усиление адава кедавра. ");
                healthDementor -= 10;
                dementorFight();
                        textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
                if (healthDementor <= 0){
                    textViewFight.setText("Гарри Поттер победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                    winOrNot = true;
                    Intent intent = new Intent(this, ChoiseActivity.class);
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
    public void chit(View view){
        if (countClickChit == 1){
            buttonChit.setEnabled(false);
            textViewFight.append("Вы применили усиление оборонительное заклинание. ");
            dementorFight();
            healthHero += 10;
            countClickChit = 0;
            textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
            if (healthDementor <= 0){
                textViewFight.setText("Гарри Поттер победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                winOrNot = true;
                Intent intent = new Intent(this, ChoiseActivity.class);
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
                Intent intent = new Intent(this, ChoiseActivity.class);
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
            healthHero= healthHero - 10;
            countOfSmell = countOfSmell - 1;
            textViewFight.append("Дементор учуял страх.  ");
            textViewDementor.setText("Дементор (сила - 20/100; усиления (каждое уменьшает здоровье на 10): чует страх - "+ countOfSmell +", забирает эмоции - " + countOfPut + ", превращается в человека - "+ countOfTransform +", здоровье - " + healthDementor +"/100;");
        } else {
            healthHero= healthHero - 10;
            if (random == 1){
                countOfPut = countOfPut - 1;
                textViewFight.append("Дементор забрал эмоции.  ");

            }else {
                countOfTransform = countOfTransform - 1;
                textViewFight.append("Дементор превратился в человека.  ");

            }
            textViewDementor.setText("Дементор (сила - 20/100; усиления (каждое уменьшает здоровье на 10): чует страх - "+ countOfSmell +", забирает эмоции - " + countOfPut + ", превращается в человека - "+ countOfTransform +", здоровье - " + healthDementor +"/100;");
        }
    }
}