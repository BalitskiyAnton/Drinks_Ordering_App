package com.example.drinksorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText userNameEditText;
    private EditText passwordEditText;
    private Button button;

    String userName;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                userName = userNameEditText.getText().toString().trim();
                password = passwordEditText.getText().toString().trim();

                if (userName.isEmpty() || password.isEmpty()) {
                    Toast toast = Toast.makeText(MainActivity.this, R.string.eror_field, Toast.LENGTH_SHORT);
                    toast.show();

                } else {
                   launchNewScreen(userName);
                }
            }
        });

        }

    private void initViews() {
        userNameEditText = findViewById(R.id.editTextTextPersonName);
        passwordEditText = findViewById(R.id.editTextNumberPassword);
        button = findViewById(R.id.buttonEnter);

    }

    private void launchNewScreen (String userName) {
        Intent intent = OrderActivity.newIntent(this, userName);
        startActivity(intent);
    }
}