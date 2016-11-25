package com.example.tbr.lv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTrueButton = (Button) findViewById(R.id.next_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, NextActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });

        mTrueButton = (Button) findViewById(R.id.forget_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                    R.string.incorrect_toast,
                    Toast.LENGTH_SHORT).show();

            }
        });
        mFalseButton = (Button) findViewById(R.id.loin_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {   Toast.makeText(MainActivity.this,
                    R.string.correct_toast,
                    Toast.LENGTH_SHORT).show();
            }
        });
    }
}

