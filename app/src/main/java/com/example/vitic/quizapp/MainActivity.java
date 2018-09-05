package com.example.vitic.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.atomic.AtomicBoolean;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView question = findViewById(R.id.textView);
        Button next = findViewById(R.id.nextB);
        Button exit = findViewById(R.id.exitB);

        String[][] arr1 = new String[2][5];
        AtomicBoolean q1 = new AtomicBoolean(false);
        AtomicBoolean q2 = new AtomicBoolean(false);

        arr1[0][0] = "Has long ears";
        arr1[0][1] = "Door";
        arr1[0][2] = "Fish";
        arr1[0][3] = "Turtle";
        arr1[0][4] = "Rabbit";

        arr1[1][1] = "false";
        arr1[1][2] = "false";
        arr1[1][3] = "false";
        arr1[1][4] = "true";


        String[][] arr2 = new String[2][5];

        arr2[0][0] = "A wale is a:";
        arr2[0][1] = "Mammal";
        arr2[0][2] = "Fish";
        arr2[0][3] = "Amphibian";
        arr2[0][4] = "Big Watter Doggo";

        arr2[1][1] = "true";
        arr2[1][2] = "false";
        arr2[1][3] = "false";
        arr2[1][4] = "false";


        String[][] arr3 = new String[2][5];

        arr3[0][0] = "Android P stands for:";
        arr3[0][1] = "P for PepperMint";
        arr3[0][2] = "P for Pie";
        arr3[0][3] = "P for Pudding";
        arr3[0][4] = "P for Pony";

        arr3[1][1] = "false";
        arr3[1][2] = "true";
        arr3[1][3] = "false";
        arr3[1][4] = "false";


//Setting of Q/A and Tags



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


        //Question 2


        next.setOnClickListener((view) -> {

            if (q1.get() == false) {

                question.setText(arr2[0][0]);

                b1.setTag(arr2[1][1]);
                b1.setText(arr2[0][1]);

                b2.setTag(arr2[1][2]);
                b2.setText(arr2[0][2]);

                b3.setTag(arr2[1][3]);
                b3.setText(arr2[0][3]);

                b4.setTag(arr2[1][4]);
                b4.setText(arr2[0][4]);

                q1.set(true);
            }
            else if (q2.get() == false)
            {

                question.setText(arr3[0][0]);

                b1.setTag(arr3[1][1]);
                b1.setText(arr3[0][1]);

                b2.setTag(arr3[1][2]);
                b2.setText(arr3[0][2]);

                b3.setTag(arr3[1][3]);
                b3.setText(arr3[0][3]);

                b4.setTag(arr3[1][4]);
                b4.setText(arr3[0][4]);

                q2.set(true);
            }

            else if (q2.get() == true || q1.get() == true)
            {
                question.setText(arr1[0][0]);
                b1.setTag(arr1[1][1]);
                b1.setText(arr1[0][1]);
                b2.setTag(arr1[1][2]);
                b2.setText(arr1[0][2]);
                b3.setTag(arr1[1][3]);
                b3.setText(arr1[0][3]);
                b4.setTag(arr1[1][4]);
                b4.setText(arr1[0][4]);

                q1.set(false);
                q2.set(false);

            }


        });


        //exit App
        exit.setOnClickListener((view) -> {
            finish();
            System.exit(0);
        });

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
