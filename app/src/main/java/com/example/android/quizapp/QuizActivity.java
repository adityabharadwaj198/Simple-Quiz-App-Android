package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButtonQuit;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButton1 = (Button) findViewById(R.id.button1);

        mButton1.setOnClickListener(new View.OnClickListener(){
            public void onClick (View view){

                if (mButton1.getText() == mAnswer)
                {
                    mScore = mScore + 1;
                    UpdateScore(mScore);
                    UpdateQuestion();
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(QuizActivity.this, "incorrect", Toast.LENGTH_SHORT).show();
                    UpdateQuestion();
                }
            }
        });


        mButton2 = (Button) findViewById(R.id.button2);
        mButton2.setOnClickListener(new View.OnClickListener(){
            public void onClick (View view) {

                if (mButton2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    UpdateScore(mScore);
                    UpdateQuestion();
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "incorrect", Toast.LENGTH_SHORT).show();
                    UpdateQuestion();
                }
            }
        });


        mButton3 = (Button) findViewById(R.id.button3);
        mButton3.setOnClickListener(new View.OnClickListener(){
            public void onClick (View view){

                if (mButton3.getText() == mAnswer)
                {
                    mScore = mScore + 1;
                    UpdateScore(mScore);
                    UpdateQuestion();
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(QuizActivity.this, "incorrect", Toast.LENGTH_SHORT).show();
                    UpdateQuestion();
                }
            }
        });

        mButtonQuit = (Button) findViewById(R.id.quit_button);
        mButtonQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.os.Process.killProcess(android.os.Process.myPid());
                    System.exit(1);
            }
        });

    UpdateQuestion();
    }




    public void UpdateQuestion()
    {
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButton1.setText(mQuestionLibrary.getOption1(mQuestionNumber));
        mButton2.setText(mQuestionLibrary.getOption2(mQuestionNumber));
        mButton3.setText(mQuestionLibrary.getOption3(mQuestionNumber));
        mAnswer = mQuestionLibrary.getCorrect(mQuestionNumber);
        mQuestionNumber++;
    }
    public void UpdateScore(int point)
    {

        mScoreView.setText("" + mScore);
    }
}
