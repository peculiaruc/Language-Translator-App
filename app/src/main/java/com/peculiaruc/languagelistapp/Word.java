package com.peculiaruc.languagelistapp;

public class Word {


    private String mDefaultTranslation;
    private String mIgboTranslation;

    public Word(String mDefaultTranslation, String mIgboTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mIgboTranslation = mIgboTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmIgboTranslation() {
        return mIgboTranslation;
    }
}