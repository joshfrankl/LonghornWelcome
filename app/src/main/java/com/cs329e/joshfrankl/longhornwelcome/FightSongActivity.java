package com.cs329e.joshfrankl.longhornwelcome;

import android.media.MediaPlayer;
import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class FightSongActivity extends AppCompatActivity {

    MediaPlayer mySound;
    int paused;
    private TextView texasFightLyrics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight_song);

        texasFightLyrics = (TextView) findViewById(R.id.texasFightLyrics);
        texasFightLyrics.setText("Texas Fight, Texas Fight,\n" +
                "And it's goodbye to A&M.\n" +
                "Texas Fight, Texas Fight,\n" +
                "And we'll put over one more win.\n" +
                "Texas Fight, Texas Fight,\n" +
                "For it's Texas that we love best.\n" +
                "Hail, Hail, The gang's all here,\n" +
                "And it's good-bye to all the rest!\n" +
                "\n" +
                "(YELL)\n" +
                "Yea Orange! Yea White!\n" +
                "Yea Longhorns! Fight! Fight! Fight!\n" +
                "Texas Fight! Texas Fight,\n" +
                "Yea Texas Fight!\n" +
                "Texas Fight! Texas Fight,\n" +
                "Yea Texas Fight!\n" +
                "\n" +
                "The Eyes of Texas are upon you,\n" +
                "All the livelong day.\n" +
                "The Eyes of Texas are upon you,\n" +
                "You cannot get away.\n" +
                "Texas Fight, Texas Fight,\n" +
                "For it's Texas that we love best.\n" +
                "Hail, Hail, The gang's all here,\n" +
                "And it good-bye to all the rest!\n" +
                "\n" +
                "Note: The line, \"Hail, Hail, the gang's all here\" is usually replaced with \"Give 'em hell, Give 'em hell, Go Horns Go!\"");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void pause(View view) {
        mySound.pause();
        paused=mySound.getCurrentPosition();
    }

    public void stop(View view) {
        mySound.release();
        mySound=null;

    }

    public void play(View view) {
        if(mySound==null) {
            mySound = MediaPlayer.create(this, R.raw.texas_fight);
            mySound.start();
        } else if (!mySound.isPlaying()){
            mySound.seekTo(paused);
            mySound.start();
        }
    }

    @Override
    public void onBackPressed() {
        mySound.release();
        mySound = null;
        this.finish();

        super.onBackPressed();
    }
}
