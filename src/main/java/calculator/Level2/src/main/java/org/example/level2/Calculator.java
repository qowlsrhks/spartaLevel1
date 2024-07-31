package org.example.level2;

import java.util.ArrayList;

public class Calculator {

    public ArrayList<Double> list = new ArrayList<>();


    public void calculate(double num1, double num2, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("연산자가 없음");
        }

        list.add(result);
    }
}

