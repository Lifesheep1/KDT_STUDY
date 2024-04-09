package com.choongang;

import java.util.Arrays;

public class S_Fibonacci {
//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(new int[10]));
//    }
    public int[] fibonacci(int num) {
        // TODO:
        int[] result;
        if(num == 0) {
            result = new int[]{0};
        }else {
            result = new int[num + 1];

            result[0] = 0;
            result[1] = 1;

            for(int i = 2; i <= num; i++){
                result[i] = result[i-2] + result[i-1];
            }
        }

        return result;
    }
}
