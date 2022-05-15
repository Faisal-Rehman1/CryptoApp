package com.example.cryptoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowButtonActivity extends AppCompatActivity {

    TextView cryptoBtn, hashBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_button);

//        getSupportActionBar().hide();

        cryptoBtn =findViewById(R.id.cryptoBtn);
        hashBtn = findViewById(R.id.hashBtn);

        cryptoBtn.setOnClickListener(view -> {
            Intent intent = new Intent(ShowButtonActivity.this, CryptographyActivity.class);
            startActivity(intent);
        });

        hashBtn.setOnClickListener(view -> {
            Intent intent = new Intent(ShowButtonActivity.this, HashFunctionActivity.class);
            startActivity(intent);
        });
    }
}