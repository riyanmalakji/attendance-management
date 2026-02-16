package com.example.practice;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class us extends AppCompatActivity {

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_us);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        mDatabase = FirebaseDatabase.getInstance().getReference();

        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitContactForm();
            }
        });
    }

    private void submitContactForm() {
        String name = ((TextInputEditText) findViewById(R.id.nameEditText)).getText().toString();
        String email = ((TextInputEditText) findViewById(R.id.emailEditText)).getText().toString();
        String phone = ((TextInputEditText) findViewById(R.id.phoneEditText)).getText().toString();
        String classStr = ((TextInputEditText) findViewById(R.id.classEditText)).getText().toString();
        String rollNumber = ((TextInputEditText) findViewById(R.id.rollNumberEditText)).getText().toString();
        if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(email) && !TextUtils.isEmpty(phone)
                && !TextUtils.isEmpty(classStr) && !TextUtils.isEmpty(rollNumber)) {
            Contact contact = new Contact(name, email, phone, classStr, rollNumber);
            mDatabase.child("contacts").push().setValue(contact)
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(us.this, "Form submitted successfully", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(us.this, "Failed to submit form", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        } else {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
        }
    }
}

