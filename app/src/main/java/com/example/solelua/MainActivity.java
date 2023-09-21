package com.example.solelua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.expandable.ExpandableTransformationWidget;

public class MainActivity extends AppCompatActivity {

    private Button historia;
    private Button letra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        historia = findViewById(R.id.btn_historia);
        letra = findViewById(R.id.btn_letra);

        historia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hist = new Intent(getApplicationContext(), HistoriaActivity.class);
                startActivity(hist);
            }
        });

        letra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musica = new Intent(getApplicationContext(), LetraActivity.class);
                startActivity(musica);
            }
        });
    }
}






