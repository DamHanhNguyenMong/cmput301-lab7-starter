package com.example.androiduitesting;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.androiduitesting.databinding.ActivityShowBinding;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        // Get the city name from the intent
        String cityName = getIntent().getStringExtra("city_name");

        // Find views
        TextView cityTextView = findViewById(R.id.cityNameText);
        Button backButton = findViewById(R.id.backButton);

        // Display the city name
        cityTextView.setText(cityName);

        // Back button to go to MainActivity
        backButton.setOnClickListener(v -> {
            finish(); // simply finishes and goes back
        });
    }
}

