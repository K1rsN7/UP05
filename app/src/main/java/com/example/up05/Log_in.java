package com.example.up05;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.educationalpractice.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Log_in extends AppCompatActivity {

    private AppCompatButton log;
    private String emailText, passText;
    private EditText email, pass;
    private FirebaseAuth mAuth;
    private FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        log = findViewById(R.id.button200);
        passText = "";
        emailText = "";

        email = findViewById(R.id.editTextTextEmailAddress2);
        pass = findViewById(R.id.pass1);
        mAuth = FirebaseAuth.getInstance();

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emailText = email.getText().toString();
                passText = pass.getText().toString();
                signIn(emailText, passText);

                if(user != null) {
                    Intent intent = new Intent(Log_in.this, Home.class);
                    startActivity(intent);
                }

            }
        });
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                emailText = email.getText().toString();
                passText = pass.getText().toString();
                if(emailText.length() != 0 & passText.length() != 0){
                    log.setEnabled(true);
                    log.setBackgroundColor(getColor(R.color.blue));
                } else {
                    log.setEnabled(false);
                    log.setBackgroundColor(getColor(R.color.Gray));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        pass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                emailText = email.getText().toString();
                passText = pass.getText().toString();
                if(emailText.length() != 0 & passText.length() != 0){
                    log.setEnabled(true);
                    log.setBackgroundColor(getColor(R.color.blue));
                } else {
                    log.setEnabled(false);
                    log.setBackgroundColor(getColor(R.color.Gray));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    public void  ForgotPassword(View v){
        Intent intent = new Intent(this, Forgot_password.class);
        startActivity(intent);
    }

    public void  Sign_Upp(View v){
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }




    private void signIn(String email, String password) {
        // [START sign_in_with_email]
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "signInWithEmail:success");
                            user = mAuth.getCurrentUser();

                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "signInWithEmail:failure", task.getException());
                            Toast.makeText(Log_in.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                            user = null;
                        }
                    }
                });
        // [END sign_in_with_email]
    }
}