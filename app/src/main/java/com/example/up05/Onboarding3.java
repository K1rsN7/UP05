package com.example.up05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.educationalpractice.R;

public class Onboarding3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding3);
    }
    //Этот метод вызывается при нажатии на определенный элемент (View) на экране и запускает другое активити.
    public void  SignUp1(View v){
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
    //Этот метод вызывается при нажатии на определенный элемент (View) на экране и запускает другое активити.
    public void  SignIn1(View v){
        Intent intent = new Intent(this, Log_in.class);
        startActivity(intent);
    }
}