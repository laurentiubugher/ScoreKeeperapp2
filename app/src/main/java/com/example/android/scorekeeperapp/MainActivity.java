package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int cornersTeamA = 0;
    int cornersTeamB = 0;
    int yellowTeamA = 0;
    int yellowTeamB = 0;
    int redTeamA = 0;
    int redTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("scoreTeamA", scoreTeamA);
        outState.putInt("scoreTeamB", scoreTeamB);
        outState.putInt("cornersTeamA", cornersTeamA);
        outState.putInt("cornersTeamB", cornersTeamB);
        outState.putInt("yellowTeamA", yellowTeamA);
        outState.putInt("yellowTeamB", yellowTeamB);
        outState.putInt("redTeamA", redTeamA);
        outState.putInt("redTeamB", redTeamB);

        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamA = savedInstanceState.getInt("scoreTeamA");
        scoreTeamB = savedInstanceState.getInt("scoreTeamB");
        cornersTeamA = savedInstanceState.getInt("cornersTeamA");
        cornersTeamB = savedInstanceState.getInt("cornersTeamB");
        yellowTeamA = savedInstanceState.getInt("yellowTeamA");
        yellowTeamB = savedInstanceState.getInt("yellowTeamB");
        redTeamA = savedInstanceState.getInt("redTeamA");
        redTeamB = savedInstanceState.getInt("redTeamB");

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayCornersForTeamA(cornersTeamA);
        displayCornersForTeamB(cornersTeamB);
        displayYellowCardsForTeamA(yellowTeamA);
        displayYellowCardsForTeamB(yellowTeamB);
        displayRedCardsForTeamA(redTeamA);
        displayRedCardsForTeamB(redTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Add one goal to team A.
     */
    public void addOneGoalForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Add one goal to team B.
     */
    public void addOneGoalToTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given corners for Team A.
     */
    public void displayCornersForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.corners_team_a);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Add corners for Team A.
     */
    public void addCornersTeamA(View v) {
        cornersTeamA = cornersTeamA + 1;
        displayCornersForTeamA(cornersTeamA);
    }
    /**
     * Displays the given corners for Team B.
     */
    public void displayCornersForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.corners_team_b);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Add corners for Team B.
     */
    public void addCornersTeamB(View v) {
        cornersTeamB = cornersTeamB + 1;
        displayCornersForTeamB(cornersTeamB);
    }
    /**
     * Displays the given yellow cards for Team A.
     */
    public void displayYellowCardsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_cards_a);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given yellow cards for Team B.
     */
    public void displayYellowCardsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_cards_b);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Add yellow cards for Team A.
     */
    public void addYellowCardsTeamA(View v) {
        yellowTeamA = yellowTeamA + 1;
        displayYellowCardsForTeamA(yellowTeamA);
    }
    /**
     * Add yellow cards for Team B.
     */
    public void addYellowCardsTeamB(View v) {
        yellowTeamB = yellowTeamB + 1;
        displayYellowCardsForTeamB(yellowTeamB);
    }
    /**
     * Displays the given red cards for Team A.
     */
    public void displayRedCardsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_cards_a);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given red cards for Team B.
     */
    public void displayRedCardsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_cards_b);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Add red cards for Team A.
     */
    public void addRedCardsTeamA(View v) {
        redTeamA = redTeamA + 1;
        displayRedCardsForTeamA(redTeamA);
    }
    /**
     * Add red cards for Team B.
     */
    public void addRedCardsTeamB(View v) {
        redTeamB = redTeamB + 1;
        displayRedCardsForTeamB(redTeamB);
        //The reset button
    }
    public void reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        cornersTeamA = 0;
        cornersTeamB = 0;
        yellowTeamA = 0;
        yellowTeamB = 0;
        redTeamA = 0;
        redTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayCornersForTeamA(cornersTeamA);
        displayCornersForTeamB(cornersTeamB);
        displayYellowCardsForTeamA(yellowTeamA);
        displayYellowCardsForTeamB(yellowTeamB);
        displayRedCardsForTeamA(redTeamA);
        displayRedCardsForTeamB(redTeamB);
    }
}
