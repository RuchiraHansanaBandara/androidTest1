package com.example.test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button  button1,button6,buton1;
    Button button4;
    TextView textview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.btn1);
        buton1 = findViewById(R.id.but1);
        button6 = findViewById(R.id.btn6);
        button4 = findViewById(R.id.btn4);
        button4.setText("Click to go to Activity Two");


        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Activity6ListView.class);
                startActivity(i);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t = new Intent(getApplicationContext(),Activity5.class);
                startActivity(t);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textview1 = findViewById(R.id.text1);
                textview1.setText("Hello Ruchira Bandara");
                button1.setText("go back");

                Toast toast = Toast.makeText(getApplicationContext(),"hellow Ruchira",Toast.LENGTH_SHORT);
                toast.show();


            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Activity2.class);
                startActivity(i);
            }
        });

    }
}