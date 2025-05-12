package com.example.applicationcomponents_muneeb;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.Context;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Intent Detected.", Toast.LENGTH_LONG).show();
    }
}