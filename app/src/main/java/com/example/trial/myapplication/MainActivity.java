package com.example.trial.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClickSum(View view){
        EditText element1 = (EditText)findViewById(R.id.Num1);
        EditText element2 = (EditText) findViewById(R.id.Num2);
        TextView resText = (TextView) findViewById(R.id.Result);

        double number1 = Double.parseDouble(element1.getText().toString());
        double number2 = Double.parseDouble(element2.getText().toString());
        double resSum = number1 + number2;
        resText.setText(Double.toString(resSum));
    }

    public void onButtonClickMinus(View view){
        EditText element1 = (EditText)findViewById(R.id.Num1);
        EditText element2 = (EditText) findViewById(R.id.Num2);
        TextView resText = (TextView) findViewById(R.id.Result);

        double number1 = Double.parseDouble(element1.getText().toString());
        double number2 = Double.parseDouble(element2.getText().toString());
        double resSum = number1 - number2;
        resText.setText(Double.toString(resSum));
    }

    public void onButtonClickMultiply(View view){
        EditText element1 = (EditText)findViewById(R.id.Num1);
        EditText element2 = (EditText) findViewById(R.id.Num2);
        TextView resText = (TextView) findViewById(R.id.Result);

        double number1 = Double.parseDouble(element1.getText().toString());
        double number2 = Double.parseDouble(element2.getText().toString());
        double resSum = number1 * number2;
        resText.setText(Double.toString(resSum));
    }

    public void onButtonClickDivide(View view){
        EditText element1 = (EditText)findViewById(R.id.Num1);
        EditText element2 = (EditText) findViewById(R.id.Num2);
        TextView resText = (TextView) findViewById(R.id.Result);

        double number1 = Double.parseDouble(element1.getText().toString());
        double number2 = Double.parseDouble(element2.getText().toString());
        double resSum = number1 / number2;
        resText.setText(Double.toString(resSum));
    }
}
