package com.example.vitic.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.io.IOException;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button b1 = (Button) findViewById(R.id.button1); //A

        b1.setText("");



       /* GameMatch game = new GameMatch();
       // game.populateMatch(TriviaDBURLcreator.createURL("General Knowledge", 10, "Easy"));
        game.GameLoop();
*/

    }


}
