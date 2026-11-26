package com.example.mobileprogrammingpracticals2026;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HimActivity extends AppCompatActivity {

    private final String[] gifts = { "Flowers", "Chocolate" };

    private String selectedGift;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_him);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Spinner himGiftSpinner = findViewById(R.id.himGiftSpinner);
        Button giftSendBtn = findViewById(R.id.giftSendBtn);

        // Set up entries in Spinner


        // Listener for Spinner selection

    }
}