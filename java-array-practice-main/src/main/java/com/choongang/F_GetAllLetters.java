package com.choongang;

public class F_GetAllLetters {
    public char[] getAllLetters(String str) {
        // TODO:
        //toCharArray메소드활용
//        char[] chars;
//        chars = str.toCharArray();
//
//        return chars;

        char[] chars = new char[str.length()];

        for(int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }
}
