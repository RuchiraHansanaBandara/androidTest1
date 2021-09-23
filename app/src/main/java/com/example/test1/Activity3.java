package com.example.test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Activity3 extends AppCompatActivity {

    TextView textview1,textview2;

    Button button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        textview1 = findViewById(R.id.txt1);

        textview2 = findViewById(R.id.txt9);

        button8 = findViewById(R.id.btn8);


        Intent words = getIntent();

        String name = words.getStringExtra("USER_NAME");

        int Age = words.getIntExtra("AGE",0);
        
        textview1.setText(name);

        textview2.setText(String.valueOf(Age));

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}