package com.example.origemapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ReferenciaActivity extends AppCompatActivity {
    Button buttonSite;
    ImageView backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referencia);
        buttonSite = findViewById(R.id.buttonSite);
        backButton = findViewById(R.id.backButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                botaoClick(view);
                Intent backHome = new Intent(ReferenciaActivity.this, MainActivity.class);
                startActivity(backHome);
            }
        });
        buttonSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent implicitIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://seugame.com/slender/"));
                startActivity(implicitIntent1);
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