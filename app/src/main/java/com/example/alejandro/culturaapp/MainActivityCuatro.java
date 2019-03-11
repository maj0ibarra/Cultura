package com.example.alejandro.culturaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityCuatro extends AppCompatActivity {

    Button btn4;
    Button btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maincuatro);


        btn4=(Button) findViewById(R.id.button7);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivityCuatro.this,MainActivityHistoria.class);
                startActivity(a);

            }
        });
        btn5=(Button) findViewById(R.id.button8);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivityCuatro.this,MainActivityCinco.class);
                startActivity(a);

            }
        });
    }
}