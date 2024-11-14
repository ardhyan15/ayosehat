package com.example.ayosehat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHealthyFood = findViewById(R.id.btnHealthyFood);
        Button btnSleepPattern = findViewById(R.id.btnSleepPattern);
        Button btnWorkoutSchedule = findViewById(R.id.btnWorkoutSchedule);

        btnHealthyFood.setOnClickListener(v -> startActivity(new Intent(this, ActivityHealthyFood.class)));
        btnSleepPattern.setOnClickListener(v -> startActivity(new Intent(this, ActivitySleepPattern.class)));
        btnWorkoutSchedule.setOnClickListener(v -> startActivity(new Intent(this, ActivityWorkoutSchedule.class)));
    }
}
