package com.choongang;

import java.util.Arrays;

public class A_getFirstElement {
    public int getFirstElement(int[] arr) {
        // TODO:
        int result;
        if(arr.length == 0){
            result = -1;
        }else{
            result = arr[0]; // []
        }
        return result;
    }

}
