package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class fifthsemmanual extends AppCompatActivity {

    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifthsemmanual);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String driveLink = "https://drive.google.com/file/d/1meFSp3Gl6edCtf4mANcWd6jIJfFvl_hg/view?usp=sharing"; // Replace this with your Google Drive link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(driveLink));
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String driveLink = "https://drive.google.com/file/d/12NoAgo0Qdr4FocQ4VHOeCswFtdNy-5uW/view?usp=sharing"; // Replace this with your Google Drive link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(driveLink));
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String driveLink = "https://drive.google.com/file/d/1pcXjlwJgjddse02EHEn_GXZMLKIo_01l/view?usp=sharing"; // Replace this with your Google Drive link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(driveLink));
                startActivity(intent);
            }
        });

    }
}