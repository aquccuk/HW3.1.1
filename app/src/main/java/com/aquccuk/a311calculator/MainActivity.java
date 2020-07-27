package com.aquccuk.a311calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

TextView output;
Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,btnDot;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output_screen);



        }
        @SuppressLint("SetTextI18n")
        public void zero(View v){
        output.setText(output.getText()+"0");
        }
        @SuppressLint("SetTextI18n")
        public void one(View v){
        output.setText(output.getText()+"1");
        }
        @SuppressLint("SetTextI18n")
        public void two(View v){
        output.setText(output.getText()+"2");
        }
        @SuppressLint("SetTextI18n")
        public void three(View v){
        output.setText(output.getText()+"3");
        }
        @SuppressLint("SetTextI18n")
        public void four(View v){
        output.setText(output.getText()+"4");
        }
        @SuppressLint("SetTextI18n")
        public void five(View v){
        output.setText(output.getText()+"5");
        }
        @SuppressLint("SetTextI18n")
        public void six(View v){
        output.setText(output.getText()+"6");
        }
        @SuppressLint("SetTextI18n")
        public void seven(View v){
        output.setText(output.getText()+"7");
        }
        @SuppressLint("SetTextI18n")
        public void eight(View v){
        output.setText(output.getText()+"8");
        }
        @SuppressLint("SetTextI18n")
        public void nine(View v){
        output.setText(output.getText()+"9");
        }
        @SuppressLint("SetTextI18n")
        public void dot(View v){
        output.setText(output.getText()+".");
    }

}