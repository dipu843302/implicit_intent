package com.example.interntandilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView tva,tvb,tvc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       tva=findViewById(R.id.tv1);
       tvb=findViewById(R.id.tv2);
       tvc=findViewById(R.id.tv3);
       tva.setText(getIntent().getStringExtra("name"));
       tvb.setText(getIntent().getStringExtra("last"));
       tvc.setText(getIntent().getStringExtra("age"));
    }
}