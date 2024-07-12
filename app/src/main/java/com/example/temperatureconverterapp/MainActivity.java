package com.example.temperatureconverterapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    AppCompatButton b1,b2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t1 = findViewById(R.id.t);
        Animation sca = AnimationUtils.loadAnimation(this,R.anim.imageanim);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);

        Intent intt = new Intent(this,calculation_d2f.class);
        Intent inn = new Intent(this, cal2.class);


        t1.startAnimation(sca);
//        b1.startAnimation(sca);
//        b2.startAnimation(sca);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(intt);
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(inn);
            }
        });






    }
}