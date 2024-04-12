package javabasic;

import java.util.Scanner;

public class Example06 {
    /**
     * 사용자로부터 숫자를 하나 입력받아, 이 숫자가 양수인지, 음수인지, 아니면 0인지를 판단하여 출력하는 프로그램을 작성하세요.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("숫자를 하나 입력하세요.");
        double num1 = scan.nextDouble();

        if(num1 > 0){
            System.out.printf("숫자 %f는 양수입니다",num1);
        } else if(num1 ==0){
            System.out.printf("숫자 %f는 0입니다",num1);
        } else {
            System.out.printf("숫자 %f는 음수입니다",num1);
        }


    }
}
