package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class fourthsemmanual extends AppCompatActivity {

    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthsemmanual);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String driveLink = "https://drive.google.com/file/d/1WfsbdcY_0RxkwQDGb87245LTs7NOYKBj/view?usp=sharing"; // Replace this with your Google Drive link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(driveLink));
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String driveLink = "https://drive.google.com/file/d/1-Whn17XI1HFJtcG-xuOp21oTu_CGWufg/view?usp=sharing"; // Replace this with your Google Drive link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(driveLink));
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String driveLink = "https://drive.google.com/file/d/1ZSoPRFUWK1YR2m8WJMSzJ4DPxoN2D3BD/view?usp=sharing"; // Replace this with your Google Drive link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(driveLink));
                startActivity(intent);
            }
        });
    }
}