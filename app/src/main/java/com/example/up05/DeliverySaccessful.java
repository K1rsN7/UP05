package com.example.up05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.educationalpractice.R;

public class DeliverySaccessful extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_saccessful);

        ImageView anim = findViewById(R.id.anim);

        anim.setBackgroundResource(R.drawable.animation);

        AnimationDrawable frameAnimation = (AnimationDrawable) anim.getBackground();

        new CountDownTimer(2650, 1000) {

            public void onTick(long millisUntilFinished) {
                frameAnimation.start();
            }

            public void onFinish() {
                frameAnimation.stop();
                anim.setBackground(getDrawable(R.drawable.trunssucc_big));
                TextView suc = findViewById(R.id.textView37);
                suc.setText("Transaction Successful");
            }

        }.start();
    }

    public void Track(View v){
        Intent intent = new Intent(this, Truck.class);
        startActivity(intent);
    }
}