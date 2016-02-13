package com.nineinchmales.longcircuit.presenters;

import com.nineinchmales.longcircuit.LongCircuitPresenter;
import com.nineinchmales.longcircuit.activities.LevelSelectorActivity;

/**
 * Created by Brianmaxwell on 2/12/16.
 */
public class LevelSelectorPresenter extends LongCircuitPresenter {

    private LevelSelectorActivity activity;

    public LevelSelectorPresenter(LevelSelectorActivity activity) {
        this.activity = activity;
    }

    @Override
    public LevelSelectorActivity getActivity() {
        return activity;
    }
}
