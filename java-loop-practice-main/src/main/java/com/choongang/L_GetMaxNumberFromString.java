package com.choongang;

public class L_GetMaxNumberFromString {
    public int getMaxNumberFromString(String str) {
        // TODO:
        int result = 0;
        for (int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            int num = Character.getNumericValue(c);

            if(num>result){
                result = num;
            }
        }
        return  result;
    }
}
