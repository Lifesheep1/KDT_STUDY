package com.choongang;

public class N_CharacterAndNumber {
    public String characterAndNumber(String word) {
        // TODO:
        String result = "";
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            result = result + c + i;
        }
        return result;
    }
}
