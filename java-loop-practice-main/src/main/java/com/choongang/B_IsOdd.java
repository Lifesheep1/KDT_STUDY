package com.choongang;

public class B_IsOdd {
    public boolean isOdd(int num) {
        // TODO:
        if(num<0){
            num = -num;
        }

        while (num>0){
            if(num == 1){
                return true;
            }
            num -= 2;
        }
        return false;
    }
}
