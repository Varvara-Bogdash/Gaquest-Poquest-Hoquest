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

public class FightActivity7 extends AppCompatActivity {

    ImageView imageView;
    Boolean winOrNot;
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
    int countClickImp;
    int countClickKru;
    int countClickAdKe;
    int countClickChit;
    int countOfSmell = 5;
    int countOfPut = 5;
    int countOfTransform = 5;
    int healthDementor = 80;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight7);
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
            countClickKru = 4;
            countClickAdKe  = 6;
            countClickImp = 5;
            countClickChit = 2;
            textViewHero.setText("Гермиона Грейнджер (сила - 80/100; усиления: круциатус - 4, адава кедавра - 6, империус - 5, оборонительное заклинание - 2; здоровье - 100/100;)");
        } else {
            if (Objects.equals(name1, "Рон Уизли")) {
                imageView.setImageResource(R.drawable.ron_fight);
                straightHero = 70;
                healthHero = 100;
                countClickKru = 2;
                countClickAdKe = 11;
                countClickImp = 3;
                countClickChit = 4;
                textViewHero.setText("Рон Уизли (сила - 70/100; усиления: круциатус - 2, адава кедавра - 11, империус - 3, оборонительное заклинание - 4; здоровье - 100/100;)");
            } else {
                imageView.setImageResource(R.drawable.garry_fight);
                straightHero = 90;
                healthHero = 100;
                countClickKru = 3;
                countClickAdKe = 4;
                countClickImp = 2;
                countClickChit = 6;
                textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - 3, адава кедавра - 4, империус - 2, оборонительное заклинание - 6; здоровье - 100/100;)");
            }
        }

    }

    @SuppressLint("SetTextI18n")
    public void krucio(View view) throws InterruptedException {
        if (countClickKru == 1) {
            buttonKruc.setEnabled(false);
            textViewFight.append("Вы применили усиление круцио.");
            healthDementor -= 20;
            dementorFight();
            countClickKru = 0;
            if (Objects.equals(name1, "Гермиона Грейнджер")) {
                textViewHero.setText("Гермиона Грейнджер (сила - 80/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
            } else {
                if (Objects.equals(name1, "Рон Уизли")) {
                    textViewHero.setText("Рон Уизли (сила - 70/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
                } else {
                    textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
                }
            }
            if (healthDementor <= 0){
                textViewFight.setText(name1 + " победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                winOrNot = true;
                Intent intent = new Intent(this, LevelActivity8.class);
                intent.putExtra("name", name1);
                intent.putExtra("win", winOrNot);
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
            if (Objects.equals(name1, "Гермиона Грейнджер")) {
                textViewHero.setText("Гермиона Грейнджер (сила - 80/100; усиления: круциатус - "+countClickKru+", адава кедавра - "+countClickAdKe+", империус - "+countClickImp+", оборонительное заклинание - "+countClickChit+"; здоровье - "+healthHero+"/100;)");
            } else {
                if (Objects.equals(name1, "Рон Уизли")) {
                    textViewHero.setText("Рон Уизли (сила - 70/100; усиления: круциатус - "+countClickKru+", адава кедавра - "+countClickAdKe+", империус - "+countClickImp+", оборонительное заклинание - "+countClickChit+"; здоровье - "+healthHero+"/100;)");
                } else {
                    textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - "+countClickKru+", адава кедавра - "+countClickAdKe+", империус - "+countClickImp+", оборонительное заклинание - "+countClickChit+"; здоровье - "+healthHero+"/100;)");
                }
            }
            if (healthDementor <= 0){
                textViewFight.setText(name1 + " победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                winOrNot = true;
                Intent intent = new Intent(this, LevelActivity8.class);
                intent.putExtra("name", name1);
                intent.putExtra("win", winOrNot);
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
            if (Objects.equals(name1, "Гермиона Грейнджер")) {
                textViewHero.setText("Гермиона Грейнджер (сила - 80/100; усиления: круциатус - "+ countClickKru +", адава кедавра - "+countClickAdKe+", империус - "+countClickImp+", оборонительное заклинание - "+countClickChit+"; здоровье - "+healthHero+"/100;)");
            } else {
                if (Objects.equals(name1, "Рон Уизли")) {
                    textViewHero.setText("Рон Уизли (сила - 70/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
                } else {
                    textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
                }
            }
            if (healthDementor <= 0){
                textViewFight.setText(name1 + " победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                winOrNot = true;
                Intent intent = new Intent(this, LevelActivity8.class);
                intent.putExtra("name", name1);
                intent.putExtra("win", winOrNot);
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
            if (Objects.equals(name1, "Гермиона Грейнджер")) {
                textViewHero.setText("Гермиона Грейнджер (сила - 80/100; усиления: круциатус - "+countClickKru+", адава кедавра - "+countClickAdKe+", империус - "+countClickImp+", оборонительное заклинание - "+countClickChit+"; здоровье - "+healthHero+"/100;)");
            } else {
                if (Objects.equals(name1, "Рон Уизли")) {
                    textViewHero.setText("Рон Уизли (сила - 70/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
                } else {
                    textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
                }
            }
            if (healthDementor <= 0){
                textViewFight.setText(name1 + " победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                winOrNot = true;
                Intent intent = new Intent(this, LevelActivity8.class);
                intent.putExtra("name", name1);
                intent.putExtra("win", winOrNot);
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
            if (Objects.equals(name1, "Гермиона Грейнджер")) {
                textViewHero.setText("Гермиона Грейнджер (сила - 80/100; усиления: круциатус - "+countClickKru+", адава кедавра - "+countClickAdKe+", империус - "+countClickImp+", оборонительное заклинание - "+countClickChit+"; здоровье - "+healthHero+"/100;)");
            } else {
                if (Objects.equals(name1, "Рон Уизли")) {
                    textViewHero.setText("Рон Уизли (сила - 70/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
                } else {
                    textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
                }
            }
            if (healthDementor <= 0){
                textViewFight.setText(name1 + " победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                winOrNot = true;
                Intent intent = new Intent(this, LevelActivity8.class);
                intent.putExtra("name", name1);
                intent.putExtra("win", winOrNot);
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
            if (Objects.equals(name1, "Гермиона Грейнджер")) {
                textViewHero.setText("Гермиона Грейнджер (сила - 80/100; усиления: круциатус - "+countClickKru+", адава кедавра - "+countClickAdKe+", империус - "+countClickImp+", оборонительное заклинание - "+countClickChit+"; здоровье - "+healthHero+"/100;)");
            } else {
                if (Objects.equals(name1, "Рон Уизли")) {
                    textViewHero.setText("Рон Уизли (сила - 70/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
                } else {
                    textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
                }
            }
            if (healthDementor <= 0){
                textViewFight.setText(name1 + " победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                winOrNot = true;
                Intent intent = new Intent(this, LevelActivity8.class);
                intent.putExtra("name", name1);
                intent.putExtra("win", winOrNot);
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
    public void chit(View view) throws InterruptedException {
        if (countClickChit == 1){
            buttonChit.setEnabled(false);
            textViewFight.append("Вы применили усиление оборонительное заклинание. ");
            dementorFight();
            healthHero += 10;
            countClickChit = 0;
            if (Objects.equals(name1, "Гермиона Грейнджер")) {
                textViewHero.setText("Гермиона Грейнджер (сила - 80/100; усиления: круциатус - "+countClickKru+", адава кедавра - "+countClickAdKe+", империус - "+countClickImp+", оборонительное заклинание - "+countClickChit+"; здоровье - "+healthHero+"/100;)");
            } else {
                if (Objects.equals(name1, "Рон Уизли")) {
                    textViewHero.setText("Рон Уизли (сила - 70/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
                } else {
                    textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
                }
            }
            if (healthDementor<= 0){
                textViewFight.setText(name1 + " победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                winOrNot = true;
                Intent intent = new Intent(this, LevelActivity8.class);
                intent.putExtra("name", name1);
                intent.putExtra("win", winOrNot);
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
            if (Objects.equals(name1, "Гермиона Грейнджер")) {
                textViewHero.setText("Гермиона Грейнджер (сила - 80/100; усиления: круциатус - "+countClickKru+", адава кедавра - "+countClickAdKe+", империус - "+countClickImp+", оборонительное заклинание - "+countClickChit+"; здоровье - "+healthHero+"/100;)");
            } else {
                if (Objects.equals(name1, "Рон Уизли")) {
                    textViewHero.setText("Рон Уизли (сила - 70/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
                } else {
                    textViewHero.setText("Гарри Поттер (сила - 90/100; усиления: круциатус - " + countClickKru + ", адава кедавра - " + countClickAdKe + ", империус - " + countClickImp + ", оборонительное заклинание - " + countClickChit + "; здоровье - " + healthHero + "/100;)");
                }
            }
            if (healthDementor <= 0){
                textViewFight.setText(name1 + " победил в игре! Нажмите на любую кнопку для перехода на следующий уровень");
                winOrNot = true;
                Intent intent = new Intent(this, LevelActivity8.class);
                intent.putExtra("name", name1);
                intent.putExtra("win", winOrNot);
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
            textViewFight.append("Дракон учуял тебя.  ");
            textViewDementor.setText("Дракон (сила - 50/100; усиления(каждое уменьшает здоровье на 10): чует тебя - "+countOfSmell+", плюет огнем - "+countOfPut+", съедает и выплевывает тебя - "+countOfTransform+";) здоровье - "+healthDementor+"/100;");
        } else {
            if (random == 1){
                healthHero= healthHero - 10;
                countOfPut = countOfPut - 1;
                textViewFight.append("дракон плюнул огнем.  ");
                textViewDementor.setText("Дракон (сила - 50/100; усиления(каждое уменьшает здоровье на 10): чует тебя - "+countOfSmell+", плюет огнем - "+countOfPut+", съедает и выплевывает тебя - "+countOfTransform+";) здоровье - "+healthDementor+"/100;");

            }else {
                healthHero= healthHero - 10;
                countOfTransform = countOfTransform - 1;
                textViewFight.append("Дракон поел и выплюнул тебя.  ");
                textViewDementor.setText("Дракон (сила - 50/100; усиления(каждое уменьшает здоровье на 10): чует тебя - "+countOfSmell+", плюет огнем - "+countOfPut+", съедает и выплевывает тебя - "+countOfTransform+";) здоровье - "+healthDementor+"/100;");

            }
        }
    }
}