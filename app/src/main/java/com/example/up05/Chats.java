package com.example.up05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.educationalpractice.R;

public class Chats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chats);
    }
    public void Right(View v){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void Chinonso(View v){
        Intent intent = new Intent(this, ChatRider.class);
        startActivity(intent);
    }
}