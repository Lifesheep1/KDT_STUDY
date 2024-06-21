package com.choongang;

public class C_Factorial {
    public int factorial(int num) {
        // TODO:
        int result = 1;
        for(int i=1; i<=num; i++){
            result = result * i;
        }
        return result;
    }
}
