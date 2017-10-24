package com.example.krithika.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NotificationReceived extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_received);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = "Notification Received!";

        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.textView3);
        textView.setText(message);
    }
}
