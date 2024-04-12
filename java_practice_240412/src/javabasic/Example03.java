package javabasic;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        /**
         * 사용자로부터 이름과 나이를 입력받아,
         * 그 정보를 화면에 출력하는 간단한 프로그램을 작성하세요.
         *
         * 이름은 숫자가 들어오면 안됩니다.
         * 나이는 숫자만 들어와야 합니다.
         */
//          1.이름과 나이를 입력받음
//          콘솔로 입력 받아야 함. 총 2개의 변수가 필요
//          이름과 나이, 나이는 숫자?
//          일단 숫자 검증은 미루고, 데이터를 올바르게 받고 출력하는것부터 구현
//          이름과 나이를 받을 수 있는 변수를 선언
//          콘솔 입력을 위한 SCanner 객체 생성
//          스캐너 객체를 사용하여 이름을 입력받음
//          이름은 문자열 -> nextLine()
//          스캐넌 객체를 사용하여 이름을 입력받음
//          이름은 문자열 -> nextLine()

        Scanner scan = new Scanner(System.in);

        System.out.println("이름을 입력해주세요.");
        String name = scan.nextLine();

        if(!isNameString(name)){
            System.out.println("잘못된 입력입니다.");
            return;
        }else{
            System.out.printf("%s\n", name);
        }
        System.out.println("나이를 입력해주세요.");
        String age = scan.nextLine();

        if(isValidDigitString(age) && validate(Integer.parseInt(age))){
            System.out.printf("%s",age);
        }else {
            System.out.println("잘못된 입력입니다.");
        }


    }
    public static boolean validate(int age){
        if(age<=0){
            return false;
        }else {
            return true;
        }
    }
    public static boolean isValidDigitString(String age){
        String digit = "1234567890";
        for(char c: age.toCharArray()){
            if(digit.indexOf(c) == -1){
                return false;
            }
        }
        return true;
    }

    public static boolean isNameString(String name){
        String digit = "1234567890";
        for(char c: name.toCharArray()){
            if(digit.indexOf(c) == -1){
                return true;
            }
        }
        return false;
    }

}
