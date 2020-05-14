package com.peculiaruc.languagelistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView numbers = (TextView) findViewById(R.id.text_numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersintent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersintent);
                Toast.makeText(view.getContext(), "Open the number of list ", Toast.LENGTH_SHORT).show();
            }
        });

        TextView family = (TextView) findViewById(R.id.text_family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyintent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyintent);
                Toast.makeText(view.getContext(), "Open the family of list ", Toast.LENGTH_SHORT).show();
            }
        });

        TextView colors = (TextView) findViewById(R.id.text_colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsintent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsintent);
                Toast.makeText(view.getContext(), "Open the color of list ", Toast.LENGTH_SHORT).show();
            }
        });

        TextView phrases = (TextView) findViewById(R.id.text_phrase);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesintent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesintent);
                Toast.makeText(view.getContext(), "Open the phrase of list ", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
