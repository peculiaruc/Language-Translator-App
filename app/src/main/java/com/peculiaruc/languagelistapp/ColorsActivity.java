package com.peculiaruc.languagelistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        //create an arrylist of wordsw
        words.add(new Word("ENGLISH", "IGBO"));
        words.add(new Word("White", "Ocha"));
        words.add(new Word("Black",  "Ojii"));
        words.add(new Word("Red", "Nme Nme"));
        words.add(new Word("Brown", "Edo edo"));
        words.add(new Word("Green", "Uhe uhe"));
        words.add(new Word("Gray", "Ntu ntu"));
        words.add(new Word("Orange",  ""));
        words.add(new Word("Blue", ""));
        words.add(new Word("Purple", ""));
        words.add(new Word("Yellow", ""));


        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
