package com.example.android.miwok;

/**
 * Created by VictorHugo on 21/09/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String [] words = new String[11];
        words[0] = "zero";
        words[1] = "one";
        words[2] = "two";
        words[3] = "three";
        words[4] = "four";
        words[5] = "five";
        words[6] = "six";
        words[7] = "seven";
        words[8] = "eight";
        words[9] = "nine";
        words[10] = "ten";

        Log.v("NumbersActivity","Word at index0: " + words[0]);
        Log.v("NumbersActivity","Word at index0: " + words[1]);
    }

}