package com.example.origemapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnHistory, btnRegras, btnJogabilidade, btnSobre, btnReferencia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHistory = findViewById(R.id.botaoHistoria);
        btnRegras = findViewById(R.id.botaoRegras);
        btnJogabilidade = findViewById(R.id.botaoJogabilidade);
        btnSobre = findViewById(R.id.botaoSobre);
        btnReferencia = findViewById(R.id.botaoReferencia);

        btnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botaoClick(v);
                Intent HistoryScreen = new Intent(MainActivity.this, HistoriaActivity.class);
                startActivity(HistoryScreen);
            }
        });
        btnRegras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botaoClick(v);
                Intent HistoryScreen = new Intent(MainActivity.this, RegrasActivity.class);
                startActivity(HistoryScreen);
            }
        });
        btnJogabilidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botaoClick(v);
                Intent HistoryScreen = new Intent(MainActivity.this, JogabilidadeActivity.class);
                startActivity(HistoryScreen);
            }
        });
        btnSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botaoClick(v);
                Intent HistoryScreen = new Intent(MainActivity.this, SobreActivity.class);
                startActivity(HistoryScreen);
            }
        });
        btnReferencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botaoClick(v);
                Intent HistoryScreen = new Intent(MainActivity.this, ReferenciaActivity.class);
                startActivity(HistoryScreen);
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