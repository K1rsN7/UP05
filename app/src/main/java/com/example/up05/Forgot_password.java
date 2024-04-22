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
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;

import com.example.educationalpractice.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class Forgot_password extends AppCompatActivity {

    private AppCompatButton send;
    private String emailText;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        send = findViewById(R.id.button2);

        emailText = "";
        email = findViewById(R.id.editTextTextEmailAddress2);

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                emailText = email.getText().toString();
                validateMail(emailText);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    public void validateMail(String email){
        if (Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            send.setEnabled(true);
            send.setBackgroundColor(getColor(R.color.blue));
        }
        else{
            send.setEnabled(false);
            send.setBackgroundColor(getColor(R.color.Gray));
        }
    }
    public void Sign_in(View v){
        Intent intent = new Intent(this, Log_in.class);
        startActivity(intent);
    }

    public void StendOTP1(View v){
        sendPasswordReset();
        Intent intent = new Intent(this, OTP_Verification.class);
        startActivity(intent);
    }
    public void sendPasswordReset() {
        // [START send_password_reset]
        FirebaseAuth auth = FirebaseAuth.getInstance();
        String emailAddress = emailText;

        auth.sendPasswordResetEmail(emailAddress)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Log.d(TAG, "Email sent.");
                        }
                    }
                });
        // [END send_password_reset]
    }
}