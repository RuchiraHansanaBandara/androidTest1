package com.example.test1;

import android.app.Notification;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    Button button11 , button12;
    TextView textView11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        button11 = findViewById(R.id.btn11);
        button12 = findViewById(R.id.btn12);
        textView11 = findViewById(R.id.txt11);

        Intent datas = getIntent();

        String welcome = datas.getStringExtra("GREETING");

        textView11.setText(welcome);

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

        // Email send part


        final Intent chooser;
        Intent Sendmail = new Intent(Intent.ACTION_SEND);
        Sendmail.setData(Uri.parse("mailto:"));
        Sendmail.putExtra(Intent.EXTRA_EMAIL, new String[]{"autolife119@gmail.com"});
        Sendmail.putExtra(Intent.EXTRA_SUBJECT, "About android development");
        Sendmail.putExtra(Intent.EXTRA_TEXT, "This is practice android project before joining office ");
        Sendmail.setType("message/frc822");
        chooser = Intent.createChooser(Sendmail,"Send Mail");

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(chooser);
            }
        });

    }
}