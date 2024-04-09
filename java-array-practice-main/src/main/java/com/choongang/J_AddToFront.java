package com.choongang;

public class J_AddToFront {
    public int[] addToFront(int[] arr, int el) {
        // TODO:
        int[] result;
        result = new int[arr.length + 1];

        result[0] = el; //el이 result의 맨 처음값

        //반복문으로 풀어보기
        // result[1] = arr[0]
        // result[2] = arr[1]
        // result[result.length -1] = arr[result.length -2]

//        for(int i = 0; i < result.length -1; i++){
//            result[i+1] = arr[i];
//        }

        System.arraycopy(arr, 0, result, 1, arr.length);


        return result;

    }
}
