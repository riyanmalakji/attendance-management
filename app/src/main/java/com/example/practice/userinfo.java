package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class userinfo extends AppCompatActivity {

    private TextView userEmailTextView;
    private TextView userDisplayNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        // Initialize TextViews
        userEmailTextView = findViewById(R.id.user_email_textview);
        userDisplayNameTextView = findViewById(R.id.user_display_name_textview);

        // Retrieve current user from Firebase Authentication
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();

        // Check if user is logged in
        if (currentUser != null) {
            // User is logged in, retrieve and display user's email and display name
            String userEmail = currentUser.getEmail();
            userEmailTextView.setText("  " + userEmail);

            String userDisplayName = currentUser.getDisplayName();
            userDisplayNameTextView.setText("  " + userDisplayName);
        } else {
            // User is not logged in
            userEmailTextView.setText("No user logged in");
            userDisplayNameTextView.setText("No user logged in");
        }

        // You can add more TextViews and retrieve/display more user information here if needed
    }
}
