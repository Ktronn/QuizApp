package com.example.vitic.quizapp;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import java.util.List;
import java.util.Vector;


public class JSONReading {

    public static JsonObject ReadFromURL(String LinkToJSON) throws java.io.IOException {
        // Connect to URL passed in
        URL url = new URL(LinkToJSON);
        URLConnection request = url.openConnection();
        request.connect();

        // Convert to a JSON object to print data
        JsonParser jp = new JsonParser(); //from GSON
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the request to a json element
         //May be an array, may be an object.

        if (root.getAsJsonObject().get("response_code").getAsString().equals("0")) //response code 0 means successful request from opentdb API
            return root.getAsJsonObject();
        else
            return null;
        //response code of non 0 means a failure of some type
    }


    public static List<QuizQuestion> getListOfQuestions(JsonObject toGoThru){

        if (toGoThru != null)
        {
            List<QuizQuestion> tempQuestionArray = new Vector<>();

            JsonArray QuestionArray = toGoThru.getAsJsonArray("Results");

            for(int i = 0; i < QuestionArray.size(); ++i)
            {

                JsonObject tempResult = QuestionArray.get(i).getAsJsonObject();

                QuizQuestion tempQuestion = new QuizQuestion();

                tempQuestion.questionString = tempResult.get("question").getAsString();
                //loads correct answer
                tempQuestion.answers[0].m_answer = tempResult.get("correct_answer").getAsString();
                tempQuestion.answers[0].isCorrect = true;
                //loads 3 incorrect answers from JsonArray labeled "incorrect_answers"
                JsonArray incorrect_answers_array = tempResult.get("incorrect_answers").getAsJsonArray();
                tempQuestion.answers[1].m_answer = incorrect_answers_array.get(0).getAsString();
                tempQuestion.answers[1].isCorrect = false;
                tempQuestion.answers[1].m_answer = incorrect_answers_array.get(1).getAsString();
                tempQuestion.answers[2].isCorrect = false;
                tempQuestion.answers[1].m_answer = incorrect_answers_array.get(2).getAsString();
                tempQuestion.answers[3].isCorrect = false;

                tempQuestionArray.add(tempQuestion);

            }
            return tempQuestionArray;
        }
        else return null;

    }

}
