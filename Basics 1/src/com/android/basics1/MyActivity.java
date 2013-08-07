package com.android.basics1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void sayHello(View view) {
        Toast toast = Toast.makeText(this, R.string.hello_greeting, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void changeButtonTextColor(View view) {
        Button clickedButton = (Button) view;
        int randomColor = randomizeColor();
        clickedButton.setTextColor(randomColor);
    }

    public void changeTestTextColor(View view) {
        TextView testText = (TextView) findViewById(R.id.test_text);
        int randomColor = randomizeColor();
        testText.setTextColor(randomColor);
    }

    private int randomizeColor() {
        int[] choices = {Color.RED, Color.BLUE, Color.YELLOW};
        int randomChoice = (int) (Math.random() * 10) % choices.length;
        return choices[randomChoice];
    }
}
