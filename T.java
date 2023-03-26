package com.opps;

public class T {
    int x = 10;
    static int y =99;

    public static void main(String[] args) {
        T obj1 = new T();
        obj1.x =50;
        obj1.y=obj1.x;
        System.out.println(T.y);//50

        T obj2 = obj1;
        System.out.println(obj2.x);//50
    }
}
