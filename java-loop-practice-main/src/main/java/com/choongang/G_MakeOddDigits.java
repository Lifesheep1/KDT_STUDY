package com.choongang;

public class G_MakeOddDigits {
    public String makeOddDigits(int num) {
        // TODO:
        String result = "";

        int count = 0;
        int i = 1;
        while (count < num){
            result = result + i;
            i = i + 2;
            count++;
        }
        return result;
    }
}
