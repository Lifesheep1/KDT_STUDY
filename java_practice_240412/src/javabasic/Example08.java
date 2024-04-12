package javabasic;

import java.util.Scanner;

public class Example08 {
    /**
     * 사용자로부터 숫자 n을 입력받아, 1부터 n까지의 합을 계산하여 출력하는 프로그램을 작성하세요.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int result = 0;
        
        System.out.println("숫자를 입력하세요.");
        int num = scan.nextInt();
        
        for(int i = 1; i<=num; i++){
            result += i;
        }

        System.out.printf("숫자 n까지의 합은 %d입니다.",result);
        
    }
}
