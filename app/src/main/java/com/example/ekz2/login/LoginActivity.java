package com.example.ekz2.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ekz2.R;
import com.example.ekz2.models.LoginModel;
import com.example.ekz2.models.LoginResponse;
import com.example.ekz2.network.JSONapi;
import com.example.ekz2.network.networkservice;
import com.example.ekz2.pop.PopActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
private EditText email;
private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button signButton =findViewById(R.id.sign_button);
        signButton.setOnClickListener(this);
        email=findViewById(R.id.Email);
        password=findViewById(R.id.Password);
    }

    @Override
    public void onClick(View view) {
        new networkservice().retrofit.create(JSONapi.class).login(new LoginModel(email.getText().toString(), password.getText().toString())).enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
            if(response.code()/100==2){
                Intent signinInnet = new Intent(getApplicationContext(), PopActivity.class);
                startActivity(signinInnet);
            }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Toast.makeText(LoginActivity.this, "Проверьте логин и пароль", Toast.LENGTH_LONG).show();
            }
        });


    }
}