package com.example.nbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BasketballActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basketball_layout);

        ImageButton home = findViewById(R.id.home);
        Button shootingSkills = findViewById(R.id.shooting);
        Button jumpPlate = findViewById(R.id.jumpPlate);
        Button dribblingSkills = findViewById(R.id.dribbling);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
        shootingSkills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShootingSkillsActivity();
            }
        });
        jumpPlate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJumpPlateActivity();
            }
        });
        dribblingSkills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openDribblingSkillsActivity();
            }
        });
    }

    public void openActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openShootingSkillsActivity() {
        Intent intent = new Intent(this, ShootingSkills.class);
        startActivity(intent);
    }

    public void openJumpPlateActivity() {
        Intent intent = new Intent(this, JumpPlate.class);
        startActivity(intent);
    }

    public void openDribblingSkillsActivity() {
        Intent intent = new Intent(this, DribblingSkills.class);
        startActivity(intent);
    }
}
