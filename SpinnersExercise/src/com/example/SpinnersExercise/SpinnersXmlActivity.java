package com.example.SpinnersExercise;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class SpinnersXmlActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinners_xml);
        Spinner colorChooser = (Spinner) findViewById(R.id.spinner_xml);
        colorChooser.setOnItemSelectedListener(new ColorSetter(findViewById(R.id.bottom_panel)));
    }

    private class ColorSetter implements AdapterView.OnItemSelectedListener {
        private View panel;

        public ColorSetter(View panel) {
            this.panel = panel;
        }

        @Override
        public void onItemSelected(AdapterView<?> spinner, View view, int position, long id) {
            applyChoosenColor(spinner, position);
        }

        private void applyChoosenColor(AdapterView<?> spinner, int position) {
            String selectedItemText = spinner.getItemAtPosition(position).toString();
            if(selectedItemText == getString(R.string.blue_label)) {
                panel.setBackgroundColor(Color.BLUE);
            } else if(selectedItemText == getString(R.string.red_label)) {
                panel.setBackgroundColor(Color.RED);
            } else if(selectedItemText == getString(R.string.green_label)) {
                panel.setBackgroundColor(Color.GREEN);
            } else if(selectedItemText == getString(R.string.yellow_label)) {
                panel.setBackgroundColor(Color.YELLOW);
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {
            // will never be invoked since the program does not remove entries
        }
    }
}
