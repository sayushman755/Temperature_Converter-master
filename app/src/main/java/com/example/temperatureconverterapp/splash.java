package com.example.temperatureconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;

public class splash extends AppCompatActivity {
    LottieAnimationView lt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        lt = findViewById(R.id.lotty);
        Intent intt = new Intent(this, MainActivity.class);
        lt.setAnimation(R.raw.animation_llru2f0m);
        lt.playAnimation();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intt);
                finish();
            }
        },4000);
    }
}