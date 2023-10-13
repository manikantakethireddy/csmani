package com.cs639.myapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second); // Set the content view to your XML layout

        // Retrieve the current count from the intent
        int currentCount = getIntent().getIntExtra("currentCount", 0);

        // Example: Display the current count in a TextView
        TextView countTextView = findViewById(R.id.countTextView);
        countTextView.setText("Current Count: " + currentCount);
    }
}