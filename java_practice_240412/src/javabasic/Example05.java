package javabasic;

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("세 개의 다른 정수들을 입력하세요.");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        System.out.printf("제일 큰 정수는 %d 입니다\n", num1>num2 ? (num1>num3?num1:num3) : (num2>num3?num2:num3));
        System.out.printf("제일 작은 정수는 %d 입니다", num1<num2 ? (num1<num3?num1:num3) : (num2<num3?num2:num3));

    }
}
