package com.example.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Activity7IMGlistview extends AppCompatActivity {

    ListView imglistView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity7_imglistview);

        String[] calls = new String[]{"Ruwan","kamal","Nuwan","Dasun","Wasath","Pasindu","Sarath","Thiwamka","Ashen"};

        ArrayAdapter misscalladapter = new ArrayAdapter<String>(this,R.layout.imglistview,R.id.imgtextView,calls);

        imglistView = findViewById(R.id.imglistview);

        imglistView.setAdapter(misscalladapter);
    }
}