package com.example.up05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.educationalpractice.R;

public class SendAPackage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_apackage2);

        TextView place = findViewById(R.id.textView41);
        TextView phon = findViewById(R.id.textView42);
        TextView placetrakc = findViewById(R.id.textView44);
        TextView phonetrack = findViewById(R.id.textView45);
        TextView weight = findViewById(R.id.textView50);
        TextView worth = findViewById(R.id.textView52);
        TextView item = findViewById(R.id.textView48);

        Bundle arg = getIntent().getExtras();

        place.setText(arg.getString("place"));
        phon.setText(arg.getString("phon"));
        placetrakc.setText(arg.getString("placetrakc"));
        phonetrack.setText(arg.getString("phonetrack"));
        weight.setText(arg.getString("weight"));
        worth.setText(arg.getString("worth"));
        item.setText(arg.getString("item"));
    }
    public void sendapack(View v){
        Intent intent = new Intent(this, SendAPackage.class);
        startActivity(intent);
    }
    public void makepayment(View v){
        Intent intent = new Intent(this, TransactionSuccessful.class);
        startActivity(intent);
    }
    public void Right(View v){
        Intent intent = new Intent(this, SendAPackage.class);
        startActivity(intent);
    }
}