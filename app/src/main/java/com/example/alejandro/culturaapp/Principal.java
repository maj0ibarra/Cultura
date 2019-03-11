package com.example.alejandro.culturaapp;


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;


public class Principal extends AppCompatActivity {
    ProgressBar progb;
    int counter=0;


   private static int splash=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent homeIntent = new Intent(Principal.this,MainActivityIniciar.class);
                startActivity(homeIntent);
                finish();
            }
        },splash);


    }


}


