package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b= findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"From OnClick",100).show();
            }
        });
        b2= findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button2 clicked",100).show();
            }
        });
    }

    @SuppressLint("WrongConstant")
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "On Pause Called",100).show();
    }

    @SuppressLint("WrongConstant")
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"On Resume Called",100).show();
    }


}