package com.nineinchmales.longcircuit.presenters;

import com.nineinchmales.longcircuit.LongCircuitPresenter;
import com.nineinchmales.longcircuit.activities.HighScoresActivity;

/**
 * Created by Brianmaxwell on 2/12/16.
 */
public class HighScoresPresenter extends LongCircuitPresenter {

    private HighScoresActivity activity;

    public HighScoresPresenter(HighScoresActivity activity) {
        this.activity = activity;
    }

    @Override
    public HighScoresActivity getActivity() {
        return activity;
    }

}
