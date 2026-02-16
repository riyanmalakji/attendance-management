package com.example.practice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class five extends AppCompatActivity {
    Button btn, reset;
    CheckBox priyan, ariyan, pshafe, ashafe, pamaan, aamaan, pshoeb, ashoeb, pganesh, aganesh, pkrishna, akrishna, paditya, aaditya, pgaurav, agaurav, pswapnil, aswapnil, pom, aom, prohan, arohan, pshaurya, ashaurya;
    DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        mDatabase = FirebaseDatabase.getInstance().getReference();

        btn = findViewById(R.id.btn);
        reset = findViewById(R.id.reset);
        priyan = findViewById(R.id.priyan);
        ariyan = findViewById(R.id.ariyan);
        pshafe = findViewById(R.id.pshafe);
        ashafe = findViewById(R.id.ashafe);
        pamaan = findViewById(R.id.pamaan);
        aamaan = findViewById(R.id.aamaan);
        pshoeb = findViewById(R.id.pshoeb);
        ashoeb = findViewById(R.id.ashoeb);
        pganesh = findViewById(R.id.pganesh);
        aganesh = findViewById(R.id.aganesh);
        pkrishna = findViewById(R.id.pkrishna);
        akrishna = findViewById(R.id.akrishna);
        paditya = findViewById(R.id.paditya);
        aaditya = findViewById(R.id.aaditya);
        pgaurav = findViewById(R.id.pgaurav);
        agaurav = findViewById(R.id.agaurav);
        pswapnil = findViewById(R.id.pswapnil);
        aswapnil = findViewById(R.id.aswapnil);
        pom = findViewById(R.id.pom);
        aom = findViewById(R.id.aom);
        prohan = findViewById(R.id.prohan);
        arohan = findViewById(R.id.arohan);
        pshaurya = findViewById(R.id.pshaurya);
        ashaurya = findViewById(R.id.ashaurya);

        priyan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ariyan.setChecked(false);
                }
            }
        });
        ariyan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    priyan.setChecked(false);
                }
            }
        });
        pshafe.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ashafe.setChecked(false);
                }
            }
        });
        ashafe.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    pshafe.setChecked(false);
                }
            }
        });
        pamaan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    aamaan.setChecked(false);
                }
            }
        });
        aamaan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    pamaan.setChecked(false);
                }
            }
        });
        pshoeb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ashoeb.setChecked(false);
                }
            }
        });
        ashoeb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    pshoeb.setChecked(false);
                }
            }
        });
        pganesh.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    aganesh.setChecked(false);
                }
            }
        });
        aganesh.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    pganesh.setChecked(false);
                }
            }
        });
        pkrishna.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    akrishna.setChecked(false);
                }
            }
        });
        akrishna.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    pkrishna.setChecked(false);
                }
            }
        });
        paditya.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    aaditya.setChecked(false);
                }
            }
        });
        aaditya.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    paditya.setChecked(false);
                }
            }
        });
        pgaurav.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    agaurav.setChecked(false);
                }
            }
        });
        agaurav.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    pgaurav.setChecked(false);
                }
            }
        });
        pswapnil.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    aswapnil.setChecked(false);
                }
            }
        });
        aswapnil.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    pswapnil.setChecked(false);
                }
            }
        });
        pom.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    aom.setChecked(false);
                }
            }
        });
        aom.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    pom.setChecked(false);
                }
            }
        });
        prohan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    arohan.setChecked(false);
                }
            }
        });
        arohan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    prohan.setChecked(false);
                }
            }
        });
        ashaurya.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    pshaurya.setChecked(false);
                }
            }
        });
        pshaurya.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ashaurya.setChecked(false);
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveDataToFirebase();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetForm();
            }
        });
    }

    private void saveDataToFirebase() {
        Map<String, Object> attendanceMap = new HashMap<>();
        String key = mDatabase.child("Attendance").push().getKey();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        String dateTime = dateFormat.format(new Date());
        attendanceMap.put("DateTime  "  + "5th Semester", dateTime);

        // Define an array of student names and their corresponding checkboxes
        String[] studentNames = {"Riyan","Shafe","Amaan","Shoeb","Ganesh","Krishna", "Aditya","Gaurav","Swapnil","Om","Rohan", "Shaurya"};
        CheckBox[] checkboxes = {priyan, ariyan, pshafe, ashafe, pamaan, aamaan, pshoeb, ashoeb, pganesh, aganesh, pkrishna, akrishna, paditya, aaditya, pgaurav, agaurav, pswapnil, aswapnil, pom, aom, prohan, arohan, pshaurya, ashaurya};

        // Iterate over each student
        for (int i = 0; i < studentNames.length; i++) {
            String studentName = studentNames[i];
            CheckBox checkBoxPresent = checkboxes[i * 2]; // Index of Present checkbox
            CheckBox checkBoxAbsent = checkboxes[i * 2 + 1]; // Index of Absent checkbox
            String attendanceStatus;

            // Determine attendance status based on checkbox state
            if (checkBoxPresent.isChecked()) {
                attendanceStatus = "Present";
            } else if (checkBoxAbsent.isChecked()) {
                attendanceStatus = "Absent";
            } else {
                // Default to Absent if neither checkbox is checked
                attendanceStatus = "Not defined";
            }

            attendanceMap.put(studentName, attendanceStatus);
        }

        // Save attendance data to Firebase
        mDatabase.child("Attendance").child(key).setValue(attendanceMap)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        Toast.makeText(getApplicationContext(), "Attendance saved successfully!", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(getApplicationContext(), "Failed to save attendance: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void resetForm() {
        priyan.setChecked(false);
        ariyan.setChecked(false);
        pshafe.setChecked(false);
        ashafe.setChecked(false);
        pamaan.setChecked(false);
        aamaan.setChecked(false);
        pshoeb.setChecked(false);
        ashoeb.setChecked(false);
        pganesh.setChecked(false);
        aganesh.setChecked(false);
        pkrishna.setChecked(false);
        akrishna.setChecked(false);
        paditya.setChecked(false);
        aaditya.setChecked(false);
        pgaurav.setChecked(false);
        agaurav.setChecked(false);
        pswapnil.setChecked(false);
        aswapnil.setChecked(false);
        pom.setChecked(false);
        aom.setChecked(false);
        prohan.setChecked(false);
        arohan.setChecked(false);
        pshaurya.setChecked(false);
        ashaurya.setChecked(false);

        Toast.makeText(getApplicationContext(), "Attendace reset", Toast.LENGTH_SHORT).show();
    }
}
