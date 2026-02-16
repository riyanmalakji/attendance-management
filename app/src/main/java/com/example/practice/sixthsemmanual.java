package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class sixthsemmanual extends AppCompatActivity {

    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixthsemmanual);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String driveLink = "https://drive.google.com/file/d/1p7AoHylEAIvIvCXb6MStzd2PFvgin1-1/view?usp=sharing"; // Replace this with your Google Drive link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(driveLink));
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String driveLink = "https://drive.google.com/file/d/1Nv24p2U9xAUP-s2A0glH6w6IMei1ZvvP/view?usp=sharing"; // Replace this with your Google Drive link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(driveLink));
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String driveLink = "https://drive.google.com/file/d/1BHbO7uGv6VL0sloct7ygXPGpJ96st2sT/view?usp=sharing"; // Replace this with your Google Drive link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(driveLink));
                startActivity(intent);
            }
        });
    }
}