package com.choongang;

public class B_GetLastElement {
    public int getLastElement(int[] arr) {
        // TODO:
        int result;
        if(arr.length == 0){
            result = -1;
        }else{
            result = arr[arr.length-1]; // []

        }

        return result;

    }
}
