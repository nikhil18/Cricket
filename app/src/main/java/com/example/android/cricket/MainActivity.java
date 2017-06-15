package com.example.android.cricket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    int scoreInd = 0;
    int scoreAus = 0;
    int indOut = 0;
    int ausOut = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addSixInd (View view) {
        scoreInd = scoreInd + 6;
        displayForInd(scoreInd);
    }

    public void addFourInd (View view) {
        scoreInd = scoreInd + 4;
        displayForInd(scoreInd);
    }

    public void addThreeInd (View view) {
        scoreInd = scoreInd + 3;
        displayForInd(scoreInd);
    }

    public void addTwoInd (View view) {
        scoreInd = scoreInd + 2;
        displayForInd(scoreInd);
    }

    public void addOneInd (View view) {
        scoreInd = scoreInd + 1;
        displayForInd(scoreInd);
    }

    public void addIndOut (View view) {
        if (indOut == 10) {
            Toast.makeText(this, "You cannot have more than 10 outs", Toast.LENGTH_SHORT).show();
            return;
        }
        indOut = indOut + 1;
        displayIndOut(indOut);
    }

    public void addSixAus (View view) {
        scoreAus = scoreAus + 6;
        displayForAus(scoreAus);
    }

    public void addFourAus (View view) {
        scoreAus = scoreAus + 4;
        displayForAus(scoreAus);
    }

    public void addThreeAus (View view) {
        scoreAus = scoreAus + 3;
        displayForAus(scoreAus);
    }

    public void addTwoAus (View view) {
        scoreAus = scoreAus + 2;
        displayForAus(scoreAus);
    }

    public void addOneAus (View view) {

        scoreAus = scoreAus + 1;
        displayForAus(scoreAus);
    }

    public void addAusOut (View view) {
        if (ausOut == 10) {
            Toast.makeText(this, "You cannot have more than 10 outs", Toast.LENGTH_SHORT).show();
            return;
        }
        ausOut = ausOut + 1;
        displayAusOut(ausOut);
    }

    public void resetScore (View view) {
        scoreInd = 0;
        scoreAus = 0;
        indOut = 0;
        ausOut = 0;
        displayForInd(scoreInd);
        displayIndOut(indOut);
        displayForAus(scoreAus);
        displayAusOut(ausOut);
    }

    public void displayForInd (int score) {
        TextView scoreView = (TextView) findViewById(R.id.indiaScore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForAus (int score) {
        TextView scoreView = (TextView) findViewById(R.id.australiaScore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayIndOut (int out) {
        TextView outView = (TextView) findViewById(R.id.outInd);
        outView.setText(String.valueOf(out));
    }

    public void displayAusOut (int out) {
        TextView outView = (TextView) findViewById(R.id.outAus);
        outView.setText(String.valueOf(out));
    }

}
