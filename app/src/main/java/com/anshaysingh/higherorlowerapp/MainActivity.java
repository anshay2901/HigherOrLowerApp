package com.anshaysingh.higherorlowerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int result;
    int count = 0;

    public void Toasting(String string) {
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }

    public void onClick(View view) {

        EditText aText = (EditText) findViewById(R.id.aText);
        String guessStr = aText.getText().toString();
        Integer guess = (Integer.parseInt(guessStr));
        count++;
        if(guess > result) {
            Toasting("It is higher than what I have been thinking...");
        }
        else if(guess < result) {
            Toasting("It is lower than what I have been thinking...");
        }
        else {
            Toasting("Nice, you guessed it RIGHT!!! You took "+count+" tries :)");
        }

    }

    public void onClick2(View view) {
        Random r = new Random();
        result = r.nextInt(20) + 1;
        count = 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random r = new Random();
        result = r.nextInt(20) + 1;
    }
}
