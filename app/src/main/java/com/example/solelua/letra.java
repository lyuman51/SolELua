package com.example.solelua;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

class LetraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.letra);

        Button btnMenu = findViewById(R.id.btn_menu);

        btnMenu.setOnClickListener(view -> {
            Intent link = new Intent(LetraActivity.this, MainActivity.class);
            startActivity(link);
        });

        ImageButton btnYoutube = findViewById(R.id.btn_youtube);

        btnYoutube.setOnClickListener(v -> {

            abrirYouTube();
        });
    }

    private void abrirYouTube() {
        String url = "https://https://www.youtube.com/watch?v=HbIC6c3p3Qo"; // URL do canal ou vídeo do YouTube
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}
        
