package com.scanner;

import java.util.Scanner;

public class Words {
    public static void countWords(String str){
        String[] spliting = str.split(" ");
        int noOfWords = spliting.length;
        System.out.println(" String Entered by you have "+ noOfWords +" words in it");
        }


    public static void main (String[] args) {

        Scanner cw = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String str = cw.nextLine();
        System.out.println("YOUR String is  : "+str);
        countWords(str);

    }
}
