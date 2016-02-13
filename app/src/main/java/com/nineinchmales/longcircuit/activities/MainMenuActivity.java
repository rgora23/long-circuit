package com.nineinchmales.longcircuit.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

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

        initPlayButton();
    }
    private void initPlayButton() {
        ImageButton list = (ImageButton) findViewById(R.id.PlayButton);
        list.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainMenuActivity.this, GameplayActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
    @Override
    public MainMenuPresenter getPresenter() {
        return presenter;
    }
}
