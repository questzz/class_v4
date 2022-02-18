package com.example.myapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView zero;
    TextView one;
    TextView two;
    TextView three;
    TextView four;
    TextView five;
    TextView six;
    TextView seven;
    TextView eight;
    TextView nine;
    TextView ca;
    TextView plus;
    TextView result;

    String newValue = "0";
    String oldValue = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_01);
        initData();
        addEventListener();
    }

    private void initData() {
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        ca = findViewById(R.id.ca);
        plus = findViewById(R.id.plus);
        result = findViewById(R.id.result);
    }

    private void addEventListener() {
        zero.setOnClickListener(v -> {
            newValue = newValue + "0";
            result.setText(newValue);
        });
        one.setOnClickListener(v -> {
            newValue = newValue + "1";
            result.setText(newValue);
        });
        two.setOnClickListener(v -> {
            // 1 + 2 (기존에 사용했던 값을 가지고 오고 + 여기에서 들어가는 값 ( 2 )
            // "1" + "2" = "12"
            newValue = newValue + "2";
            result.setText(newValue);
        });
        three.setOnClickListener(v -> {
            newValue = newValue + "3";
            result.setText(newValue);
        });
        four.setOnClickListener(v -> {
            newValue = newValue + "4";
            result.setText(newValue);
        });
        five.setOnClickListener(v -> {
            newValue = newValue + "5";
            result.setText(newValue);
        });
        six.setOnClickListener(v -> {
            newValue = newValue + "6";
            result.setText(newValue);
        });
        seven.setOnClickListener(v -> {
            newValue = newValue + "7";
            result.setText(newValue);
        });
        eight.setOnClickListener(v -> {
            newValue = newValue + "8";
            result.setText(newValue);
        });
        nine.setOnClickListener(v -> {
            newValue = newValue + "9";
            result.setText(newValue);
        });

        ca.setOnClickListener(v -> {
            newValue = "0";
            oldValue = "0";
            result.setText(newValue);
        });
        plus.setOnClickListener(v -> {
            // 연산
            int number1 = Integer.parseInt(newValue);
            int number2 = Integer.parseInt(oldValue); //(""); --> number
            int sum = (number1 + number2);
            oldValue = String.valueOf(sum);
            newValue = "0";
            result.setText(oldValue);
        });
        result.setOnClickListener(v -> {});
    }
}













