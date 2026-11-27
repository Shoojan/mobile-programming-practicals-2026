package com.example.mobileprogrammingpracticals2026;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HimActivity extends AppCompatActivity {

    private final String[] gifts = { "Flowers", "Chocolate", "Ghar", "Nadini" };

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
        ArrayAdapter<String> giftListAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                this.gifts
        );
        giftListAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        himGiftSpinner.setAdapter(giftListAdapter);

        // Listener for Spinner selection
        himGiftSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedGift = gifts[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}