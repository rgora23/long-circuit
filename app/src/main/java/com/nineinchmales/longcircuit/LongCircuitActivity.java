package com.nineinchmales.longcircuit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.nineinchmales.longcircuit.activities.GameplayActivity;
import com.nineinchmales.longcircuit.activities.HighScoresActivity;
import com.nineinchmales.longcircuit.activities.LevelSelectorActivity;
import com.nineinchmales.longcircuit.activities.MainMenuActivity;
import com.nineinchmales.longcircuit.activities.SettingsActivity;
import com.nineinchmales.longcircuit.presenters.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by bmaxwell2 on 2/11/16.
 */
abstract public class LongCircuitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.gameplay_activity_menu_button:
                startActivityForResult(new Intent(LongCircuitActivity.this, GameplayActivity.class), 0);
                return true;

            case R.id.high_scores_activity_menu_button:
                startActivityForResult(new Intent(LongCircuitActivity.this, HighScoresActivity.class), 0);
                return true;

            case R.id.level_selector_activity_menu_button:
                startActivityForResult(new Intent(LongCircuitActivity.this, LevelSelectorActivity.class), 0);
                return true;

            case R.id.settings_activity_menu_button:
                startActivityForResult(new Intent(LongCircuitActivity.this, SettingsActivity.class), 0);
                return true;

            case R.id.main_menu_activity_menu_button:
                startActivityForResult(new Intent(LongCircuitActivity.this, MainMenuActivity.class), 0);
                return true;

        }


        return true;
    }

    public abstract LongCircuitPresenter getPresenter();

}
