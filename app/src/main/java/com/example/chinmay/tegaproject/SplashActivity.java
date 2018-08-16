package com.example.chinmay.tegaproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    private int SPLASH_TIMER =2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //full screen


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);


        ImageView iv = findViewById(R.id.tega_logo);
        Animation an = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        iv.startAnimation(an);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashScreen = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(splashScreen);
                finish();

            }
        },SPLASH_TIMER);
    }
}
