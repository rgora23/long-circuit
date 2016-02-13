package com.nineinchmales.longcircuit.presenters;

import com.nineinchmales.longcircuit.LongCircuitPresenter;
import com.nineinchmales.longcircuit.activities.SettingsActivity;

/**
 * Created by Brianmaxwell on 2/12/16.
 */
public class SettingsPresenter extends LongCircuitPresenter {

    private SettingsActivity activity;

    public SettingsPresenter(SettingsActivity activity) {
        this.activity = activity;
    }

    @Override
    public SettingsActivity getActivity() {
        return activity;
    }
}
