package com.example.yash.quiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    int quiz_no;
    int correct=0;
    ArrayList<String> test_o,test_s;
    TextView question_1,OA_1,GA_1,question_2,OA_2,GA_2,question_3,OA_3,GA_3,question_4,OA_4,GA_4,score;
    Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

       // test_o = getIntent().getStringArrayListExtra("data_o");
        test_s = getIntent().getStringArrayListExtra("data_s");

        setup();
        update_ui();
    }

    private void update_ui() {
        quiz_no=Integer.parseInt(test_s.get(4));
        DatabaseHelper db;
        db = new DatabaseHelper(this);
        FirstTableData data = db.getquestions(quiz_no,0);
        question_1.setText(data.getQuestion());
        GA_1.setText(data.getAnswer());
        OA_1.setText(test_s.get(0));
        correct_or_wrong(OA_1,GA_1);

        data = db.getquestions(quiz_no,1);
        question_2.setText(data.getQuestion());
        GA_2.setText(data.getAnswer());
        OA_2.setText(test_s.get(1));
        correct_or_wrong(OA_2,GA_2);

        data = db.getquestions(quiz_no,2);
        question_3.setText(data.getQuestion());
        GA_3.setText(data.getAnswer());
        OA_3.setText(test_s.get(2));
        correct_or_wrong(OA_3,GA_3);

        data = db.getquestions(quiz_no,3);
        question_4.setText(data.getQuestion());
        GA_4.setText(data.getAnswer());
        OA_4.setText(test_s.get(3));
        correct_or_wrong(OA_4,GA_4);

        score.setText(correct+" OUT OF 4 CORRECT");
    }

    private void correct_or_wrong(TextView oa, TextView ga) {
        if(oa.getText().equals(ga.getText()))
        {
            oa.setTextColor(Color.parseColor("#008000"));
            correct++;
        }
        else
        {
            oa.setTextColor(Color.parseColor("#FF0000"));
        }
    }

    private void setup() {
        question_1=(TextView)findViewById(R.id.question_1);
        question_2=(TextView)findViewById(R.id.question_2);
        question_3=(TextView)findViewById(R.id.question_3);
        question_4=(TextView)findViewById(R.id.question_4);
        OA_1=(TextView)findViewById(R.id.original_answer_1);
        GA_1=(TextView)findViewById(R.id.given_answer_1);
        GA_1.setTextColor(Color.parseColor("#008000"));
        OA_2=(TextView)findViewById(R.id.original_answer_2);
        GA_2=(TextView)findViewById(R.id.given_answer_2);
        GA_2.setTextColor(Color.parseColor("#008000"));
        OA_3=(TextView)findViewById(R.id.original_answer_3);
        GA_3=(TextView)findViewById(R.id.given_answer_3);
        GA_3.setTextColor(Color.parseColor("#008000"));
        OA_4=(TextView)findViewById(R.id.original_answer_4);
        GA_4=(TextView)findViewById(R.id.given_answer_4);
        GA_4.setTextColor(Color.parseColor("#008000"));
        score=(TextView)findViewById(R.id.score);
        home=(Button)findViewById(R.id.home);
        home.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
