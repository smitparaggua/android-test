package com.example.events;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class EventsActivity extends Activity {
    private View mColorRegion;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mColorRegion = findViewById(R.id.color_region);
        setupButtonListeners();
        setupRadioButtonListeners();
    }

    private void setupButtonListeners() {
        setupColorSetterOnClick(R.id.red_button, Color.RED);
        setupColorSetterOnClick(R.id.blue_button, Color.BLUE);
        setupColorSetterOnClick(R.id.yellow_button, Color.YELLOW);
    }

    private void setupRadioButtonListeners() {
        setupColorSetterOnClick(R.id.red_radio, Color.RED);
        setupColorSetterOnClick(R.id.blue_radio , Color.BLUE);
        setupColorSetterOnClick(R.id.yellow_radio, Color.YELLOW);
    }

    private View setupColorSetterOnClick(final int viewId, final int color) {
        View view = findViewById(viewId);
        view.setOnClickListener(new ColorSetter(color, this));
        return view;
    }

    public void setRegionColor(int regionColor) {
        mColorRegion.setBackgroundColor(regionColor);
    }
}
