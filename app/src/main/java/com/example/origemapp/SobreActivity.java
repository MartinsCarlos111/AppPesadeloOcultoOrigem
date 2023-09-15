package com.example.origemapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SobreActivity extends AppCompatActivity {
    Button mapButton;
    ImageView backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
        backButton = findViewById(R.id.backButton);
        mapButton = findViewById(R.id.buttonMap);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                botaoClick(view);
                Intent backHome = new Intent(SobreActivity.this, MainActivity.class);
                startActivity(backHome);
            }
        });
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri location= Uri.parse("geo:0,0?q=St.+Louis,+Missouri,+EUA");
                Intent mapIntent= new Intent(Intent.ACTION_VIEW, location);
                startActivity(mapIntent);

            }
        });
    }
    public void botaoClick(View v) {
        Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        long milliseconds = 500;
        if(vibrator != null && vibrator.hasVibrator()) {
            vibrator.vibrate(milliseconds);
        }
    }
}