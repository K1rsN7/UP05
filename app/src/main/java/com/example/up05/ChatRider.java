package com.example.up05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.educationalpractice.R;

public class ChatRider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_rider);
    }

    public void Call(View v){
        Intent intent = new Intent(this, Calling.class);
        startActivity(intent);
    }
}