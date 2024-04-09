package com.choongang;

public class E_GetAllWords {
    public String[] getAllWords(String str) {
        // TODO:
        String[] strArray;
//        if(str.length() == 0){
//        if(str.isEmpty()) {
        if(str.equals("")) {
            strArray = new String[]{};
        } else {
        strArray = str.split(" ");
    }
        return strArray;
    }
}
