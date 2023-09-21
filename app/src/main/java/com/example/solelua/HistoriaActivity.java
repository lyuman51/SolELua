package com.example.solelua;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HistoriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.historia);

        Button voltar = findViewById(R.id.menu2);

        voltar.setOnClickListener(view -> {

            Intent voltarMenu = new Intent(HistoriaActivity.this, MainActivity.class);
            startActivity(voltarMenu);
        });
    }
}
