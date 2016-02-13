package com.nineinchmales.longcircuit.activities;

import android.os.Bundle;

import com.nineinchmales.longcircuit.R;
import com.nineinchmales.longcircuit.LongCircuitActivity;
import com.nineinchmales.longcircuit.presenters.LevelSelectorPresenter;

public class LevelSelectorActivity extends LongCircuitActivity {

    private LevelSelectorPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_selector);
        setTitle("Select Level");
        presenter = new LevelSelectorPresenter(this);
    }

    @Override
    public LevelSelectorPresenter getPresenter() {
        return presenter;
    }
}