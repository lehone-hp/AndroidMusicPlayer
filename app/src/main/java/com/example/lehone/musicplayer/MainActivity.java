package com.example.lehone.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mPlayButton, mPauseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.p_12555214);
        mPlayButton = (Button) findViewById(R.id.button_play);
        mPauseButton = (Button) findViewById(R.id.button_pause);

        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // play music
                mediaPlayer.start();
            }
        });

        mPauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // pause music
                mediaPlayer.pause();
            }
        });
    }
}
