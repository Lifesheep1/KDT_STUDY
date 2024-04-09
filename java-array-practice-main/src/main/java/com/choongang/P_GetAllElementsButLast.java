package com.choongang;

import java.util.Arrays;

public class P_GetAllElementsButLast {
    public int[] getAllElementsButLast(int[] arr) {
        // TODO:
        // 항상 arr의 맨 뒤 요소만 지운 배열을 만들어야 함
        // arr=[1,2,3,4] -> result = [1,2,3]

        //결과를 담을 배열의 크기는 arr.length - 1;
        int[] result ;

        if(arr.length == 0){
            result = new int[]{};
        }else {
            result = new int[arr.length - 1];
            for(int i = 0; i < arr.length - 1; i++){
                result[i] = arr[i];
            }
        }
        return result;
    }
}
