package com.cs639.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count = 0;  // Initialize a count variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.textView);

        Button toastButton = findViewById(R.id.toast_button);
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a toast message
                Toast.makeText(MainActivity.this, "This is a toast message!", Toast.LENGTH_SHORT).show();
            }
        });

        Button countButton = findViewById(R.id.Count_button);
        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Increase the count by 1
                count++;

                // Update the text of the TextView
                textView.setText(String.valueOf(count));
            }
        });

        Button randomButton = findViewById(R.id.random_button);
        randomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the new activity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                // Pass the current count as an extra to the new activity
                intent.putExtra("currentCount", count);

                // Start the new activity
                startActivity(intent);
            }
        });
    }
}
