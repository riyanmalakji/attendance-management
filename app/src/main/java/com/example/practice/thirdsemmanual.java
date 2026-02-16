package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class thirdsemmanual extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdsemmanual);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String driveLink = "https://drive.google.com/file/d/1xh1VnpyM8N4F_XTqmbpBPvBGyEnKEQeE/view?usp=sharing"; // Replace this with your Google Drive link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(driveLink));
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String driveLink = "https://drive.google.com/file/d/1KVLYhzrQEU__gCB1iqZBUt3b3U_saI1C/view?usp=sharing"; // Replace this with your Google Drive link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(driveLink));
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String driveLink = "https://drive.google.com/file/d/1y2IccyHSAiX_GWa2pqoskKxmC9OrOuUW/view?usp=sharing"; // Replace this with your Google Drive link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(driveLink));
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String driveLink = "https://drive.google.com/file/d/1vgBI8t9mUnVUzglxVS_bRNse_pCngMqa/view?usp=sharing"; // Replace this with your Google Drive link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(driveLink));
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String driveLink = "https://drive.google.com/file/d/1booINyjuBbQpNrIEAz-rtdAi1XvTwMjI/view?usp=sharing"; // Replace this with your Google Drive link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(driveLink));
                startActivity(intent);
            }
        });

    }
}