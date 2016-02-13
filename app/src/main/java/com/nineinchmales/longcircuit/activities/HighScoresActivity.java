package com.nineinchmales.longcircuit.activities;

import android.os.Bundle;

import com.nineinchmales.longcircuit.R;
import com.nineinchmales.longcircuit.LongCircuitActivity;
import com.nineinchmales.longcircuit.presenters.HighScoresPresenter;

public class HighScoresActivity extends LongCircuitActivity {

    private HighScoresPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_scores);
        setTitle("High Scores");
        presenter = new HighScoresPresenter(this);
    }

    @Override
    public HighScoresPresenter getPresenter() {
        return presenter;
    }
}
