package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        ArrayList<Integer> listArr = new ArrayList<>();
        int count = 0;
        Scanner sc = new Scanner(System.in);

        int result = 0;

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

            /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
            switch (operator) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> result = num1 / num2;
                case "%" -> result = num1 % num2;
                default -> System.out.println("연산자가 없음");
            }
            System.out.println("결과:" + result);

            listArr.add(result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove = sc.next();
            if (remove.equals("remove")) {
                listArr.remove(0);
            }


            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.next();
            if (inquiry.equals("inquiry")) {
                for (int i = 0; i < listArr.size(); i++) {
                    System.out.println(listArr.get(i));
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            End = sc.next();
        }
        sc.close();
    }
}