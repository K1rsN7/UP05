package com.example.up05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.educationalpractice.R;

public class SendAPackage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_apackage);

        LinearLayout shed = findViewById(R.id.shed);
        LinearLayout ins = findViewById(R.id.ins);
        TextView textclock = findViewById(R.id.textclock);
        TextView textcalend = findViewById(R.id.textcalend);
        ImageView clock = findViewById(R.id.clock);
        ImageView calend = findViewById(R.id.calend);

        ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ins.setBackground(getDrawable(R.drawable.bluekr));
                shed.setBackground(getDrawable(R.drawable.radius_sqvare));
                textclock.setTextColor(getColor(R.color.white));
                textcalend.setTextColor(getColor(R.color.Gray));
                clock.setImageDrawable(getDrawable(R.drawable.clock));
                calend.setImageDrawable(getDrawable(R.drawable.calend));
            }
        });

        shed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shed.setBackground(getDrawable(R.drawable.bluekr));
                ins.setBackground(getDrawable(R.drawable.radius_sqvare));
                textclock.setTextColor(getColor(R.color.Gray));
                textcalend.setTextColor(getColor(R.color.white));
                clock.setImageDrawable(getDrawable(R.drawable.clockgr));
                calend.setImageDrawable(getDrawable(R.drawable.calendwhite));
            }
        });
    }

    public void Next(View v){
        EditText address = findViewById(R.id.editTextTextPostalAddress);
        EditText town = findViewById(R.id.editTextTextPostalAddress2);
        EditText phoneinfo = findViewById(R.id.editTextPhone2);

        EditText addresspoint1 = findViewById(R.id.editTextTextPostalAddress1);
        EditText townpoint1 = findViewById(R.id.editTextTextPostalAddress21);
        EditText phoneinfopoint1 = findViewById(R.id.editTextPhone21);

        EditText items = findViewById(R.id.editTextTextPostalAddress22);
        EditText weightit = findViewById(R.id.editTextTextPostalAddress222);
        EditText worthit = findViewById(R.id.editTextPhone22);

        Intent intent = new Intent(this, SendAPackage2.class);
        String placetext = address.getText().toString() +" " + town.getText().toString();
        String placetracktext = addresspoint1.getText().toString() +" " + townpoint1.getText().toString();
        intent.putExtra("place", placetext);
        intent.putExtra("phon", phoneinfo.getText().toString());
        intent.putExtra("placetrakc", placetracktext);
        intent.putExtra("phonetrack", phoneinfopoint1.getText().toString());
        intent.putExtra("item", items.getText().toString());
        intent.putExtra("weight", weightit.getText().toString());
        intent.putExtra("worth", worthit.getText().toString());

        startActivity(intent);
    }
    public void Right(View v){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}