package com.nineinchmales.longcircuit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HighScoresActivity extends ActivityWithMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_scores);
        setTitle("High Scores");
    }
}
