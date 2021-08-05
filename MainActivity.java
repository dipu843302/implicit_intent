package com.example.interntandilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText eta,etb,etc;
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eta=findViewById(R.id.et1);
        etb=findViewById(R.id.et2);
        etc=findViewById(R.id.et3);
        button=findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String name=eta.getText().toString();
                String last=etb.getText().toString();
                String age=etc.getText().toString();
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name",name);
                intent.putExtra("last",last);
                intent.putExtra("age",age);
                startActivity(intent);
            }
        });
    }
}