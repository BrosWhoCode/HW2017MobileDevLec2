package com.diglesia.hw2017mobiledev.geoquizlec2;

public class Question {
    private int mQuestionResId;
    private boolean mIsTrue;

    public Question(int questionResId, boolean isTrue) {
        mQuestionResId = questionResId;
        mIsTrue = isTrue;
    }

    public int getQuestionStringResId() {
        return mQuestionResId;
    }

    public boolean isTrue() {
        return mIsTrue;
    }
}
