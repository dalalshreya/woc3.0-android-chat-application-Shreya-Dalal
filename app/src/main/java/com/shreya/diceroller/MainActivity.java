package com.shreya.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

   final int max=7, min=1;
   ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void diceNumber(View view)
    {
        img = findViewById(R.id.imageView1);
        Random r = new Random();
        int dface = r.nextInt((max - min) + 1) + min;

        if(dface == 1)
        {
            img.setImageResource(R.drawable.dice_1);
            img.animate().rotationYBy(180).setDuration(1000);
        }
        else if(dface == 2)
        {
            img.setImageResource(R.drawable.dicey_2);
            img.animate().rotationYBy(-180).setDuration(1000);
        }
        else if(dface == 3)
        {
            img.setImageResource(R.drawable.dicey_3);
            img.animate().rotationYBy(180).setDuration(1000);
        }
        else if(dface == 4)
        {
            img.setImageResource(R.drawable.dicey_4);
            img.animate().rotationYBy(-180).setDuration(1000);
        }
        else if(dface == 5)
        {
            img.setImageResource(R.drawable.dicey_5);
            img.animate().rotationYBy(180).setDuration(1000);
        }
        else if(dface == 6)
        {
            img.setImageResource(R.drawable.dicey_6);
            img.animate().rotationYBy(-180).setDuration(1000);
        }

    }
}