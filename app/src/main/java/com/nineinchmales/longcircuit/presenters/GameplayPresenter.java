package com.nineinchmales.longcircuit.presenters;

import android.util.Log;

import com.nineinchmales.longcircuit.LongCircuitPresenter;
import com.nineinchmales.longcircuit.activities.GameplayActivity;

/**
 * Created by Brianmaxwell on 2/12/16.
 */
public class GameplayPresenter extends LongCircuitPresenter {

    private GameplayActivity activity;

    public GameplayPresenter(GameplayActivity activity) {
        this.activity = activity;
    }

    @Override
    public GameplayActivity getActivity() {
        return activity;
    }
}
