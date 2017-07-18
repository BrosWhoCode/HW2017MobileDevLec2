package com.diglesia.hw2017mobiledev.geoquizlec2;

public class Question {
    private String mQuestionString;
    private boolean mIsTrue;

    public Question(String questionString, boolean isTrue) {
        mQuestionString = questionString;
        mIsTrue = isTrue;
    }

    public String getQuestionString() {
        return mQuestionString;
    }

    public boolean isTrue() {
        return mIsTrue;
    }
}
