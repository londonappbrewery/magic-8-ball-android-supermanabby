package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView ball = findViewById(R.id.Ball);
       final int[] luckyArray = {
                R.drawable.ball1,
        R.drawable.ball2,
        R.drawable.ball3,
        R.drawable.ball4,
        R.drawable.ball5};
        final Button ask_button;

        ask_button = findViewById(R.id.ask_button);
        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random newRandomGenerator = new Random();
                int number = newRandomGenerator.nextInt(5);
               Log.d("Ball", "This ball is clicked" +number);
               ball.setImageResource(luckyArray[number]);
            }
        });
    }
}
