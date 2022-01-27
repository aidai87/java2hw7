package com.example.java2hw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_Result;
    private Double firstVar;
    private Double secondVar;
    private Boolean isOperationClick;
    private String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_Result = findViewById(R.id.tv_result);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                setTv_Result("1");
                break;
            case R.id.btn_two:
                setTv_Result("2");
                break;
            case R.id.btn_three:
                setTv_Result("3");
                break;
            case R.id.btn_four:
                setTv_Result("4");
                break;
            case R.id.btn_five:
                setTv_Result("5");
                break;
            case R.id.btn_six:
                setTv_Result("6");
                break;
            case R.id.btn_seven:
                setTv_Result("7");
                break;
            case R.id.btn_eight:
                setTv_Result("8");
                break;
            case R.id.btn_nine:
                setTv_Result("9");
                break;
            case R.id.btn_zero:
                setTv_Result("0");
                break;
            case R.id.btn_clear:
                tv_Result.setText("0");
                firstVar = 0.0;
                secondVar = 0.0;
                break;
            case R.id.btn_point:
                setTv_Result(".");
                break;
            case R.id.btn_negative_number:
                setTv_Result("-");
                break;
        }
    }

    public void setTv_Result(String numbers) {
        if (tv_Result.getText().toString().equals("0")) {
            tv_Result.setText(numbers);
        } else if (isOperationClick) {
            tv_Result.setText(numbers);
        } else {
            tv_Result.append(numbers);
        }
        isOperationClick = false;
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_percent:
                setFirstVar();
                isOperationClick = true;
                operation = "%";
                break;
            case R.id.btn_plus:
                setFirstVar();
                isOperationClick = true;
                operation = "+";
                break;
            case R.id.btn_minus:
                setFirstVar();
                isOperationClick = true;
                operation = "-";
                break;
            case R.id.btn_multiplication:
                setFirstVar();
                isOperationClick = true;
                operation = "X";
                break;
            case R.id.btn_division:
                setFirstVar();
                isOperationClick = true;
                operation = "/";
                break;
            case R.id.btn_equals:
                setSecondVar();
                Double result = 0.0;
                switch (operation) {
                    case "%":
                        result = (firstVar / 100.0f);
                        tv_Result.setText(result.toString());
                        break;
                    case "+":
                        result = firstVar + secondVar;
                        tv_Result.setText(result.toString());
                        break;
                    case "-":
                        result = firstVar - secondVar;
                        tv_Result.setText(result.toString());
                        break;
                    case "X":
                        result = firstVar * secondVar;
                        tv_Result.setText(result.toString());
                        break;
                    case "/":
                        result = firstVar / secondVar;
                        tv_Result.setText(result.toString());
                        break;
                }
                break;
        }
    }

    public void setFirstVar() {
        firstVar = Double.parseDouble(tv_Result.getText().toString());
    }

    public void setSecondVar() {
        secondVar = Double.parseDouble(tv_Result.getText().toString());
    }
}