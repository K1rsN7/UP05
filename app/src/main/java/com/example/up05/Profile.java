package com.example.up05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.educationalpractice.R;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    public void Card(View v){
        Intent intent = new Intent(this, AddPaymentMethod.class);
        startActivity(intent);
    }
    public void Notification(View v){
        Intent intent = new Intent(this, Notification.class);
        startActivity(intent);
    }
    public void Statements(View v){
        Intent intent = new Intent(this, SendAPackage.class);
        startActivity(intent);
    }
    public void Home(View v){
        Intent intent = new Intent(this, Home.class);
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
    public void LogOut(View v){
        Intent intent = new Intent(this, Log_in.class);
        startActivity(intent);
    }
}