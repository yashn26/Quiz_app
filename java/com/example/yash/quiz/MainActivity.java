package com.example.yash.quiz;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView image_it,image_history,image_science,image_maths;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setup();
    }

    private void setup() {
        tv=(TextView) findViewById(R.id.tv);
        image_it = (ImageView) findViewById(R.id.image1);
        image_history = (ImageView) findViewById(R.id.image2);
        image_maths = (ImageView) findViewById(R.id.image3);
        image_science = (ImageView) findViewById(R.id.image4);
        image_it.setOnClickListener((View.OnClickListener) this);
        image_history.setOnClickListener((View.OnClickListener) this);
        image_science.setOnClickListener((View.OnClickListener) this);
        image_maths.setOnClickListener((View.OnClickListener) this);
        SpannableString content = new SpannableString("select a quiz");
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        tv.setText(content);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.image1:
                call_intent(1);
                break;
            case R.id.image2:
                call_intent(2);
                break;
            case R.id.image3:
                call_intent(3);
                break;
            case R.id.image4:
                call_intent(4);
                break;
        }
    }

    private void call_intent(int i) {
        Intent myIntent = new Intent(MainActivity.this, Main2Activity.class);
        myIntent.putExtra("quiz_number", i);
       // myIntent.putExtra("flag", true);
        startActivity(myIntent);
    }
}
