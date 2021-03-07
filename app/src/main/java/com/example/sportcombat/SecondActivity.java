package com.example.sportcombat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView receiver_D;
    TextView receiver_A;
    TextView receiver_C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        receiver_D = (TextView)findViewById(R.id.textDate);
        receiver_A = (TextView)findViewById(R.id.textAffil);
        receiver_C = (TextView)findViewById(R.id.textCarac);

        Intent intent = getIntent();

        String stD = intent.getStringExtra("message_dateW");
        receiver_D.setText(stD);

        String stA = intent.getStringExtra("message_affilW");
        receiver_A.setText(stA);

        String stC = intent.getStringExtra("message_caracW");
        receiver_C.setText(stC);
    }
}