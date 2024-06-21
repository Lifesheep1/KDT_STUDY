package com.choongang;

public class D_RepeatString {
    public String repeatString(String str, int num) {
        // TODO:
        String result = "";
        for(int i = 0; i< num; i++){
            result += str;
        }
        return result;
    }
}
