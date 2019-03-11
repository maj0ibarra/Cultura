package com.example.alejandro.culturaapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityCinco extends AppCompatActivity {

    Button btn9;
    Button btn10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maincinco);


        btn9=(Button) findViewById(R.id.button9);

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivityCinco.this,MainActivityMuseos.class);
                startActivity(a);

            }
        });



    }
}
