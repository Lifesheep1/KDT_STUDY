package com.choongang;
import java.util.*;

public class B_getNthElement {
    public Integer getNthElement(ArrayList<Integer> arrayList, int index) {
        // TODO:
        if(arrayList.isEmpty() || arrayList.size() < index + 1){
            return null;
        }
        else {
            return arrayList.get(index);
        }

    }
}
