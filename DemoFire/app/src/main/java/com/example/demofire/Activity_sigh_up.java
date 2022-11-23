package com.example.demofire;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Activity_sigh_up extends AppCompatActivity {
    Button dknx;
    FirebaseAuth db;
    EditText txtUser, txtPass;
    Boolean login = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigh_up);
        dknx = findViewById(R.id.btn_signup);
        db = FirebaseAuth.getInstance();
        txtUser = findViewById(R.id.txt_signup_user);
        txtPass = findViewById(R.id.txt_signup_pass);

        dknx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Create();
            }
        });
    }

    void Create(){
        String user, pass;
        user = txtUser.getText().toString();
        pass = txtPass.getText().toString();
        db.createUserWithEmailAndPassword(user,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()) {
                    Toast.makeText(Activity_sigh_up.this, "Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Activity_sigh_up.this,MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(Activity_sigh_up.this,"Error",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}