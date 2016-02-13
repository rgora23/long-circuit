package com.nineinchmales.longcircuit.activities;

import android.os.Bundle;

import com.nineinchmales.longcircuit.R;
import com.nineinchmales.longcircuit.LongCircuitActivity;
import com.nineinchmales.longcircuit.presenters.GameplayPresenter;

public class GameplayActivity extends LongCircuitActivity {

    private GameplayPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);
        setTitle("Gameplay");
        this.presenter = new GameplayPresenter(this);
    }

    @Override
    public GameplayPresenter getPresenter() {
        return presenter;
    }
}
