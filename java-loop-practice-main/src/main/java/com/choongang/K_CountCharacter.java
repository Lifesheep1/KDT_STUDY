package com.choongang;

public class K_CountCharacter {
    public int countCharacter(String str, char letter) {
        // TODO:
        int count = 0;
        for (int i = 0; i<str.length(); i++){
            if(letter == str.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
