package com.example.alejandro.culturaapp;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityMuseos extends AppCompatActivity {


    Button btn;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmuseos);

        btn=(Button) findViewById(R.id.button11);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivityMuseos.this,MainActivityChichen.class);
                startActivity(a);
            }
        });

        btn1=(Button) findViewById(R.id.button15);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivityMuseos.this,MainActivityTikal.class);
                startActivity(a);
            }
        });

        btn2=(Button) findViewById(R.id.button16);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivityMuseos.this,MainActivityCopan.class);
                startActivity(a);
            }
        });

        btn3=(Button) findViewById(R.id.button17);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivityMuseos.this,MainActivityPalenque.class);
                startActivity(a);
            }
        });

        btn4=(Button) findViewById(R.id.button18);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivityMuseos.this,MainActivityCoba.class);
                startActivity(a);
            }
        });



    }
}
