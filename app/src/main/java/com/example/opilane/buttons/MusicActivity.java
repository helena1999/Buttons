package com.example.opilane.buttons;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MusicActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
    }
    //start music

    public void play(View view) {
        if (mediaPlayer == null)
            mediaPlayer = MediaPlayer.create(this, R.raw.tsirkus);
        mediaPlayer.start();


    }
//pause music

    public void pause(View view) {

        mediaPlayer.pause();
    }
    //stop music

    public void stop(View view) {
        mediaPlayer.stop();
        mediaPlayer = null;
    }
}
