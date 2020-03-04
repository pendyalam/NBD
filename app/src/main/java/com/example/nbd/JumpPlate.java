package com.example.nbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class JumpPlate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jumpplate_layout);

        EditText measureOne = findViewById(R.id.measureOne);
        String measureOneNum = measureOne.getText().toString();

        EditText measureTwo = findViewById(R.id.measureTwo);
        String measureTwoNum = measureTwo.getText().toString();

        EditText measureFatigue = findViewById(R.id.measureFatigue);
        String measureFatigueNum = measureFatigue.getText().toString();

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
