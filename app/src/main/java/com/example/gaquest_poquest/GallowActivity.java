package com.example.gaquest_poquest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.Arrays;

public class GallowActivity extends AppCompatActivity {
    TextView viewTranslateWord;
    TextView viewEnglishWord;
    TableLayout viewAlphabet;
    String translateWord;
    String  englishWord;
    String  pairWords;
    String[] alphabetLetters = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    int variantOfButton;
    int countAdKe;
    int countImp;
    int countKru;
    int countChit;
    String[] lettersWord;
    String[] showLetters;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallow);

        viewTranslateWord = findViewById(R.id.TranslationWord);
        viewEnglishWord = findViewById(R.id.EnglishWord);
        viewAlphabet = findViewById(R.id.Alphabet);

//        variantOfButton = getIntent().getExtras().getInt("variantOfButton");
//        countAdKe = getIntent().getExtras().getInt("countClickAdKe");
//        countImp = getIntent().getExtras().getInt("countClickImp");
//        countKru = getIntent().getExtras().getInt("countClickKru");
//        countChit = getIntent().getExtras().getInt("countClickChit");

//        switch (variantOfButton){
//            case 1: viewTranslateWord.setText("Оборонительное заклинание"); break;
//            case 2: viewTranslateWord.setText("Круцио"); break;
//            case 3: viewTranslateWord.setText("Империус"); break;
//            case 4: viewTranslateWord.setText("Адава кедавра"); break;
//        }



        while (true) {
            int randIndex = (int) (Math.random() * Dictionary.dictionary.size());
            String word = Dictionary.dictionary.get(randIndex);
            if (!Dictionary.usageWords.contains(word)) {
                pairWords = word;
                Dictionary.usageWords.add(word);
                Dictionary.dictionary.remove(randIndex);
                break;
            }
        }
        String[] temp = pairWords.split("-");
        englishWord = temp[0];
        translateWord = temp[1];
//        viewEnglishWord.setText(englishWord);
        viewTranslateWord.setText(translateWord);
        lettersWord = englishWord.split("");
        showLetters = new String[lettersWord.length];
        Arrays.fill(showLetters, "_");
        viewWord();

        int countLetters = 0;
        viewAlphabet.setShrinkAllColumns(true);
        for (int i = 0; i < 4; i++) {
            TableRow tableRow = new TableRow(this);
            tableRow.setGravity(Gravity.CENTER);
            for (int j = 0; j < 7; j++) {
                if (countLetters < alphabetLetters.length) {
                    Button button = new Button(this);
                    button.setText(alphabetLetters[countLetters]);
                    button.setTextSize(28.0f);
                    countLetters++;
                    button.setOnClickListener(this::clickLetter);
                    tableRow.addView(button);
                }
            }
            viewAlphabet.addView(tableRow);
        }

    }

    private void viewWord() {
        StringBuilder showText = new StringBuilder();
        for (int i = 0; i < showLetters.length; i++) {
            showText.append(showLetters[i]).append(" ");
        }
        viewEnglishWord.setText(showText.toString());
    }

    private void clickLetter(View button) {
        Button btn = (Button) button;
        btn.setClickable(false);
        boolean match = false;
        //при нажатии кнопки проверяем есть ли такая буква в загаданном слове
        for (int i = 0; i < lettersWord.length; i++) {
            if (btn.getText().toString().equals(lettersWord[i])) {
                showLetters[i] = lettersWord[i];
                match = true;
            }
        }
        //если есть, то зеленый цвет, показываем букву (буквы),
        if (match) {
            btn.setBackgroundColor(Color.GREEN);
            viewWord();
            //ПРОВЕРКА ПОБЕДЫ!
            checkWin();
        } else {
            // если нет - красный цвет и меняем картинку
            btn.setBackgroundColor(Color.RED);
            viewWord();
//            if (countImg <= 9) {
//                gallowsScreen.setImageDrawable(drawable[countImg]);
//                countImg++;
//            } else {
//                alphabet.removeAllViews();
//                TextView textView = new TextView(this);
//                textView.setText(R.string.txt_loss);
//                textView.setTextSize(40f);
//                textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
//                alphabet.addView(textView);
//                for (int i = 0; i < taskLettersBtn.length; i++) {
//                    taskLettersBtn[i].setText(letters[i]);
//                }
//            }
        }
    }

    private void checkWin() {

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