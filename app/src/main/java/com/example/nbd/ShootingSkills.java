package com.example.nbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ShootingSkills extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shootingskills_layout);

        EditText spotOne = findViewById(R.id.spotOne);
        String spotOneNum = spotOne.getText().toString();

        EditText spotTwo = findViewById(R.id.spotTwo);
        String spotTwoNum = spotTwo.getText().toString();

        EditText spotThree = findViewById(R.id.spotThree);
        String spotThreeNum = spotThree.getText().toString();

        EditText spotFour = findViewById(R.id.spotTwo);
        String spotFourNum = spotFour.getText().toString();

        Button home = findViewById(R.id.home);
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
