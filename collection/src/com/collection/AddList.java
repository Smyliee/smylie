package com.collection;


import java.util.*;

public class AddList {

    public static void main (String[]  args){
        List<String> list  = new ArrayList<>();
        list.add("car");
        list.add("bus");
        list.add("motorbike");
         Iterator itr = list.iterator();
         while(itr.hasNext()){
             System.out.println(itr.next());
         }

    }

}
