package com.peculiaruc.languagelistapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_numbers_list,parent,false);
        }

        Word currentWord = (Word) getItem(position);
        TextView igboTextView = (TextView) listItemView.findViewById(R.id.igbo_text_view);
        igboTextView.setText(currentWord.getmIgboTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getmDefaultTranslation());



        return listItemView;
    }



}
