package com.peculiaruc.languagelistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        //create an arrylist of wordsw
        words.add(new Word("ENGLISH","IGBO"));
        words.add(new Word("Father","Papa"));
        words.add(new Word("Mother", "Mama"));
        words.add(new Word("Brother","Nwannem Nwoke"));
        words.add(new Word("Sister","Nwannem Nwaenyi"));
        words.add(new Word("GrandFather","Papa Nnukwu"));
        words.add(new Word("GrandMother","Mama Nnukwu"));
        words.add(new Word("Uncle","Nwanne Papam Nwoke"));
        words.add(new Word("Aunty","Nwanne Papam Nwaanyi"));
        words.add(new Word("Uncle","Nwanne Mamam Nwoke"));
        words.add(new Word("Aunty","Nwanne Mamam Nwaanyi"));
        words.add(new Word("Nice","Nwa nwannem, Nwoke"));
        words.add(new Word("Nephew","Nwa nwannem, Nwoke"));


        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
