package javabasic;

import java.util.Arrays;

public class Example09 {
    /**
     * 10개의 정수 값을 저장할 수 있는 배열을 생성하고, 1부터 10까지의 값을 배열에 저장한 후, 이를 출력하세요.
     */
    public static void main(String[] args) {
        int[] arr = new int[55];
        for(int i = 0; i<arr.length; i++){
            arr[i] = i + 1;
        }

//        System.out.println(arr); // 메모리의 주소값이 출력됨
        System.out.println(Arrays.toString(arr)); //배열 내용 출력하기

    }
}
