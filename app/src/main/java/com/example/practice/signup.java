package com.example.practice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class signup extends AppCompatActivity {

    TextView sign;
    Button btn, btn2;
    FirebaseAuth mauth;
    EditText email, name, pass;
    CheckBox showPasswordCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        sign = findViewById(R.id.sign);
        btn = findViewById(R.id.btn);
        mauth = FirebaseAuth.getInstance();
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        name = findViewById(R.id.name);
        btn2 = findViewById(R.id.btn2);
        CheckBox showPasswordCheckbox = findViewById(R.id.showPasswordCheckbox);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signup.this, Login.class);
                startActivity(intent);
                Toast.makeText(signup.this, "Please Login", Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signup.this, Homepage.class);
                startActivity(intent);
                Toast.makeText(signup.this, "Guest login successful", Toast.LENGTH_SHORT).show();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createUser();
            }
        });


        showPasswordCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                int cursorPosition = pass.getSelectionStart();
                if (isChecked) {
                    // Show password
                    pass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                } else {
                    // Hide password
                    pass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
                pass.setSelection(cursorPosition);
            }
        });
    }

    private void createUser() {
        String user_email = email.getText().toString().trim();
        String user_pass = pass.getText().toString().trim();
        String user_name = name.getText().toString().trim();

        // Check if any field is empty
        if (TextUtils.isEmpty(user_email) || TextUtils.isEmpty(user_pass)) {
            Toast.makeText(signup.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        // Attempt to create user
        mauth.createUserWithEmailAndPassword(user_email, user_pass)
                .addOnCompleteListener(signup.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Send email verification
                            sendEmailVerification();
                        } else {
                            Toast.makeText(signup.this, "Failed to create user", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    private void sendEmailVerification() {
        mauth.getCurrentUser().sendEmailVerification()
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(signup.this, "Verification email sent. Please check your email.", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(signup.this, "Failed to send verification email.", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = mauth.getCurrentUser();
        if (user != null && user.isEmailVerified()) {
            redirectToLoginActivity();
        }
    }

    private void redirectToLoginActivity() {
        Intent intent = new Intent(signup.this, Login.class);
        startActivity(intent);
        finish(); // Optional: Finish the signup activity so that the user can't come back to it without signing in again
    }
}
