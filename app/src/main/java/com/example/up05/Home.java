package com.example.up05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.educationalpractice.R;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void Profile(View v){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
    public void Walet(View v){
        Intent intent = new Intent(this, Wallet.class);
        startActivity(intent);
    }
    public void Track(View v){
        Intent intent = new Intent(this, Truck.class);
        startActivity(intent);
    }
    public void Chats(View v){
        Intent intent = new Intent(this, Chats.class);
        startActivity(intent);
    }
}