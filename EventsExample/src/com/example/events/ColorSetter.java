package com.example.events;

import android.view.View;

public class ColorSetter implements View.OnClickListener {
    private int regionColor;
    private EventsActivity mainActivity;

    public ColorSetter(int color, EventsActivity mainActivity) {
        this.regionColor = color;
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View view) {
        mainActivity.setRegionColor(regionColor);
    }
}
