package com.choongang;

public class H_MakeMultiplesOfDigit {
    public String makeMultiplesOfDigit(int num) {
        // TODO:
        String result = "";
        for(int i = 3; i <= num; i = i +3){
            result += i;
        }
        return result;

    }
}
