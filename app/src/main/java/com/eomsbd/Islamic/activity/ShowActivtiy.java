package com.eomsbd.Islamic.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.eomsbd.Islamic.R;

public class ShowActivtiy extends AppCompatActivity implements View.OnClickListener {

    private Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_activtiy);

        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn4.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.button) {
            startActivity(new Intent(ShowActivtiy.this, buttonActivty.class));

        } else if (id == R.id.button2) {
            startActivity(new Intent(ShowActivtiy.this, Button2Activity.class));


        } else if (id == R.id.button3) {
startActivity(new Intent(ShowActivtiy.this, Button3Activity.class));
        } else if (id == R.id.button4) {
            startActivity(new Intent(ShowActivtiy.this, StartActivity.class));

        }
    }
}
