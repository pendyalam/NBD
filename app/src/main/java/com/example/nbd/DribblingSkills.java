package com.example.nbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class DribblingSkills extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dribblingskills_layout);

        EditText halfDom = findViewById(R.id.halfDom);
        String halfDomNum = halfDom.getText().toString();

        EditText halfNon = findViewById(R.id.halfNon);
        String halfNonNum = halfNon.getText().toString();

        EditText zigBall = findViewById(R.id.zigBall);
        String zigBallNum = zigBall.getText().toString();

        EditText zigNoBall = findViewById(R.id.zigNoBall);
        String zigNoBallNum = zigNoBall.getText().toString();

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
