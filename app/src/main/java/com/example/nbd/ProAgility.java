package com.example.nbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class ProAgility extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.proagility_layout);

        EditText laserLeft = findViewById(R.id.laserLeft);
        String laserLeftNum = laserLeft.getText().toString();

        EditText laserRight = findViewById(R.id.laserRight);
        String laserRightNum = laserRight.getText().toString();

        EditText watchLeft = findViewById(R.id.watchLeft);
        String watchLeftNum = watchLeft.getText().toString();

        EditText watchRight = findViewById(R.id.watchRight);
        String watchRightNum = watchRight.getText().toString();

        ImageButton home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }

    public void openActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
