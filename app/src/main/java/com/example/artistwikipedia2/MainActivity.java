package com.example.artistwikipedia2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        audio = new MediaPlayer();
        audio = MediaPlayer.create(this, R.raw.dynamite);
        audio.start();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(MainActivity.this, ArtistListActivity.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(task, 5000);


    }
}