package com.example.nbd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton soccer = findViewById(R.id.soccer);
        ImageButton basketball = findViewById(R.id.basketball);
        ImageButton profile = findViewById(R.id.profile);

        soccer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        basketball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, SoccerActivity.class);
        startActivity(intent);
    }

    public void openActivity3() {
        Intent intent = new Intent(this, BasketballActivity.class);
        startActivity(intent);
    }

    public void openActivity4() {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}

