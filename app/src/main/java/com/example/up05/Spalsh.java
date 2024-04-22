package com.example.up05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.example.educationalpractice.R;

public class Spalsh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Здесь создается новый объект Handler и вызывается метод postDelayed(), который запускает задачу через определенное время. В данном случае, через 3 секунды происходит переход на другую активити.
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Spalsh.this, Onboarding1.class);
                startActivity(intent);
            }
        }, 3000);
    }
    //Этот метод вызывается при нажатии на определенный элемент (View) на экране и запускает другое активити.
    public void onClick(View v){
        Intent intent = new Intent(this, Onboarding1.class);
        startActivity(intent);
    }
}