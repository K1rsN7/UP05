package com.example.up05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.educationalpractice.R;

public class Onboarding1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding1);
    }

    //Этот метод вызывается при нажатии на определенный элемент (View) на экране и запускает другое активити.
    public void Skip(View v){
        Intent intent = new Intent(this, Onboarding3.class);
        startActivity(intent);
    }
    //Этот метод вызывается при нажатии на определенный элемент (View) на экране и запускает другое активити.
    public void Next1(View v){
        Intent intent = new Intent(this, Onboarding4.class);
        startActivity(intent);
    }
}