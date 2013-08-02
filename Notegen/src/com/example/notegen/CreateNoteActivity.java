package com.example.notegen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created with IntelliJ IDEA.
 * User: smit
 * Date: 8/2/13
 * Time: 12:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateNoteActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_note);

        final Button viewNoteButton = (Button) findViewById(R.id.view_note_button);
        viewNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(CreateNoteActivity.this, "You clicked the button!", Toast.LENGTH_LONG).show();

//                Ship the user to view-note screen via explicit content
                Intent viewNoteActivityIntent = new Intent(CreateNoteActivity.this, ViewNoteActivity.class);
                viewNoteActivityIntent.putExtra("nextNoteData", "have fun daw");
                startActivity(viewNoteActivityIntent);
            }
        });
    }
}
