package com.choongang;

import java.util.ArrayList;
import java.util.Iterator;

public class L_sumAllElements {
    public int sumAllElements(ArrayList<Integer> arrayList) {
        // TODO:
        int sum = 0;
        if(arrayList.isEmpty()){
            return 0;
        }
        for(int i = 0; i < arrayList.size(); i++){
            sum += arrayList.get(i);
        }
        return sum;
    }
}
