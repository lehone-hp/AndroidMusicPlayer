package com.example.lehone.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mPlayButton, mPauseButton, mResetButton;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.p_12555214);
        mediaPlayer.setLooping(true);

        mPlayButton = (Button) findViewById(R.id.button_play);
        mPauseButton = (Button) findViewById(R.id.button_pause);
        mResetButton = (Button) findViewById(R.id.button_reset);

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

        mResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // reset music
                mediaPlayer.pause();
                mediaPlayer.seekTo(0);
                mediaPlayer.start();
            }
        });
    }
}
