package com.example.ekz2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.ekz2.boarding.BoardingActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent intent1=new Intent(MainActivity.this, BoardingActivity.class);
               startActivity(intent1);
           }
       }, 2000);
    }


}