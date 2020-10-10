package com.javaishlogs.diceeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button buttonRoll;
    ImageView imageViewDice;
    Random randonNumberGenerator;
    private static final String TAG = "MainActivity";
    int number;
     final int[] diceArray={R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewDice = (ImageView) findViewById(R.id.imgView);
        buttonRoll = (Button) findViewById(R.id.btnRoll);
        buttonRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randonNumberGenerator = new Random();
                number = randonNumberGenerator.nextInt(6);
               // Toast.makeText(getApplicationContext(), "Random Number is " + number, Toast.LENGTH_LONG).show();
                Log.d(TAG, "onClick: " + number);
                //rollUsingSwitch(number);
                rollUsingArray(number);

            }
        });
    }
    public void rollUsingSwitch(int number)
    {
        switch (number) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice2);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice3);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice4);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice5);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice6);
                break;
            default:
                imageViewDice.setImageResource(R.drawable.dice1);
                break;
        }

    }
    public void rollUsingArray(int number)
    {
        imageViewDice.setImageResource(diceArray[number]);
    }
}