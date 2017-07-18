package com.diglesia.hw2017mobiledev.geoquizlec2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mQuestionTextView;
    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;
    private int mQuestionIndex;

    private Question[] mQuestions = new Question[] {
            new Question("question 1", true),
            new Question("question 2", false),
            new Question("question 3", true),
            new Question("question 4", false),
            new Question("question 5", true),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuestionTextView = (TextView) findViewById(R.id.question_text_view);
        Question currentQuestion = mQuestions[mQuestionIndex];
        mQuestionTextView.setText(currentQuestion.getQuestionString());

        mTrueButton = (Button) findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(true);
            }
        });

        mFalseButton = (Button) findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(false);
            }
        });

        mNextButton = (Button) findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mQuestionIndex = (++mQuestionIndex) % mQuestions.length;
                mQuestionIndex++;
                if (mQuestionIndex == mQuestions.length) {
                    mQuestionIndex = 0;
                }
                Question currentQuestion = mQuestions[mQuestionIndex];
                mQuestionTextView.setText(currentQuestion.getQuestionString());
            }
        });
    }

    private void checkAnswer(boolean didUserTapTrue) {
        Question currentQuestion = mQuestions[mQuestionIndex];
        boolean isQuestionTrue = currentQuestion.isTrue();
        if (isQuestionTrue == didUserTapTrue) {
            Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "wrong!", Toast.LENGTH_SHORT).show();
        }
    }
}
