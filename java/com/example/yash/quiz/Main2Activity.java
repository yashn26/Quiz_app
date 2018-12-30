package com.example.yash.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    int quiz_number,selected_answer,question_no;
    TextView tv_topic,tv_question;
    RadioButton rb_1,rb_2,rb_3,rb_4;
    RadioGroup rg;
    Button bt_next;
    ArrayList<String> selected_answers=new ArrayList<String>();
    List<String> topicNames = Arrays.asList("Information Technology", "Histroy", "Mathematics","Science");
    FirstTableData data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       // if(getIntent().getExtras().getBoolean("flag"))
        setup();
        get_questions();

    }

    private void setup() {
        tv_question = (TextView) findViewById(R.id.TV_question);
        tv_topic = (TextView) findViewById(R.id.TV_topic);
        rb_1=(RadioButton) findViewById(R.id.RB_1);
        rb_2=(RadioButton) findViewById(R.id.RB_2);
        rb_3=(RadioButton) findViewById(R.id.RB_3);
        rb_4=(RadioButton) findViewById(R.id.RB_4);
        rg=(RadioGroup) findViewById(R.id.RG);
        bt_next=(Button) findViewById(R.id.bt);
        bt_next.setOnClickListener(this);
        quiz_number = getIntent().getIntExtra("quiz_number", 0);
        question_no=0;
    }

    private void get_questions() {
        DatabaseHelper db;
        db = new DatabaseHelper(this);
        data=db.getquestions(quiz_number,question_no);
        update_ui();
}

    private void update_ui() {
        rg.clearCheck();
        tv_topic.setText(topicNames.get(quiz_number-1));
        tv_question.setText(data.getQuestion());
        rb_1.setText(data.getOption_1());
        rb_2.setText(data.getOption_2());
        rb_3.setText(data.getOption_3());
        rb_4.setText(data.getOption_4());
       // original_answer.add(data.getAnswer());
    }

    @Override
    public void onClick(View v) {
        int selectedId = rg.getCheckedRadioButtonId();
        getselectedanswer(selectedId);
        if(selected_answer==0){
            Toast.makeText(getApplicationContext(),"select  an answer",Toast.LENGTH_SHORT).show();
            return;
        }
        if(question_no==3)
        {
            selected_answers.add(quiz_number+"");
            Intent view_order_intent = new Intent(this, Main3Activity.class);
            //view_order_intent.putStringArrayListExtra("data_o",original_answer);
            view_order_intent.putStringArrayListExtra("data_s",selected_answers);
            startActivity(view_order_intent);
        }
        else {
            question_no = question_no + 1;
            get_questions();
        }
    }

    private void getselectedanswer(int id) {
        switch(id) {
            case R.id.RB_1:
                selected_answer=1;
                selected_answers.add(data.getOption_1());
                break;
            case R.id.RB_2:
                selected_answer=2;
                selected_answers.add(data.getOption_2());
                break;
            case R.id.RB_3:
                selected_answer=3;
                selected_answers.add(data.getOption_3());
                break;
            case R.id.RB_4:
                selected_answer=4;
                selected_answers.add(data.getOption_4());
                break;
            default:
                selected_answer=0;
                break;

        }
    }
}
