package com.example.experienciadeusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.widget.FrameLayout;
import android.widget.Toast;

public class Splash extends AppCompatActivity {

    private final Handler handler = new Handler();

    private final Runnable runnable = () -> {
        if(!isFinishing()) {
            navigateToNextActivity();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                navigateToNextActivity();
            }
        }, 5000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.handler.removeCallbacks(this.runnable);
    }
    void navigateToNextActivity(){
        finish();
        startActivity(new Intent(Splash.this, LoginActivity.class));
    }
}