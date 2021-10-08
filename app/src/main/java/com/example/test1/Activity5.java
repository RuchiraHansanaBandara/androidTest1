package com.example.test1;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity5 extends AppCompatActivity {

    Button button01 , button02;
    EditText edittext1, edittext2;

    String name;
    int Age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        button01 = findViewById(R.id.btn01);
        button02 = findViewById(R.id.btn02);
        edittext1 = findViewById(R.id.name1);
        edittext2 = findViewById(R.id.age1);

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = edittext1.getText().toString();
                Age = Integer.parseInt(edittext2.getText().toString());

                SharedPreferences first = getSharedPreferences("details",MODE_PRIVATE);
                SharedPreferences.Editor edito = first.edit();
                edito.putString("Name",name);
                edito.putInt("Age",Age);
                edito.commit();
                Toast.makeText(getApplicationContext(),"Data Saved", Toast.LENGTH_SHORT).show();
            }
        });
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences first = getSharedPreferences("details",MODE_PRIVATE);
                String name = first.getString("Name","No name");
                int Age = first.getInt("Age",0);
                Toast.makeText(getApplicationContext(), "Your name : "+name+"  Your Age :"+Age, Toast.LENGTH_LONG).show();
            }
        });
    }
}