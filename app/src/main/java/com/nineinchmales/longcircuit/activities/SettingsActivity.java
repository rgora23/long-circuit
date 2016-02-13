package com.nineinchmales.longcircuit.activities;

import android.os.Bundle;

import com.nineinchmales.longcircuit.R;
import com.nineinchmales.longcircuit.LongCircuitActivity;
import com.nineinchmales.longcircuit.presenters.SettingsPresenter;

public class SettingsActivity extends LongCircuitActivity {

    private SettingsPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        setTitle("Settings");
        presenter = new SettingsPresenter(this);
    }

    @Override
    public SettingsPresenter getPresenter() {
        return presenter;
    }
}