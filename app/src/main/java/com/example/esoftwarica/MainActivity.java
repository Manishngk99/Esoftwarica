package com.example.esoftwarica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etUsername, etPassword;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etEUsername);
        etPassword = findViewById(R.id.etLoginpassword);
        btnLogin = findViewById(R.id.btnLogin);


        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (etUsername.getText().toString().equals("manish")
                && etPassword.getText().toString().equals("manish")){

            Intent intent = new Intent(MainActivity.this, ButtonNavigation.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Invalid detail", Toast.LENGTH_SHORT).show();
        }

    }
}
