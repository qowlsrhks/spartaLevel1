package org.example;

import org.example.level2.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);
        String End = "exti";

        while (!End.equals("exit")) {
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            System.out.print("사칙연산 기호를 입력하세요 ex) + - * / %: ");
            String operator = sc.next();

            calculator.calculate(num1, num2, operator);
            System.out.println("결과: " + calculator.list.get(0));


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            End = sc.next();
        }
        sc.close();
    }
}

