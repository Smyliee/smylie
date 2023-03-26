package com.scanner;

import java.util.Scanner;

public class FrequentChar {
    static void countFrequentChar(String str) {
        int z = str.length();
        int [] count = new int[127];
        for (int i =0 ; i<=z-1 ;i++){
            count [str.charAt(i)]++;
            }
        int max = 0;
        char p = ' ';
        for(int i =0;i<=z-1;i++)
        {
            if(max < count[str.charAt(i)]){
                max=count[str.charAt(i)];
                 p = str.charAt(i);
            }
        }
        System.out.println("Character "+p +" occurs most frequent times that is " + max);

    }
    public static void main (String[] args) {

        Scanner cw = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String str = cw.nextLine();
        System.out.println("YOUR String is  : "+str);
       countFrequentChar(str);

    }
}
