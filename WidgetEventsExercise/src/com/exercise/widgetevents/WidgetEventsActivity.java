package com.exercise.widgetevents;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class WidgetEventsActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setupButtonsOnclick();
    }

    private void setupButtonsOnclick() {
        setupMessagePrompt(R.id.button1, R.string.greeting);
        setupMessagePrompt(R.id.button2, R.string.goodbye);
    }

    private void setupMessagePrompt(int viewId, int messageId) {
        View view = findViewById(viewId);
        String message = getString(messageId);
        view.setOnClickListener(new MessagePrompt(message, this));
    }


    private class MessagePrompt implements OnClickListener {
        String message;
        Activity mainActivity;

        public MessagePrompt(String message, Activity mainActivity) {
            this.message = message;
            this.mainActivity = mainActivity;
        }

        @Override
        public void onClick(View view) {
            Toast prompt = Toast.makeText(mainActivity, message, Toast.LENGTH_SHORT);
            prompt.show();
        }
    }
}
