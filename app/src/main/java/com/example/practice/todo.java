package com.example.practice;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class todo extends AppCompatActivity {

    private EditText editTextTask;
    private LinearLayout linearLayoutTasks;
    private DatabaseReference tasksRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        editTextTask = findViewById(R.id.editTextTask);
        Button buttonAdd = findViewById(R.id.buttonAdd);
        linearLayoutTasks = findViewById(R.id.linearLayoutTasks);

        // Initialize Firebase components
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            tasksRef = database.getReference("tasks").child(user.getUid());
        }

        // Read tasks from Firebase Realtime Database
        readTasksFromDatabase();

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTask();
            }
        });
    }

    private void addTask() {
        String taskText = editTextTask.getText().toString().trim();
        if (!taskText.isEmpty()) {
            // Add the task to Firebase Realtime Database
            if (tasksRef != null) {
                String taskId = tasksRef.push().getKey();
                tasksRef.child(taskId).setValue(taskText);
            }

            // Display the task in the UI
            TextView textViewTask = new TextView(this);
            textViewTask.setText(taskText);
            textViewTask.setTextSize(18);
            textViewTask.setPadding(0, 8, 0, 8);
            linearLayoutTasks.addView(textViewTask);

            // Clear the EditText
            editTextTask.setText("");
        } else {
            Toast.makeText(this, "Please enter a task", Toast.LENGTH_SHORT).show();
        }
    }

    private void readTasksFromDatabase() {
        if (tasksRef != null) {
            tasksRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    linearLayoutTasks.removeAllViews();
                    for (DataSnapshot taskSnapshot : dataSnapshot.getChildren()) {
                        String taskText = taskSnapshot.getValue(String.class);
                        if (taskText != null) {
                            TextView textViewTask = new TextView(todo.this);
                            textViewTask.setText(taskText);
                            textViewTask.setTextSize(18);
                            textViewTask.setPadding(0, 8, 0, 8);
                            linearLayoutTasks.addView(textViewTask);
                        }
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                    Toast.makeText(todo.this, "Failed to read tasks", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
