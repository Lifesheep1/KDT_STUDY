package com.choongang;

public class J_FindTheBug {
    public int findTheBug(String word) {
        // TODO:
        int index = -1;

        for(int i = 0; i< word.length(); i++){//word길이만큼 순회
            if('#' == word.charAt(i)){
                index =  i;
            }
        }
        return index;
    }
}
