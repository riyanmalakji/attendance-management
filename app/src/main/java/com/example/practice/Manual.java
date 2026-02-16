package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;


public class Manual extends AppCompatActivity {
CardView onesem,twosem,threesem,foursem,fivesem,sixsem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        onesem = findViewById(R.id.onesem);
        twosem = findViewById(R.id.twosem);
        threesem = findViewById(R.id.threesem);
        foursem = findViewById(R.id.foursem);
        fivesem = findViewById(R.id.fivesem);
        sixsem = findViewById(R.id.sixsem);




    onesem.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Manual.this, onesemmanual.class);
            startActivity(intent);
        }
    });
        twosem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Manual.this, secondsemmanual.class);
                startActivity(intent);
            }
        });
        threesem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Manual.this, thirdsemmanual.class);
                startActivity(intent);
            }
        });
        foursem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Manual.this, fourthsemmanual.class);
                startActivity(intent);
            }
        });
        fivesem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Manual.this, fifthsemmanual.class);
                startActivity(intent);
            }
        });
        sixsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Manual.this, sixthsemmanual.class);
                startActivity(intent);
            }
        });

    }

}