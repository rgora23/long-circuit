package com.nineinchmales.longcircuit.presenters;

import com.nineinchmales.longcircuit.LongCircuitPresenter;
import com.nineinchmales.longcircuit.activities.MainMenuActivity;

/**
 * Created by Brianmaxwell on 2/12/16.
 */
public class MainMenuPresenter extends LongCircuitPresenter {

    private MainMenuActivity activity;

    public MainMenuPresenter(MainMenuActivity activity) {
        this.activity = activity;
    }

    @Override
    public MainMenuActivity getActivity() {
        return activity;
    }
}
