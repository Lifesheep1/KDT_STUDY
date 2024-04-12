package javabasic;

import java.util.Scanner;

public class Example10 {
    /**
     * 사용자로부터 5명의 학생의 점수를 입력받아 배열에 저장한 다음, 평균 점수를 계산하여 출력하세요.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("5명의 학생의 점수를 입력하세요");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();

        int[] arr = {a,b,c,d,e};
        int sum = 0;
        int avg = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
            avg = sum/arr.length;
        }
        System.out.printf("평균 점수는 %d입니다.", avg);
    }
}
