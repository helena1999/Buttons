package com.example.opilane.buttons;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        //sets the view context
        setContentView(R.layout.activity_video);
        //get videoview from the resources
        VideoView vView = findViewById(R.id.videoView1);
        //use this to get touch events
        vView.requestFocus();
        //have to load video from the recource folder
        //set video path + add raw resource
        String vSource = "android.resource://com.example.opilane.buttons/" + R.raw.mm;
        //set the video URI, passing the vSource as URI
        vView.setVideoURI(Uri.parse(vSource));
        //enable this if you want to enable video controllers such as pause and forward
        vView.setMediaController(new MediaController(this));
        //plays the video
        vView.start();
    }

    public void playMusic(View view) {
        Intent intent = new Intent(VideoActivity.this,MusicActivity.class);
        startActivity(intent);
    }
}
