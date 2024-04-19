package com.choongang;

import java.util.ArrayList;
import java.util.Arrays;

public class I_removeFromBackOfNew {
    public ArrayList<Integer> removeFromBackOfNew(ArrayList<Integer> arrayList) {
        // TODO:
        if(arrayList.isEmpty()){
            return null;
        }
        arrayList.remove(arrayList.size()-1);
        return arrayList;
    }
}
