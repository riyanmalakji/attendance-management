package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class secondsemmanual extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondsemmanual);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String driveLink = "https://drive.google.com/file/d/1zQFxIB1u8t1wH5KwEp84a7ywcP6Bo2P9/view?usp=sharing"; // Replace this with your Google Drive link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(driveLink));
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String driveLink = "https://drive.google.com/file/d/1DjZ-ZK0H5XNwREC6bhBL9Jts4NPnnz1q/view?usp=sharing"; // Replace this with your Google Drive link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(driveLink));
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String driveLink = "https://drive.google.com/file/d/1MnWShIThcbvmxyAjbi6cduYoia5x9Oid/view?usp=sharing"; // Replace this with your Google Drive link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(driveLink));
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String driveLink = "https://drive.google.com/file/d/1WdlOh6UAS46yuoX5ZVHJF7m2eCEujm0J/view?usp=sharing"; // Replace this with your Google Drive link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(driveLink));
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String driveLink = "https://drive.google.com/file/d/1WNuDjTcuWsCfbT1eqC_Ta3k9VIlTk556/view?usp=sharing"; // Replace this with your Google Drive link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(driveLink));
                startActivity(intent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String driveLink = "https://drive.google.com/file/d/1YghUTFGZgF5Wp0-XqZAB1A6qYRqMt_p9/view?usp=sharing"; // Replace this with your Google Drive link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(driveLink));
                startActivity(intent);
            }
        });
    }
}