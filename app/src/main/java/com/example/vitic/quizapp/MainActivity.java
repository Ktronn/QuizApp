package com.example.vitic.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String tag = "";



        String[][] arr1 = new String[2][5];

        arr1[0][0] = "Has long ears";
        arr1[0][1] = "Door";
        arr1[0][2] = "Fish";
        arr1[0][3] = "Turtle";
        arr1[0][4] = "Rabbit";

        arr1[1][1] = "false";
        arr1[1][2] = "false";
        arr1[1][3] = "false";
        arr1[1][4] = "true";


        TextView question = findViewById(R.id.textView);
        question.setText(arr1[0][0]);


        Button b1 = findViewById(R.id.button1);
        b1.setTag(arr1[1][1]);
        b1.setText(arr1[0][1]);


        Button b2 = findViewById(R.id.button2);
        b2.setTag(arr1[1][2]);
        b2.setText(arr1[0][2]);

        Button b3 = findViewById(R.id.button3);
        b3.setTag(arr1[1][3]);
        b3.setText(arr1[0][3]);

        Button b4 = findViewById(R.id.button4);
        b4.setTag(arr1[1][4]);
        b4.setText(arr1[0][4]);


        b1.setOnClickListener((view) -> {

            if (b1.getTag() == "true") {
                Context context = getApplicationContext();
                CharSequence text = "Correct!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            } else {
                Context context = getApplicationContext();
                CharSequence text = "Wrong!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

        });


        b2.setOnClickListener((view) -> {

            if (b2.getTag() == "true") {
                Context context = getApplicationContext();
                CharSequence text = "Correct!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            } else {
                Context context = getApplicationContext();
                CharSequence text = "Wrong!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

        });


        b3.setOnClickListener((view) -> {

            if (b3.getTag() == "true") {
                Context context = getApplicationContext();
                CharSequence text = "Correct!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            } else {
                Context context = getApplicationContext();
                CharSequence text = "Wrong!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

        });

        b4.setOnClickListener((view) -> {

            if (b4.getTag() == "true") {
                Context context = getApplicationContext();
                CharSequence text = "Correct!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            } else {
                Context context = getApplicationContext();
                CharSequence text = "Wrong!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

        });

    }
}
