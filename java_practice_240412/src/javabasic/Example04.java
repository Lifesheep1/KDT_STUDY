package javabasic;

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력해주세요.");
        double num1 = input.nextDouble();


        System.out.println("두번째 숫자를 입력해주세요.");
        double num2 = input.nextDouble();

        System.out.printf("두 수의 합은 %f 입니다.\n",add(num1, num2));
        System.out.printf("두 수의 차는 %f 입니다.\n",minus(num1, num2));
        System.out.printf("두 수의 곱은 %f 입니다.\n",multiply(num1, num2));
        if(num2 == 0){
            System.out.println("나눌 수 없는 수입니다.");
        }else{
            System.out.printf("두 수의 나누기는 %f 입니다.\n",devide(num1, num2));
        }
        if(num2 == 0){
            System.out.println("나눌 수 없는 수입니다.");
        }else{
            System.out.printf("두 수의 나머지는 %f 입니다.\n",remain(num1,num2));
        }



    }
    static double add(double num1, double num2){
        return num1 + num2;
    }
    static double minus(double num1, double num2){
        return num1 - num2;
    }
    static double multiply(double num1, double num2){
        return num1 * num2;
    }
    static double devide(double num1, double num2){
        return num1 / num2;
    }
    static double remain(double num1, double num2){
        return num1 % num2;
    }


}