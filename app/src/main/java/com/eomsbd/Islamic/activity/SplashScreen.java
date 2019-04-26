package com.eomsbd.Islamic.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.eomsbd.Islamic.R;

public class SplashScreen extends AppCompatActivity {
    ImageView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        text=findViewById(R.id.imageView);
        Animation animation= AnimationUtils.loadAnimation( this, R.anim.bouncher);
        text.startAnimation(animation);
        new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {

                    Intent intent = new Intent( SplashScreen.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        }.start();
    }
}
