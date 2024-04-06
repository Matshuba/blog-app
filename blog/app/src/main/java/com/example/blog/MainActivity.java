package com.example.blog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int  SPLASH_SCREEN = 5000;
    Animation bottomAnim, topAnim;
    ImageView splashScreenImage;
    TextView logo,motto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Animations
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        //hooks
        splashScreenImage = findViewById(R.id.splashScreenImage);
        logo = findViewById(R.id.logoText);
        motto = findViewById(R.id.motto);

        splashScreenImage.setAnimation(topAnim);
        logo.setAnimation(bottomAnim);
        motto.setAnimation(bottomAnim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, WelcomePage.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);

    }
}