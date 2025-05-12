package com.example.applicationcomponents_muneeb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Launcher extends Activity {

    Button btnActivity, btnService, btnBroadcast, btnContent, btnExitApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        btnActivity = findViewById(R.id.btnActivity);
        btnService = findViewById(R.id.btnService);
        btnBroadcast = findViewById(R.id.btnBroadcast);
        btnContent = findViewById(R.id.btnContent);
        btnExitApp = findViewById(R.id.btnExitApp);
        btnActivity.setOnClickListener(v -> {
            startActivity(new Intent(Launcher.this, Services.class));
        });
        btnService.setOnClickListener(v -> {
            startActivity(new Intent(Launcher.this, Services.class));
        });
        btnExitApp.setOnClickListener(v -> {
            finish();
        });
        btnBroadcast.setOnClickListener(v -> {
            startActivity(new Intent(Launcher.this, BroadCast.class));
        });
        btnContent.setOnClickListener(v -> {
            startActivity(new Intent(Launcher.this, Content.class));
        });

    }
}