package com.example.demofire;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.*;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    FirebaseAuth db;
    Button dn;
    Button dk;
    EditText txtUser, txtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dn = findViewById(R.id.btn_actLogin_login);
        dk = findViewById(R.id.btn_actLogin_signup);
        txtUser = findViewById(R.id.txt_actlogin_user);
        txtPass = findViewById(R.id.txt_actlogin_pass);
        db = FirebaseAuth.getInstance();

        dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SighIn();
            }
        });
        dk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity_sigh_up.class);
                startActivity(intent);
            }
        });
    }
    void SighIn( ){
        String user, pass;
        user = txtUser.getText().toString();
        pass = txtPass.getText().toString();
        db.signInWithEmailAndPassword(user,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()) {
                    Toast.makeText(MainActivity.this, "Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,ActivityListThuoc.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this,"Error",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}