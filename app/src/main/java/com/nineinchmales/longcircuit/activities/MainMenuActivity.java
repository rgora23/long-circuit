package com.nineinchmales.longcircuit.activities;

import android.os.Bundle;

import com.nineinchmales.longcircuit.R;
import com.nineinchmales.longcircuit.LongCircuitActivity;
import com.nineinchmales.longcircuit.presenters.MainMenuPresenter;
import com.nineinchmales.longcircuit.presenters.SettingsPresenter;

public class MainMenuActivity extends LongCircuitActivity {

    private MainMenuPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        setTitle("Main Menu");
        presenter = new MainMenuPresenter(this);
    }

    @Override
    public MainMenuPresenter getPresenter() {
        return presenter;
    }
}
