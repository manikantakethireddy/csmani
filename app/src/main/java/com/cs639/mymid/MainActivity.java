package com.cs639.mymid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText litersInput = findViewById(R.id.litersInput);
        final TextView cupsOutput = findViewById(R.id.cupsOutput);
        TextView developerNameTextView = findViewById(R.id.developerName); // Add this line

        // Set your name in the TextView
        developerNameTextView.setText("Manikanta");

        Button convertButton = findViewById(R.id.convertButton);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double liters = Double.parseDouble(litersInput.getText().toString());
                    double cups = liters * 4.22;
                    cupsOutput.setText(String.format("%.2f liters is %.2f cups", liters, cups));
                } catch (NumberFormatException e) {
                    cupsOutput.setText("Please enter a valid number of liters.");
                }
            }
        });
    }
}