package com.example.ekz2.boarding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ekz2.R;
import com.example.ekz2.login.LoginActivity;

public class BoardingActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boarding);
        Button login = findViewById(R.id.login_in);
        login.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view) {
      Intent newint =new Intent(getApplicationContext(), LoginActivity.class);
      startActivity(newint);
    }
}