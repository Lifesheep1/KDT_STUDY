package com.jungmin;

public class H_MiniCalculator {
    public int miniCalculator(int num1, int num2, char operator) {
        // TODO:
        int result;
        switch (operator){
            case'+':
                result = num1 + num2;
                break;
            case'-':
                result = num1 - num2;
                break;
            case'*':
                result = num1 * num2;
                break;
            case'/':
                result = num1 / num2;
                break;
            case'%':
                result = num1 % num2;
                break;
            default:
                result =0;
        }
        return result;
    }
}
