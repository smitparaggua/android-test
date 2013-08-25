package com.exercise.layouts;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public abstract class ActivitySwitcher extends Activity {
    public void switchToLinearLayout(View clickedButton) {
        switchToActivity(LinearLayoutActivity.class, this);
    }

    public void switchToTableLayout(View clickedButton) {
        switchToActivity(TableLayoutActivity.class, this);
    }

    public void switchToRelativeLayout(View clickedButton) {
        switchToActivity(RelativeLayoutActivity.class, this);
    }

    private void switchToActivity(Class<? extends Activity> activityClass, Context packageContext) {
        Intent newActivity = new Intent(packageContext, activityClass);
        packageContext.startActivity(newActivity);
    }
}
