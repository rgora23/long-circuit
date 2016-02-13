package com.nineinchmales.longcircuit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/**
 * Created by bmaxwell2 on 2/11/16.
 */
public class ActivityWithMenu extends AppCompatActivity {

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
                startActivityForResult(new Intent(ActivityWithMenu.this, GameplayActivity.class), 0);
                return true;

            case R.id.high_scores_activity_menu_button:
                startActivityForResult(new Intent(ActivityWithMenu.this, HighScoresActivity.class), 0);
                return true;

            case R.id.level_selector_activity_menu_button:
                startActivityForResult(new Intent(ActivityWithMenu.this, LevelSelectorActivity.class), 0);
                return true;

            case R.id.settings_activity_menu_button:
                startActivityForResult(new Intent(ActivityWithMenu.this, SettingsActivity.class), 0);
                return true;

            case R.id.main_menu_activity_menu_button:
                startActivityForResult(new Intent(ActivityWithMenu.this, MainMenuActivity.class), 0);
                return true;

        }


        return true;
    }

}
