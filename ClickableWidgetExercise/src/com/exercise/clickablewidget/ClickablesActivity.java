package com.exercise.clickablewidget;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.ToggleButton;

public class ClickablesActivity extends Activity {
    private View panel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        panel = findViewById(R.id.panel);
        setupImageButtonListeners();
        setupRadioButtonListeners();
        setupToggleButtonListeners();
    }

    private void setupRadioButtonListeners() {
        setupAsPanelColorModifier(R.id.radio_blue, Color.BLUE);
        setupAsPanelColorModifier(R.id.radio_red, Color.RED);
        setupAsPanelColorModifier(R.id.radio_yellow, Color.YELLOW);
    }

    private void setupImageButtonListeners() {
        setupAsPanelColorModifier(R.id.img_button_blue, Color.BLUE, R.id.radio_blue);
        setupAsPanelColorModifier(R.id.img_button_red, Color.RED, R.id.radio_red);
    }

    private void setupToggleButtonListeners() {
        ToggleButton toggleRed = (ToggleButton) findViewById(R.id.toggle_red);
        ToggleButton toggleYellow = (ToggleButton) findViewById(R.id.toggle_yellow);
        ToggleButton toggleBlue = (ToggleButton) findViewById(R.id.toggle_blue);
        toggleRed.setOnClickListener();
    }

    private void setupAsPanelColorModifier(int viewId, int color) {
        View view = findViewById(viewId);
        view.setOnClickListener(new PanelColorModifier(color));
    }

    private void setupAsPanelColorModifier(int viewId, int color, int radioButtonTickedId) {
        View view = findViewById(viewId);
        view.setOnClickListener(new PanelColorModifier(color, radioButtonTickedId));
    }

    private void setPanelColor(int panelColor) {
        panel.setBackgroundColor(panelColor);
    }

    private class PanelColorModifier implements View.OnClickListener {
        int color;
        RadioButton radioButtonTicked;

        public PanelColorModifier(int color) {
            this.color = color;
        }

        public PanelColorModifier(int color, int radioButtonTickedId) {
            this.color = color;
            radioButtonTicked = (RadioButton) findViewById(radioButtonTickedId);
        }

        @Override
        public void onClick(View view) {
            setPanelColor(color);
            if (radioButtonTicked != null) {
                radioButtonTicked.toggle();
            }
        }
    }

    private class MixedColorPanel implements View.OnClickListener {
        private ToggleButton toggleRed;
        private ToggleButton toggleBlue;
        private ToggleButton toggleYellow;

        public void

        @Override
        public void onClick(View view) {
        }
    }
}
