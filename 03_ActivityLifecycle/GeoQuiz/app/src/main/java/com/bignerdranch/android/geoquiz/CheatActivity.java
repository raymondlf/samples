package com.bignerdranch.android.geoquiz;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CheatActivity extends AppCompatActivity {

    Button cheat_yes;
    TextView cheat_answer;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);

        cheat_yes = (Button) findViewById(R.id.cheat_yes);
        cheat_answer = (TextView) findViewById(R.id.cheat_answer);
        intent = getIntent();

        cheat_yes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String answer = String.valueOf(intent.getBooleanExtra("answer", true));
                cheat_answer.setText("The answer of this question is " + answer);
            }
        });

    }
}
