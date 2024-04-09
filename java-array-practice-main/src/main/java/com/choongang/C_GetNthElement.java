package com.choongang;

public class C_GetNthElement {
    public int getNthElement(int[] arr, int index) {
        // TODO:
        int result;
        if(arr.length == 0){
            result = -1;
        } else if(index > arr.length - 1){
            result = -2;
        }else {
            result = arr[index];
        }

        return result;
    }
}
