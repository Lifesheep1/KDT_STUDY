package com.choongang;

public class L_MergeArrays {
    public int[] mergeArrays(int[] arr1, int[] arr2) {
        // TODO:
        int[] result;
        result = new int[arr1.length + arr2.length];
//        result[arr1.length] = arr2[0];
//        result[arr1.length+1] = arr2[1];

        System.arraycopy(arr1, 0, result, 0, arr1.length);

        //반복문으로 작성
//        for(int i = 0; i < arr2.length; i++){
//            result[arr1.length+i] = arr2[i];
//        }
        System.arraycopy(arr2,0,result, arr1.length,arr2.length);


        return result;

    }
}
