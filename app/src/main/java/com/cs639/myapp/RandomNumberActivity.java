package com.cs639.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class RandomNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Find the TextViews and the "Previous" button
        TextView randomNumberTextView = findViewById(R.id.randomNumberTextView);
        TextView currentCountTextView = findViewById(R.id.currentCountTextView);
        Button previousButton = findViewById(R.id.previousButton);

        // Retrieve the current count from the intent
        int currentCount = getIntent().getIntExtra("currentCount", 0);

        // Generate a random number between 0 and the current count
        int random = (int) (Math.random() * (currentCount + 1));

        // Display the random number and current count in TextViews
        randomNumberTextView.setText("Random Number: " + random);
        currentCountTextView.setText("Current Count: " + currentCount);

        // Handle the "Previous" button click to navigate back to the MainActivity
        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RandomNumberActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}