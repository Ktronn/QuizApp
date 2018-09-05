package com.example.vitic.quizapp;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Vector;
import java.util.List;


    public class GameMatch extends Activity
    {
        private List<QuizQuestion> match = new Vector<>();
        private QuizQuestion currentQuestion;
        private boolean isAnswered;

        public void populateMatch(String URLtoAdd) throws java.io.IOException
        {
            match = JSONReading.getListOfQuestions(JSONReading.ReadFromURL(URLtoAdd));
        }

        public void GameLoop()
        {
            QuizQuestion temp1 = new QuizQuestion();
            temp1.questionString = "test1";
            temp1.answers[0].m_answer = "testA1";
            temp1.answers[0].isCorrect = true;
            temp1.answers[1].m_answer = "testA1";
            temp1.answers[2].m_answer = "testA1";
            temp1.answers[3].m_answer = "testA1";

            match.add(temp1);

            final Button b1 = (Button) findViewById(R.id.button1); //A
            final Button b2 = (Button) findViewById(R.id.button2); //B
            final Button b3 = (Button) findViewById(R.id.button2); //C
            final Button b4 = (Button) findViewById(R.id.button4); //D
            final Button b5 = (Button) findViewById(R.id.nextB); //next button
            final TextView qtn = findViewById(R.id.textView); //QuestionText



            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (CheckCorrect(currentQuestion.answers[0]))
                    {
                        //toast correct
                        isAnswered = true;
                    }
                    else{
                        isAnswered = true;
                    }
                    //toast wrong

                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (CheckCorrect(currentQuestion.answers[1]))
                    {
                        //toast correct
                        isAnswered = true;
                    }
                    else{
                        isAnswered = true;
                    }
                    //toast wrong

                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (CheckCorrect(currentQuestion.answers[2]))
                    {
                        //toast correct
                        isAnswered = true;
                    }
                    else{
                        isAnswered = true;
                    }
                    //toast wrong

                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (CheckCorrect(currentQuestion.answers[3]))
                    {
                        //toast correct
                        isAnswered = true;
                    }
                    else{
                        isAnswered = true;
                    }
                    //toast wrong

                }
            });

            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    isAnswered = true;
                    //toast skipped question
                    //button 5 is the "next" button
                }
            });




            for (int i = 0; i < match.size(); ++i)
            {
                isAnswered = false;
                currentQuestion = match.get(i);

                currentQuestion.RandomizeQuestionOrder();

                qtn.setText(currentQuestion.questionString);
                b1.setText(currentQuestion.answers[0].m_answer);
                b2.setText(currentQuestion.answers[1].m_answer);
                b3.setText(currentQuestion.answers[2].m_answer);
                b4.setText(currentQuestion.answers[3].m_answer);

                while (!isAnswered)
                {

                }
            }
        }

        public boolean CheckCorrect(Answer _in)
        {
            return _in.isCorrect;
        }









    }





