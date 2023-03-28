package com.collection;

import java.util.*;

public class Occurence {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("car");
        list.add("bus");
        list.add("motorbike");
        list.add("car");
        list.add("car");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        String item = "car";
        list.removeAll(Collections.singleton(item));
        System.out.println("After Removal");
        System.out.println(list);

    }
}




