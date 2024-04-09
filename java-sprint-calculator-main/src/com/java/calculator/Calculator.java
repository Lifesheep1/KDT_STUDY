package com.java.calculator;
import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("===Java Calculator===");

        Scanner input = new Scanner(System.in);
        /*
            요구 사항에 따라 간단한 계산기를 만들어주세요.
            1. 사용자의 입력으로 첫 번째 숫자, 연산자, 두 번째 숫자를 받아야 합니다.
            2. 연산자의 종류는 +, -, *, / 입니다.
            3. 소수점 연산을 수행할 수 있어야 합니다.
            4. 연산 결과를 콘솔에 출력 합니다.
        */
        // TODO...
        float result;
        boolean run =true;

        while(run){
        System.out.print("숫자를 입력해주세요: ");
        float num1 = Float.valueOf(input.nextLine());
        System.out.print("연산자를 입력해주세요: ");
        String op = input.nextLine();
        System.out.print("숫자를 입력해주세요: ");
        float num2 = Float.valueOf(input.nextLine());

            switch (op) {
                case "+" :
                    result = num1 + num2;
                    System.out.printf("결과값은 %.2f 입니다\n", result);
                    break;

                case "-" :
                    result = num1 - num2;
                    System.out.printf("결과값은 %.2f 입니다\n", result);
                    break;

                case "*" :
                    result = num1 * num2;
                    System.out.printf("결과값은 %.2f 입니다\n", result);
                    break;

                case "/" :
                    result = num1 / num2;
                    System.out.printf("결과값은 %.2f 입니다\n", result);
                    break;

                case null, default :
                    System.out.println("잘못된 입력입니다.");
                    run = false;

            }
        }
    }
}