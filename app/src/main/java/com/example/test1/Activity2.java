package com.example.test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    Button button4;
    Button button5;
    TextView textview4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        button4 = findViewById(R.id.btn2);

        textview4 = findViewById(R.id.txt2);

        textview4.setText("wellcome activity two");

        button4.setText("Click to go to Main Activity");

        button5 = findViewById(R.id.btn5);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(i);
            }
        });
        final Intent words = new Intent(this,Activity3.class);

        String name = "Ruchira Bandara";
        int Age = 24;

        words.putExtra("USER_NAME",name);
        words.putExtra("AGE",Age);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(words);
            }
        });


    }
}