package com.example.notegen;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created with IntelliJ IDEA.
 * User: smit
 * Date: 8/2/13
 * Time: 12:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class ViewNoteActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_create_note);

//        Get pointer to the drawable image to show
        int nextNoteImage = getIntent().getExtras().getInt("nextNote");
//        Grab the view that we want to set
        ImageView viewNoteImageView = (ImageView) findViewById(R.id.meme_image);

    }
}
