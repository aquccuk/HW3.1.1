package com.aquccuk.a311calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView input, output;
    Button equal, add, minus, multy, divide, percent;

    int num1, num2, result;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input_screen);
        output = findViewById(R.id.output_screen);
        input.setText("0");
        equal = findViewById(R.id.btn_equal);
        add = findViewById(R.id.btn_add);
        minus = findViewById(R.id.minus);
        multy = findViewById(R.id.multy);
        divide = findViewById(R.id.divide);
        percent = findViewById(R.id.percent);
    }


    @SuppressLint("SetTextI18n")
    public void zero(View v) {
        if(input.getText().toString().equals("")){
            input.setText(input.getText()+"0");
        }
        if(input.getText().toString().equals("0")){
            input.setText((input.getText()+"."));
        }
        if(!input.getText().toString().equals("0")){
            input.setText(input.getText()+"0");
        }
    }

    @SuppressLint("SetTextI18n")
    public void one(View v) {
        if(input.getText().toString().equals("0")){
            input.setText("1");
        }
        else {
            input.setText(input.getText() + "1");
        }

    }

    @SuppressLint("SetTextI18n")
    public void two(View v) {
        if(input.getText().toString().equals("0")){
            input.setText("2");
        }
        else {
            input.setText(input.getText() + "2");
        }
    }

    @SuppressLint("SetTextI18n")
    public void three(View v) {
        if(input.getText().toString().equals("0")){
            input.setText("3");
        }
        else {
            input.setText(input.getText() + "3");
        }
    }

    @SuppressLint("SetTextI18n")
    public void four(View v) {
        if(input.getText().toString().equals("0")){
            input.setText("4");
        }
        else {
            input.setText(input.getText() + "4");
        }
    }

    @SuppressLint("SetTextI18n")
    public void five(View v) {
        if(input.getText().toString().equals("0")){
            input.setText("5");
        }
        else {
            input.setText(input.getText() + "5");
        }
    }

    @SuppressLint("SetTextI18n")
    public void six(View v) {
        if(input.getText().toString().equals("0")){
            input.setText("6");
        }
        else {
            input.setText(input.getText() + "6");
        }
    }

    @SuppressLint("SetTextI18n")
    public void seven(View v) {
        if(input.getText().toString().equals("0")){
            input.setText("7");
        }
        else {
            input.setText(input.getText() + "7");
        }
    }

    @SuppressLint("SetTextI18n")
    public void eight(View v) {
        if(input.getText().toString().equals("0")){
            input.setText("8");
        }
        else {
            input.setText(input.getText() + "8");
        }
    }

    @SuppressLint("SetTextI18n")
    public void nine(View v) {
        if(input.getText().toString().equals("0")){
            input.setText("9");
        }
        else {
            input.setText(input.getText() + "9");
        }
    }

    @SuppressLint("SetTextI18n")
    public void dot(View v) {
        input.setText(input.getText() + ".");

    }

    @SuppressLint("SetTextI18n")
    public void cleaner(View v) {
        input.setText("0");
        output.setText("");

    }
    @SuppressLint("SetTextI18n")
    public void percent(View v) {
        if (input.getText().toString().equals("0")) {
            input.setText(input.getText()+"");
        }
        if(!input.getText().toString().equals("0")&&!input.getText().toString().equals("%")){


            percent.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    num1= Integer.parseInt(input.getText().toString());
                    num2= Integer.parseInt(output.getText().toString());
                    output.setText(String.valueOf(num2/100));
                    input.setText("0");
                }
            });
            equal.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    num1= Integer.parseInt(input.getText().toString());
                    num2= Integer.parseInt(output.getText().toString());
                    output.setText(String.valueOf(num2/100));
                    input.setText("0");
                }
            });
        }
    }


    @SuppressLint("SetTextI18n")
    public void btnClick_add(View v) {
        if (input.getText().toString().equals("0")) {
            input.setText(input.getText()+"");
        }
        if(!input.getText().toString().equals("0")&&!input.getText().toString().equals("+")){
            output.setText(input.getText().toString());
            input.setText("");

            add.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    num1= Integer.parseInt(input.getText().toString());
                    num2= Integer.parseInt(output.getText().toString());
                    output.setText(String.valueOf(num1+num2));
                    input.setText("0");
                }
            });
            equal.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    num1= Integer.parseInt(input.getText().toString());
                    num2= Integer.parseInt(output.getText().toString());
                    output.setText(String.valueOf(num1+num2));
                    input.setText("0");
                }
            });
        }

    }

    @SuppressLint("SetTextI18n")
    public void subtract(View v) {
        if (input.getText().toString().equals("0")) {
            input.setText(input.getText()+"");
        }
        if(!input.getText().toString().equals("0")&&!input.getText().toString().equals("-")){
            output.setText(input.getText().toString());
            input.setText("");

            minus.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    num1= Integer.parseInt(input.getText().toString());
                    num2= Integer.parseInt(output.getText().toString());
                    output.setText(String.valueOf(num2-num1));
                    input.setText("0");
                }
            });
            equal.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    num1= Integer.parseInt(input.getText().toString());
                    num2= Integer.parseInt(output.getText().toString());
                    output.setText(String.valueOf(num2-num1));
                    input.setText("0");
                }
            });
        }
    }

    @SuppressLint("SetTextI18n")
    public void multiply(View v) {
        if (input.getText().toString().equals("0")) {
            input.setText(input.getText()+"");
        }
        if(!input.getText().toString().equals("0")&&!input.getText().toString().equals("x")){
            output.setText(input.getText().toString());
            input.setText("");

            multy.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    num1= Integer.parseInt(input.getText().toString());
                    num2= Integer.parseInt(output.getText().toString());
                    output.setText(String.valueOf(num2*num1));
                    input.setText("0");
                }
            });
            equal.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    num1= Integer.parseInt(input.getText().toString());
                    num2= Integer.parseInt(output.getText().toString());
                    output.setText(String.valueOf(num2*num1));
                    input.setText("0");
                }
            });
        }
    }

    @SuppressLint("SetTextI18n")
    public void divide(View v) {
        if (input.getText().toString().equals("0")) {
            input.setText(input.getText()+"");
        }
        if(!input.getText().toString().equals("0")&&!input.getText().toString().equals("/")){
            output.setText(input.getText().toString());
            input.setText("");

            divide.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    num1= Integer.parseInt(input.getText().toString());
                    num2= Integer.parseInt(output.getText().toString());
                    output.setText(String.valueOf(num2/num1));
                    input.setText("0");
                }
            });
            equal.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    num1= Integer.parseInt(input.getText().toString());
                    num2= Integer.parseInt(output.getText().toString());
                    output.setText(String.valueOf(num2/num1));
                    input.setText("0");
                }
            });
        }
    }

    @SuppressLint("SetTextI18n")
    public void equal(View v) {
    }
}