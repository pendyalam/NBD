package com.example.nbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_layout);

        EditText age = findViewById(R.id.age);
        String ageInput = age.getText().toString();

        EditText gender = findViewById(R.id.gender);
        String genderInput = gender.getText().toString();

        EditText varsity = findViewById(R.id.varsity);
        String varsityInput = varsity.getText().toString();

        EditText position = findViewById(R.id.position);
        String positionInput = position.getText().toString();

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
