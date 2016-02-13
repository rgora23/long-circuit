package com.nineinchmales.longcircuit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GameplayActivity extends ActivityWithMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);
        setTitle("Gameplay");
    }
}
