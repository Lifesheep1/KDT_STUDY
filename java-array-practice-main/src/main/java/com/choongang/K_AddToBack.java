package com.choongang;

public class K_AddToBack {
    public int[] addToBack(int[] arr, int el) {
        // TODO:
        int[] result;
        result = new int[arr.length + 1];
        result[arr.length] = el;
//        for(int i = 0; i < arr.length; i++){
//            result[i] = arr[i];
//        }
        System.arraycopy(arr, 0, result, 0, arr.length);

        return result;
    }
}