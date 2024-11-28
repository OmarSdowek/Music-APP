package com.example.mymediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

ImageView play , pause ;

MediaPlayer mp ;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = findViewById(R.id.imageView8);
        pause = findViewById(R.id.imageView9);

        mp = new MediaPlayer();

    mp =MediaPlayer.create(this , R.raw.mm);
play.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
      if(!mp.isPlaying()){
          mp.start();
      }
    }
});
        pause.setOnClickListener(
                v -> {
                   if(mp.isPlaying()){
                       mp.pause();

                   }

                }

        );

    }

}