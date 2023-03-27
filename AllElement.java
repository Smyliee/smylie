package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AllElement {
    public static void main (String[]  args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(90);
        list.add(8);
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        list.removeAll(list);
//        for (int i = 0; i <= list.size(); i++) {
//            list.remove(i);
//        }
        System.out.println(list);
    }

}



