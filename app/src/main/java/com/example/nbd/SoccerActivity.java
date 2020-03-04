package com.example.nbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoccerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soccer_layout);

        Button home = findViewById(R.id.home);
        Button ballTaps = findViewById(R.id.ballTaps);
        Button shootingPower = findViewById(R.id.shootingPower);
        Button proAgility = findViewById(R.id.proAgility);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
        ballTaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBallTapsActivity();
            }
        });
        shootingPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShootingPowerActivity();
            }
        });
        proAgility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProAgilityActivity();
            }
        });
    }

    public void openActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openBallTapsActivity(){
        Intent intent = new Intent(this, BallTaps.class);
        startActivity(intent);
    }

    public void openShootingPowerActivity(){
        Intent intent = new Intent(this, ShootingPower.class);
        startActivity(intent);
    }

    public void openProAgilityActivity(){
        Intent intent = new Intent(this, ProAgility.class);
        startActivity(intent);
    }
}
