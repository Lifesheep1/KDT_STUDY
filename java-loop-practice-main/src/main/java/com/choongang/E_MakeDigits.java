package com.choongang;

public class E_MakeDigits {
    public String makeDigits(int num) {
        // TODO:
//        String result = "";
//        for(int i = 1; i<=num; i++){
//            result += i;
//        }
//        return result;
        StringBuilder result = new StringBuilder();// StringBuilder라는 도구를 사용해서 빈 문자열 만듬
        for(int i = 1; i<=num; i++){
            result.append(i); // i의 값을 문자열로 바꿔서 result에 더함
        }
        return result.toString();

    }
}
