package com.example.nathanaellpez.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class SplashActivity extends AppCompatActivity {

    ImageView imageView;
    ProgressBar progressBar;
    Animation animation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imageView = findViewById(R.id.imageSplash);
        progressBar = findViewById(R.id.progressBar);

        animation= AnimationUtils.loadAnimation(this,R.anim.transitionsplash);
        imageView.startAnimation(animation);

        final Intent intent = new Intent(this, LoginActivity.class);
        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {

                    startActivity(intent);
                    finish();
                }
            }
        };
        thread.start();
    }
}
