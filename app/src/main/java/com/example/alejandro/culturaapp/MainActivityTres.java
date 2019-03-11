package com.example.alejandro.culturaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityTres extends AppCompatActivity {

    Button btn2;
    Button btn3;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintres);

        btn2=(Button) findViewById(R.id.button5);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivityTres.this,MainActivityComida.class);
                startActivity(a);
            }
        });
        btn3=(Button) findViewById(R.id.button6);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivityTres.this, MainActivityCuatro
                        .class);
                startActivity(a);

            }
        });



    }
}