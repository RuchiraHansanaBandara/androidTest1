package com.example.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class Activity6ListView extends AppCompatActivity {

    ListView listview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity6_list_view);

        listview1 = findViewById(R.id.list1);

        String[] towns = new String[]{"Kurunegala","Galgamuwa","Maho","Kandy","Mathara","Galle","Walasmulla","Sigiriya","Dompe",
                                       "Kekirawa","Pellandeniya","NuwaraEliya","Jaffna","Kilinochchi","Nikaweratiya","Anamaduwa","Puththalam",
                                       "Padeniya","wariyapola","Kandana"};

        ListAdapter ladapter = new ArrayAdapter<String>(this,R.layout.araylist,towns);
        listview1.setAdapter(ladapter);

        listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String city = String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(getApplicationContext(), city, Toast.LENGTH_LONG).show();
            }
        });
    }
}