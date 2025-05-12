package com.example.applicationcomponents_muneeb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class BroadCast extends Activity {

    Button btnBroadcast, btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_cast);
        btnBroadcast=findViewById(R.id.btnSendBroadCast);
        btnBack=findViewById(R.id.btnBackToMain);
        btnBroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                broadcastIntent(v);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BroadCast.this, Launcher.class);
                startActivity(intent);
            }
        });

    }
    public void broadcastIntent(View view){
        Intent intent = new Intent();
        intent.setAction("com.tutorialspoint.CUSTOM_INTENT"); sendBroadcast(intent);
    }
}