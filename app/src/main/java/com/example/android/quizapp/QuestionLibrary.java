package com.example.android.quizapp;

/**
 * Created by Aditya on 25-May-17.
 */

public class QuestionLibrary {

    private String mQuestions[] = {
            "Harry Potter gets sorted into this house in his first year:",
            "Hermione's cat is named",
            "How many siblings does Ron have?",
            "Who was Harry Potter's Potions professor in his 6th year at Hogwarts?",
            "Who won the Triwizard Tournament in Harry's 4th year?"};

    private String mOptions[][] =

    {
            {"Hufflepuff","Gryffindor","Ravenclaw"},
            {"Hedwig","Fluffy","Crookshanks"},
            {"7","5","3"},
            {"Remus Lupin","Dolorus Umbrige","Horace Slughorn"},
            {"Cedric Diggory","Victor Krum", "Harry Potter"}
    };

    private String mQuestionAnswers[] = {"Gryffindor","Crookshanks","7","Horace Slughorn","Harry Potter"};

    public String  getQuestion(int a)
    {
        String question = mQuestions[a];
        return
                question;
    }

    public String   getOption1(int a)
    {
        String option1 = mOptions[a][0];
        return option1;
    }
    public String   getOption2(int a)
    {
        String option2 = mOptions[a][1];
        return option2;
    }
    public String   getOption3(int a)
    {
        String option3 = mOptions[a][2];
        return option3;
    }

    public String   getCorrect(int a)
    {
        String  correct = mQuestionAnswers[a];
        return correct;
    }
}