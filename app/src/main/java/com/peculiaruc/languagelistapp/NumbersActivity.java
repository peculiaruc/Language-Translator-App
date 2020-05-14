package com.peculiaruc.languagelistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        //create an arrylist of wordsw
        words.add(new Word("ENGLISH", "IGBO"));
        words.add(new Word("One", "Otu"));
        words.add(new Word("Two",  "Abuo"));
        words.add(new Word("Three", "Ato"));
        words.add(new Word("Four", "Ano"));
        words.add(new Word("Five", "Ise"));
        words.add(new Word("Six", "Isii"));
        words.add(new Word("Seven",  "Asaa"));
        words.add(new Word("Eight", "Asato"));
        words.add(new Word("Nine", "Iteolu"));
        words.add(new Word("Ten", "Iri"));

//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//                for (int index = 0; index < words.size(); index++) {
//                    TextView wordView = new TextView(this);
//                    wordView.setText(words.get(index));
//                    rootView.addView(wordView);
//                }
//        ArrayAdapter<String> itemsAdapter =
//        new ArrayAdapter<String>(this, R.layout.item_numbers_list);

        WordAdapter adapter = new WordAdapter(this, words);
       ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
