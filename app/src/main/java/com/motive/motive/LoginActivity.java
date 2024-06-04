package com.motive.motive;
import android.util.Log;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//public class LoginActivity extends AppCompatActivity {
//    EditText username;
//    EditText password;
//    Button login;
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//        username = findViewById(R.id.username);
//        password = findViewById(R.id.password);
//        login = findViewById(R.id.login);
//
//        login.setOnClickListener((v)-> {
//            Intent intent = new Intent(this, HomePageActivity.class);
//            startActivity(intent);
//        });
//    }
//}

public class LoginActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        if (username == null || password == null || login == null) {
            Log.e("LoginActivity", "One or more views are null!");
        }

        login.setOnClickListener(v -> {
            Intent intent = new Intent(this, HomePageActivity.class);
            startActivity(intent);
        });
    }
}