package com.example.android.jurnalburung;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splashscreen extends AppCompatActivity {
    ImageView  imagesplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);


        imagesplash = (ImageView) findViewById(R.id.splash);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.fadeout);
        imagesplash.startAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(Splashscreen.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        },5000);
    }
}
